//画面・キーボードから出力する

import java.io.*;

class Sample6
{
    public static void main(String[] args)
    {
        System.out.println("文字列を入力してください。");

        try{
            BufferedReader br =
                    new BufferedReader(new InputStreamReader(System.in));

            //「System.in を InputStreamReader に引数として渡し、その InputStreamReader オブジェクトを BufferedReader に引数として渡している」
           /* 元体（芯）： System.in（生の入力機能だけ）

            1着目の服： InputStreamReader をかぶせて「文字変換機能」を追加

            2着目の服： BufferedReader をかぶせて「1行まとめ読み機能」を追加 */

            String str = br.readLine();
            System.out.println(str+"が入力されました。");
        }
        catch(IOException e){
            System.out.println("入出力エラーです。");
        }
    }
}

//System.in： キーボードからの入力（標準入力）を受け取るオブジェクトです。ただし、「0と1のバイトデータ」しか扱えません。
//
//new InputStreamReader(...)： バイトデータを人間が読める「文字データ」に変換するアダプター（橋渡し役）です。
//
//new BufferedReader(...)： 読み込んだ文字データを一時的にメモリ（バッファ）に溜め込み、効率よく1行単位で扱えるようにする機能拡張パーツです。
//
//BufferedReader br： 組み立てた完成形のストリームオブジェクトを、br という名前の変数に代入して扱えるようにしています。