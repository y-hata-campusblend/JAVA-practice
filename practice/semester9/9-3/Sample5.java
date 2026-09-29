//コンストラクタが呼び出される

//車クラス
class Car
{
    private int num;
    private double gas;

    //コンストラクタの定義！！オブジェクト読み込まれた瞬間に出力されるよ
  /*  public Car(){
        num = 0;
        gas = 0.0;
        System.out.println("車を作成しました。");} */

    public void show(){
        System.out.println("車のナンバーは"+num+"です。");
        System.out.println("ガソリン量は"+gas+"です。");
    }
}

class Sample5
{
    public static void main(String[] args)
    {
        Car car1 = new Car();

        car1.show();
    }
}

//コンストラクタで０，０．０って設定しなくても、初期値が0で設定される！