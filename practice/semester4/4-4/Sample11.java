//同じ型同士で演算した場合

class Sample11
{
    public static void main(String[] args)
    {
        int num1 = 5;
        int num2 = 4;

        double div = num1 / num2;

        System.out.println("5/4は" +  div + "です。");

        //上記だと、答えが１．０になっちゃう。答えをdouble型にしたいなら、少なくとも一方をdoubleにする必要がある

        double dv = (double)num1/(double)num2;

        System.out.println("5/4は" +  dv + "です。");
    }
}