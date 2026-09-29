//大文字と小文字に変換する

import java.io.*;

class Sample2
{
    public static void main(String[] args)throws IOException
    {
        System.out.println("英字を入力してください。");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        /*BufferedReaderクラス型の変数br＝新しいオブジェクト作るnew +クラス名。コンストラクタを呼び出してるのかな
        Stringクラス型の変数strに、brのreadLineメソッドを呼び出す。
        Stringクラスのstruっていう変数に、クラス型変数strからtoUpperCaseメソッドに接続して、struへ値を入れる。
         */

        String str = br.readLine();

        String stru = str.toUpperCase();
        String str1 = str.toLowerCase();

        System.out.println("大文字に変換すると、"+stru+"です。");
        System.out.println("小文字に変換すると"+str1+"です。");
    }
}