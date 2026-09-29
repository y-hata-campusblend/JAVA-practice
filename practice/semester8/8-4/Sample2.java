//メソッドを呼び出す

//車クラス
class Car
{
    int num;
    double gas;
    //↑フィールド

    void show()
    {
        System.out.println("車のナンバーは"+num+"です。");
        System.out.println("ガソリン量は"+gas+"です。");
        //numやgasはCar classの中で宣言されてるから、Car classの中ではthis.car,this.gasっていうこともある
    }
}

class Sample2
{
    public static void main(String[] args)
{
    Car car1;
    car1 = new Car();

    car1.num = 1234;
    car1.gas = 20.5;
    //クラス外では、carクラスの変数であるcar1.をつけなきゃだめよ＝フィールドもメソッドも！

    car1.show();
    car1.show();
}
}