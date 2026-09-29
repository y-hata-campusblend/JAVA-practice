//文字列の長さと文字を取り出す

class Sample1
{
    public static void main(String[] args)
    {
        String str = "Hello";
        //strはクラス型の変数。

        char ch1 = str.charAt(0);
        char ch2 = str.charAt(1);
        /*char型を使うのは、一文字だけだから。複数文字の時はStringでおｋ。Stringはクラスでもあり、型でもある。
        ※ String だけはよく使うので、特別に new String("Hello") と書かずに "Hello" と書くだけで自動的にオブジェクトを作ってくれる特別な扱いになっています。
        String str = new String("Hello")もおｋではあるけどながい。

        String型の変数strを作って、Helloを代入う。変数.メソッド名（charat）で呼び出した値をch1に代入する。
         */

        int len = str.length();

        System.out.println(str+"の1番目の文字は"+ch1+"です。");
        System.out.println(str+"の2番目の文字は"+ch2+"です。");
        System.out.println(str+"の長さは"+len+"です。");
    }
}