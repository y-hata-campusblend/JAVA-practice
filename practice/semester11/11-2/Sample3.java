//protectedメンバにアクセスする

//車クラス
class Car
{
    protected int num;
    protected double gas;

    public Car()
    {
        num = 0;
        gas = 0.0;
        System.out.println("車を作成しました。");
    }
    public void setCar(int n, double g)
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

    public void setCourse(int c)
    {
        course = c;
        System.out.println("コース番号を"+course+"にしました。");
    }
    public RacingCar()
    {
        course = 0;
        System.out.println("レーシングカーを作成しました。");
    }
    public void newshow()
    {
        System.out.println("レーシングカーのナンバーは"+num+"です。");//スーパークラスのprotedtedメンバにアクセスができる！！
        System.out.println("ガソリン量は"+gas+"です。");
        System.out.println("コース番号は"+course+"です。");
    }
}
class Sample3
{
    public static void main(String[] args)
    {
        RacingCar rccar1 = new RacingCar();//住所代入します！

        rccar1.newshow();
    }
}
/*
車を作成しました。 --- 勝手に引数なしのスーパークラスのコンストラクタが呼び出される.super(引数)の書き方で、呼び出せるやつ買えられるよ
レーシングカーを作成しました。
レーシングカーのナンバーは0です。  protectedだからnumもサブクラスで呼び出せる
ガソリン量は0.0です。
コース番号は0です。
*/