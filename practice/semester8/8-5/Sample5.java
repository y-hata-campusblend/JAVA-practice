//車クラス

class Car
{
    int num;
    double gas;

    void setNumGas(int n, double g){//引数は受け取るもの！
        num = n;
        gas = g;
        System.out.println("車のナンバーを"+num+"、ガソリン量を"+gas+"にしました。");
    }

    void show()
    {
        System.out.println("車のナンバーは"+num+"です。");
        System.out.println("ガソリン量は"+gas+"です。");
    }
}

class Sample5
{
    public static void main(String[] args)
    {
        Car car1 = new Car();//carクラスに接続する変数作るよお

        int number = 1234;
        double gasoline = 20.5;

        car1.setNumGas(number,gasoline); //2つの実引数を渡しちゃうよお、あとメソッド機能してねえのコード。carクラスで二個仮引数有るので、2個入れないと機能しないよ

        /*// ① 引数2個のバージョン
    void setNumGas(int n, double g){
        num = n;
        gas = g;
    }

    // ② 引数1個（intのみ）のバージョン：ナンバーだけ設定
    void setNumGas(int n){
        num = n;
    }

    // ③ 引数1個（doubleのみ）のバージョン：ガソリンだけ設定
    void setNumGas(double g){
        gas = g;
    }
}*/
    }
}