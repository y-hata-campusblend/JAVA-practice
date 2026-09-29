//equals()メソッドを使う。

class Car
{
    protected int num;
    protected double gas;

    public Car()
    {
        num = 0;
        gas = 0.0;
        System.out.println("車を作成しました。");
    }
}
class Sample8
{
    public static void main(String[] args)
    {
        Car car1 = new Car();
        Car car2 = new Car();

        Car car3;
        car3 = car1;

        boolean bl11 = car1.equals(car2);
        boolean bl12 = car1.equals(car3);

        if(bl11 == true ){
            System.out.println("car1とcar2が同じか調べたところ同じでした。");
        }else{
            System.out.println("car1とcar2が同じか調べたところ違いました。");
        }
        if (bl12 == true){
            System.out.println("car1とcar3が同じか調べたところ同じでした。");
        }else{
            System.out.println("car1とcar3が同じか調べたところ違いました。");
        }
    }
}