//スレッドを一時停止する

class Car extends Thread
{
    private String name;

    public Car(String nm)
    {
        name = nm;
    }
    public void run()
    {
        for(int i=0; i<5; i++){
            try{
                sleep(1000); //sleepメソッドは（）内に指定したミリ秒数だけ処理が一時停止する。threadクラスに所属するstaticメソッド！
                System.out.println(name+"の処理をしています。");
            }
            catch(InterruptedException e){} //sleepメソッドから送出される可能性のある例外
        }
    }
}
class Sample3
{
    public static void main(String[] args)
    {
        Car car1 = new Car("1号車");
        car1.start();

        for(int i=0; i<5; i++){
            System.out.println("main()の処理をしています。");
        }
    }
}