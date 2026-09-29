//p382 q4

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
    public void setCar(int n, double g){
        num = n;
        gas = g;
        System.out.println("ナンバーを"+num+"にガソリン量を"+gas+"にしました。");
    }
    public String toString(){
        String str = "ナンバー："+num+"\t"+"ガソリン量："+gas;
        return str;
    }
}
class Sample2
{
    public static void main(String[] args){
        Car car1 = new Car();

        car1.setCar(1234,20.5);

        System.out.println(car1);

        //String str = "車は" + car1;
        //System.out.println(str);　→出力が、　車は＋car1の内容ってなる。
        //オーバーライドすると便利
}
}