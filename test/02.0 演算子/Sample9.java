//int 型の変数 x、y にそれぞれ数値を入力し、x と y の和、差(x-y)、積、商と余り (x÷y)、を表示するプログラムを作成してください。

class Sample9
{
    public static void main(String[] args)
    {
        int x = 7;
        int y = 3;

        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);
    }
}

//print(\n)を駆使して、1行にすれば、System.out.println書きまくる必要はない
//どっちが実用的？