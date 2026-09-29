//引数を持つメソッドを引き出す

class Car
{
    int num;
    double gas;

    void setNum(int n)//値を受け取る仮の引数
    {
        num = n;
        System.out.println("車のナンバーを"+num+"にしました。");
    }

    void setGas(double g)
    {
        gas = g;
        System.out.println("ガソリンの量を"+gas+"にしました。");
    }
}

class Smaple4
{
    public static void main(String[] args)throws IOException
    {
        Car car1 = new Car();

        car1.setNum(tmp);//n=1234
        car1.setGas(tmp);
        //実印数として１２３４を渡して呼び出す

        /* int number =1234;
           double gasoline =20.5;

         car1.setNum(number);
         car1.setGas(gasoline);    っていう風に変数を実印数として使うこともできるよ。
         */
    }
}

/*１２３４をサンプル4のcar1.setnum（）でcar1（カークラスにつながっている変数）へ渡す+setnumを実行させてるってこと.car1.setnumはいわばスイッチみたいなもの */