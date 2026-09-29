//でかいサイズの型から小さい型へ代入はできません！！！

class Sample9
{
    public static void main(String[] args)
    {
        double dnum = 160.5;

        System.out.println("身長は" + dnum + "です。");

        System.out.println("int型の変数に代入します。");

        int inum = (int)dnum;

        System.out.println("身長は"+  inum +"cmです。");
    }
}