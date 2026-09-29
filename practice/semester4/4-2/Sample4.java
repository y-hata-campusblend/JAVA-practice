//後置インクリメント演算子

class Sample4
{
    public static void main(String[] args)
    {
        int a = 0;
        int b = 0;

        b = a++;

        System.out.println("代入後にインクリメントしたのでbの値は" + b + "です。");
    }
}

//aの値は１！！