//ファイルから入力する　　ファイルから取り出す

import java.io.*;

class Sample8
{
    public static void main(String[] args)
    {
        try{
            BufferedReader br =
                    new BufferedReader(new FileReader("test1.txt"));

            String str1 = br.readLine();
            /*readLineが1行取り出すってこと。
            readで読み込み、lineに代入。
            readLine() は、一言で言うと「改行（Enterキー）が来るまでの文字列を、1行まるごと取ってくる命令（メソッド）」です。
            英語の Read（読み込む） + Line（行） という名前の通り、1文字ずつではなく「1行単位」でデータを読み込みます。  */

            String str2 = br.readLine();

            System.out.println("ファイルに書き込まれている2つの文字列は");
            System.out.println(str1+"です。");
            System.out.println(str2+"です。");

            br.close(); //ファイルは閉じる、いちばん外側のbrを閉じるだけで全部閉じるから。バッファのメソッドだよ。
        }
        catch(IOException e){
            System.out.println("入出力エラーです。");
        }
    }
}