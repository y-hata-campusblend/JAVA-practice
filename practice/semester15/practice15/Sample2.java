//p499　

class Car implements Runnable
{
    private String name;

    public Car(String nm)
    {
        name = nm;
    }
        public void run(){
            for(int i =0; i<5; i++){
                try{
                    Thread.sleep(1000);  /*エラーの理由: Car クラスは Thread を継承していないので、ただの sleep() では見つからない。Threadクラスの中のクラスメソッドだから
                    オブジェクト作らなくても使える。
                    解決策: Thread.sleep(1000) と書いて「Thread クラスの sleep 命令だよ！」と教えてあげる。*/
                    System.out.println(name+"の処理をしています。");
                }catch(InterruptedException e){}
            }
    }
}
class Sample2
{
    public static void main(String[] args)
    {
        Car car1 = new Car("1号車");
        Thread th1 = new Thread(car1);
        th1.start();
        /*Car car1 = new Car("1号車"); //一回カークラスに接続される変数つくる
          Thread th1 = new Thread(car1); //スレッドはカークラスの存在知らないから、スレッドにカークラスの住所を伝える
           th1.start(); */

        for(int i=0; i<10; i++)
        {
            System.out.println("main()の処理をしています。");
        }
    }
}