//スレッドによっておこる矛盾！！失敗例

//会社クラス
class Company
{
    private int sum = 0;
    public void add(int a)
    {
        int tmp = sum; //tmpに合計金額代入して、sumの金額を増やす
        System.out.println("現在の合計額は"+sum+"円です。");
        System.out.println(a+"円稼ぎました。");
        tmp = tmp + a;
        System.out.println("合計額を"+tmp+"円にします。");
        sum = tmp;
    }
}
//運転手クラス
class Driver extends Thread
{
    private Company comp; //????

    public Driver(Company c)
    {
        comp = c;
    }
    public void run()
    {
        for(int i=0; i<3; i++){
            comp.add(50);
        }
    }
}
class Sample7
{
    public static void main(String[] args)
    {
        Company cmp = new Company();

        Driver drv1 = new Driver(cmp);
        drv1.start();

        Driver drv2 = new Driver(cmp);
        drv2.start();
    }
}