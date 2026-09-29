//メンバへのアクセスを制限する

//車クラス

class Car
{
    private int num;
    private double gas;

    /*変数を private（非公開）にすることで、直接データをいじれなくし、
    必ず setNumGas というチェック機能付きの窓口（public なメソッド）を通さなければ変更できない状態 にします。*/

    public void setNumGas(int n, double g)
    {
        if(g>0 && g<1000){//この条件の時だけ保存を許可ってこと
            num = n;
            gas = g;
            System.out.println("ナンバーを"+num+"にガソリン量を"+gas+"にしました");
        }
        else{
            System.out.println(g+"は正しいガソリン量ではありません。");
            System.out.println("ガソリン量を変更できませんでした。");
        }
    }
    public void show(){
        System.out.println("車のナンバーは"+num+"です。");
        System.out.println("ガソリン量は"+gas+"です。");
    }
}

class Sample1
{
    public static void main(String[] args)
    {
        Car car1 = new Car();

        /*このようなアクセスはできなくなります。
        car1.num = 1234;
        car1.gas = -10.0;
         */

        car1.setNumGas(1234,20.5);
        car1.show();

        System.out.println("正しくないガソリン量（-10.0）を指定してみます。");

        car1.setNumGas(1234,-10.0);
        car1.show();
    }
}