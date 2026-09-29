//p106 問2

class Sample1
{
    public static void main(String[] args)
    {
        int num1 = 0;
        int num2 = 4;

        System.out.println("0-4＝" +  (num1-num2));

        double num3 = 3.14;
        double num4 = 2;

        System.out.println("3.14×2="+(num3*num4));

        int num5 = 5;
        int num6 = 3;

        System.out.println("5÷3="+(num5/num6));

        int num7 = 30;
        int num8 = 7;

        System.out.println("30÷7のあまりは"+(30%7));

        int num9 =32;
        double div10 = ((double)num8+ (double)num9)/(double)num5;

        System.out.println("(7+32)÷5=" + (num8+num9)/num5);
        System.out.println("(7+32)÷5=" + div10);
    }
}