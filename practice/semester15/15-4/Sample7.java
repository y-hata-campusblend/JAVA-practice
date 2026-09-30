//スレッドによっておこる矛盾！！失敗例

//会社クラス
class Company
{
    private int sum = 0;
    public void add(int a)
    {
        int tmp = sum; //tmpに合計金額代入して、sumの金額を増やす
        System.out.println("現在の合計額は"+sum+"円です。");
        System.out.println(a+"円稼ぎました。");
        tmp = tmp + a;
        System.out.println("合計額を"+tmp+"円にします。");
        sum = tmp;
    }
}
//運転手クラス
class Driver extends Thread
{
    private Company comp; //new Driver(cmp) の時点ですでにコンストラクタの呼び出し（準備）は完了していて、start() は「作業開始の合図（run() の呼び出し）」だから。

    public Driver(Company c)
    {
        comp = c;  //ドライバークラスのなかでのcompany型の変数
        //compとして渡された引数を残しておかないと、runの時点で消えてしまう
    }
    public void run()
    {
        for(int i=0; i<3; i++){
            comp.add(50);
        }
    }
}
class Sample7
{
    public static void main(String[] args)
    {
        Company cmp = new Company(); //mainクラスの中のcompany型の変数

        Driver drv1 = new Driver(cmp); //金庫の場所はcmpだよって渡してる
        drv1.start();

        Driver drv2 = new Driver(cmp);
        drv2.start();
    }
}

/*🏁【スタート】まず一番下の main から始まる！
① main メソッド開始（ここが本当の1行目！）

② Company cmp = new Company();
👉 ここで上の Company クラス（金庫）を1つ組み立てる。

③ Driver drv1 = new Driver(cmp);
👉 上の Driver のコンストラクタ public Driver(Company c) に飛ぶ！
👉 受け取った cmp を自分の comp に保存して、main に戻ってくる。

🏃【中盤】運転手をスタートさせる
④ drv1.start();
👉 ここで上の Driver の public void run() にワープ！
👉 運転手1が「50円稼いだ！」と Company の add() を呼び出しに上へ飛ぶ。

⑤ Driver drv2 = new Driver(cmp);
👉 （main に戻ってきて）2人目の運転手を組み立てる。

⑥ drv2.start();
👉 2人目の運転手もワープして run() を動かし始める！