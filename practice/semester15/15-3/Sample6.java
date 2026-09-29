//Runnableインタフェイスを実装する

class Car implements Runnable
{
    private String name;

    public Car(String nm)
    {
        name = nm;
    }
    public void run()  //run()メソッドを定義する
    {
        for(int i=0; i<5; i++){
            System.out.println(name+"の処理をしています。");
        }
    }
}
class Sample6
{
    public static void main(String[] args){
        Car car1 = new Car("1号車");

        Thread th1 = new Thread(car1);
        th1.start();   /*Runnable は「仕事の中身（run メソッド）」しか持っておらず、スレッドを起動する機能（start メソッド）を持っていないからです。
                         そのため、スレッドを実際に動かす機能を持っている Thread クラス を持ってきて協力してもらう必要があります。*/

        for(int i=0; i<5; i++){
            System.out.println("main()の処理をしています。");
        }
    }
}
/*extends Thread のとき：
Car は Thread クラスの子供なので、親が持っている start() メソッドを引き継いで使える。
→ car1.start() が書ける！

implements Runnable のとき：
Car は run() メソッドしか持っていない。
→ car1.start() は存在しないのでエラー！*/