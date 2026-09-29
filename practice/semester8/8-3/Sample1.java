//車クラス
class Car
{
    int num;
    double gas;
}

class Sample1
{
    public static void main(String[] args)
    {
        Car car1 = new Car();

        car1.num = 1234;
        car1.gas = 20.5;

        Car car2 = new Car();//二個目作る時もいちいちオブジェクト作成を忘れずに！
        car2.num= 527;
        car2.gas= 100.52;

        System.out.println("車のナンバーは"+car1.num+"と"+car2.num+"で、ガソリン量は"+car1.gas+"と"+car2.gas+"です。");
    }
}