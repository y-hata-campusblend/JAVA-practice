//p499

class Car implements Runnable
{
    private String name;

    public Car(String nm)
    {
        name = nm;
    }
    public void run()
    {
        for(int i=0; i<5; i++){
            System.out.println(name+"の処理をしています。");
        }
    }
}

class Sample1
{
    public static void main(String[] args)
    {
       Car car1 = new Car("1号車");   //一回カークラスに接続される変数つくる
       Thread th1 = new Thread(car1); //スレッドはカークラスの存在知らないから、スレッドにカークラスの住所を伝える
       th1.start();

        for(int i=0; i<5; i++)
        {
            System.out.println("main()の処理をしています。");
        }
    }
}