//問2　参考書の答え

class Sample2
{
    public static void main(String[] args)
    {
        int ans1 = 0-4;
        double ans2 = 3.14*2;
        double ans3 = (double)5/3;
        int ans4 = 30%7;
        double ans5 = (7+32)/(double)5;

        /*上記ans3,ans5は、5/3,(7+32)/5だと、勝手にint同士の整数の計算になってしまっている。
        だから、片方をdoubleのキャスト演算子にして計算している。右辺の式が勝手にint型になってる
    */

        System.out.println("0-4＝" +  ans1);
        System.out.println("3.14×2="+ans2);
        System.out.println("5÷3="+ans3);
        System.out.println("30÷7のあまりは"+ans4);
        System.out.println("(7+32)÷5=" + ans5);
    }
}