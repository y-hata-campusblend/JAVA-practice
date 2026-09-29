//コマンドライン引数を使う

import java.io.*;

class Sample10
{
    public static void main(String[] args) //String[]でコマンドで入力された文字数をうけとる[]配列の中で。
    {
        if(args.length != 1){ //args.lengthはコマンド実行時に渡された文字列（ファイル）の個数　java Sample10 test1.txtなら一つ。test1.txt test2.txtなら２こ
            System.out.println("ファイル名を正しく指定してください。");
            System.exit(1);  //System.exit(1) で「エラーで終わりました」と報告しつつ、それ以降のファイル読み込み処理（try の中身など）に進ませずに即座に終了する
            //System.exit(0)	正常終了	エラーなく問題通りに最後まで処理が終わったことを伝える
        }
        try{
            BufferedReader br =
                    new BufferedReader(new FileReader(args[0]));  //入力した文字列の個数を調べる。配列だから０

            String str;
            while((str = br.readLine()) != null){
                System.out.println(str);
            }
            br.close();
        }catch(IOException e){
            System.out.println("入出力エラーです。");
        }
    }
}