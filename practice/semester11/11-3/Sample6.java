//スーパークラスの配列を利用する
//車クラス
class Car
{
    protected  int num;
    protected double gas;

    public Car()
    {
        num = 0;
        gas = 0.0;
        System.out.println("車を作成しました");
    }
    public void setCar(int n,double g)
    {
        num = n;
        gas = g;
        System.out.println("ナンバーを"+num+"ガソリン量を"+gas+"にしました。");
    }
    public void show()
    {
        System.out.println("車のナンバーは"+num+"です。");
        System.out.println("ガソリン量は"+gas+"です。");
    }
}
//レーシングカークラス
class RacingCar extends Car
{
    private int course;

    public RacingCar()
    {
        course = 0;
        System.out.println("レーシングカーを作成しました。");
    }
    public void setCourse(int c)
    {
        course = c;
        System.out.println("コース番号を"+course+"にしました。");
    }
    public void show(){
        System.out.println("レーシングカーのナンバーは"+num+"です。");
        System.out.println("ガソリン量は"+gas+"です。");
        System.out.println("コース番号は"+course+"です。");
    }
}
class Sample6 {
    public static void main(String[] args) {
        Car[] cars = new Car[2]; //配列の準備

        cars[0] = new Car();//配列の宣言をした際に、carsの型名は言い終わってるから、こっちではつけない。なんなら、一回しか行っちゃだめだからもうつけれない。宣言時のみ変数の宣言ができる。
        cars[0].setCar(1234,20.5);

        cars[1] = new RacingCar();
        cars[1].setCar(4567, 30.5);

        for (int i = 0; i < cars.length; i++) {
            cars[i].show();
        }
    }
}
/*
車を作成しました   carクラスのやつ
ナンバーを1234ガソリン量を20.5にしました。　セットカー
車を作成しました　レーシングカーの実態持ってるけどカークラス型だからこっち表示されて
レーシングカーを作成しました。　コンストラクタの表示
ナンバーを4567ガソリン量を30.5にしました。　カークラスのやつ
車のナンバーは1234です。　カークラスのやつ
ガソリン量は20.5です。
レーシングカーのナンバーは4567です。　サブクラスのおーばーらいど
ガソリン量は30.5です。
コース番号は0です。」★オーバーライドした場合、オブジェクトの本体、コンストラクタを呼び出したほう、メモリがnewで作られたほうの処理がされる！！！！
*

ボタンはスーパークラスでも、本体がサブクラスのものなら、オーバーライドしてるときは本体のほうが優先される
けど、サブクラス内にしかないメソッドは処理できないのね。

まとめて捜査したときに、それぞれの個性を生かして動かせうる。柔軟性のためにサブクラスが優先される！！
*
*
*
* */