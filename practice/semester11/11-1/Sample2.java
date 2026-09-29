//車クラス
class Car
{
    private int num;
    private double gas;

    public Car()
    {
        num = 0;
        gas = 0.0;
        System.out.println("車を作成しました。");
    }
    public Car(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("ナンバーが"+num+"ガソリン量が"+gas+"の車を作成しました。");
    }
    public void setCar(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("ナンバーを"+num+"ガソリン量"+gas+"にしました。");
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
    public RacingCar(int n, double g, int c)
    {
        super(n,g); //既存のクラス、スーパークラスであるCarクラスの引数付きのコンストラクタをここで使える。並び順と個数しか見てないから、必ずしもすスーパークラスと同じ仮引数でなくても可
        course = c;
        System.out.println("コース番号"+course+"のレーシングカーを作成しました。");
    }
    public void setCourse(int c)
    {
        c = course;
        System.out.println("コース番号を"+course+"にしました。");
    }
}
class Sample2
{
    public static void main(String[] args)
    {
        RacingCar rccar = new RacingCar(1234,20.5,5);
    }
}