//スレッドの終了を待つ

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
            System.out.println(name+"の処理をしています。"); //中断される例外が送出される可能性がないから、tryは不要
        }
    }
}
class Sample5
{
    public static void main(String[] args)
    {
        Car car1 = new Car("1号車");
        car1.start();

        try{
            car1.join();  //呼び出した側のスレッドが、呼び出された側のスレッドが終了するまで待機する。
            //待機中に例外が送出する可能性あり。だから例外をtrycatchで備えとく。
        }
        catch(InterruptedException e){}//割り込み例外のこと。緊急停止ボタン的なもの。　例外を受け止めるために変数eの設定が必要！

        System.out.println("main()の処理をしています。");
    }
}
