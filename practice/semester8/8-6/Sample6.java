//戻り値をもつメソッド

//車クラス

class Car
{
    int num;
    double gas;

    /*戻り値を持つものは型が必要。void使わないからreturnが必要void
     ➔ 「何も持って戻らないよ（手ぶらだよ）」という合図
    //int / double ➔ 「この型のデータを手に持って戻るよ」という約束*/
    int getNum(){
        System.out.println("ナンバーを調べました");
        return num;//numも戻すことによって、1234も戻されるよ！ってこと！！！
    }

    double getGas(){
        System.out.println("ガソリン量を調べました");
        return gas;
    }

    //戻り値を持たない場合は、｛｝の最後までやってから戻る。「void　変数名」をつかうこと！
    void setNumGas(int n, double g){
         num = n;
         gas = g;
         System.out.println("車のナンバーを"+num+"、ガソリン量を"+gas+"にしました");
    }

    void show(){
        System.out.println("車のナンバーは"+num+"です。");
        System.out.println("ガソリン量は"+gas+"です。");
    }
}

class Sample6
{
    public static void main(String[] args)
    {
        Car car1 = new Car();

        car1.setNumGas(1234,20.5);

        int number = car1.getNum();
        double gasoline = car1.getGas();

        System.out.println("サンプルから車を調べたところ");
        System.out.println("ナンバーは"+number+"ガソリン量は"+gasoline+"でした");
    }
}