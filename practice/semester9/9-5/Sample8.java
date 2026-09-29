//クラス変数・クラスメソッドを記述する

class Car
{
    public static int sum = 0;//クラス変数の設定

    private int num;
    private double gas;

    public Car()
    {
        num = 0;
        gas = 0.0;
        sum++; //オブジェクト作るたびにこのコンストラクタが動くからsumが増える
        System.out.println ("車を作成しました。");
    }
    public void setCar(int n, double g)//voidは呼び出し元に戻す値がない場合！
    {
        num = n;
        gas = g;
        System.out.println("ナンバーを"+num+"にガソリン量を"+gas+"にしました。");
    }
    public static void showsum(){
        System.out.println("車は全部で"+sum+"台あります");
    }
    public void show()
    {
        System.out.println("車のナンバーは"+num+"です。");
        System.out.println("ガソリン量は"+gas+"です。");
    }
}

class Sample8
{
    public static void main(String[] args)
    {
        Car.showsum();

        Car car1 = new Car();
        car1.setCar(1234,20.5);

        Car.showsum();

        Car car2 = new Car();
        car2.setCar(4567,30.5);

        Car.showsum();
    }
}

