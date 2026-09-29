//引数にクラス型の変数を使う

//車クラス

class Car
{
    private int num;
    private double gas;
    private String name; //クラス型の変数もフィールドになれる

    public Car()
{
    num = 0;
    gas = 0.0;
    name = "名無し";
    System.out.println("車を作成しました");
}
public void setCar(int n , double g)
{
    num = n;
    gas = g;
    System.out.println("ナンバーを"+num+"、ガソリン量を"+gas+"に設定しました。");
}
public void setName(String nm){ //クラス型の変数も仮引数になれる！
    name = nm;
    System.out.println("名前を"+name+"にしました。");
}
public void show()
{
    System.out.println("車のナンバーは"+num);
    System.out.println("ガソリン量は"+gas);
    System.out.println("名前は"+name);
}
}

class Sample8
{
    public static void main(String[] args)
    {
        Car car1 = new Car();

        car1.show();

        int number = 527;  //勝手に八進数になってしまうので、String型にするのがいいよ
        double gasoline = 20.5;
        String str = "きなこ号";

        car1.setCar(number, gasoline); //ナンバーだけ入力したい、二つとも一気に入力させたいときは、car classにオーバーロードしよう、ナンバーのみ用、ガソリンのみ用とかね
        car1.setName(str);

        car1.show();
    }
}

//クラスは設計図！　実際のナンバーとかガソリン量がcar1の正体。

//基本型は値渡し＝numberにある527コピーしてnに渡す。　setCarの中でn=99とかえても元のnumberは527のまま。
//クラス型は住所、参照のコピー＝参照渡し　共有URLを2人で持ってる状態。書き換えたら書き換わる。