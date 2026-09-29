//クラス内でメソッドを呼び出す

//車クラス

class Car
{
    int num;
    double gas;
    //フィールドつくり

    void show(){
        System.out.println("車のナンバーは"+num+"です。");
        System.out.println("ガソリン量は"+gas+"です。");
    }

    void showCar(){

        System.out.println("これから車の情報を表示します。");
        show(); //自分自身、class Carの中のshowメソッドを呼び出してる。class Carの中だからshowのみ。this.showでもおｋ！
    }
}

class Sample3
{
    public static void main(String[] args)
    {
        Car car1 = new Car();
        //オブジェクトつくり

        car1.num = 1234;
        car1.gas = 20.5;

        car1.showCar();
        //showCarのメソッドを呼び出してる
    }
}