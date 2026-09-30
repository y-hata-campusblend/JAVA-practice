//2つの文字列を入力し、2つの文字列を結合して表示するプログラムを作成してください。

import java.io.*;
import java.nio.charset.StandardCharsets;//日本語だと文字化けしてしまうので、UTF_8もよみとれるクラスを追加

class Sample12
{
    public static void main(String[] args)
    {
    try {
        System.out.println("二つの文字列を入力してください。");
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

       System.out.println(str1+str2);

    }catch(IOException e){
        System.out.println(e+"が送出されました。");
    }
    }
}
//ターミナルの文字の型とこっちのコード側の型が間違えてたら科？？？になった

 /*
        StringBuffer sb = new StringBuffer(str1);
        sb.append(str2);

        System.out.println(sb); */