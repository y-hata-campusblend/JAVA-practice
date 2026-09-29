//オブジェクトを配列で扱う

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
        System.out.println("ナンバーを"+num+"、ガソリン量を"+gas);
    }
    public void show(){
        System.out.println("車のナンバーは"+num);
        System.out.println("ガソリン量は"+gas);
    }
}

class Sample9
{
    public static void main(String[] args)
    {
        Car[] cars = new Car[3]; //配列準備。型名「」名前＝new　型名「個数」

        for(int i =0; i<cars.length; i++){
            cars[i] = new Car(); //オブジェクトを3つ作成して繰り返しで代入
        }
        cars[0].setCar(1234,20.5);
        cars[1].setCar(4567,30.5);
        cars[2].setCar(6789,40.5);

        for(int i =0; i<cars.length; i++){
            cars[i].show();
        }
    }
}
