//p472 Q3

import java.io.*;

class Sample2
{
    public static void main(String[] args) //配列の箱！文字列が複数入る配列ってこと
    {
        if(args.length != 1){
            System.out.println("ファイル名を正しく指定しください。");
            System.exit(1); //exit(1)のときはエラーおきた報告&それ以降の処理を止める
        }
        try{
            BufferedReader br =
                    new BufferedReader(new FileReader(args[0]));

            String str;
            while((str = br.readLine()) != null){ //null＝なにもない
                System.out.println(str);
            }
            br.close(); /*ファイルがロックされる： Javaがファイルを掴んだまま離さないため、他のプログラムからそのファイルを削除・変更できなくなることがあります。
            メモリの無駄遣い（メモリリーク）： 読み込みに使った領域が解放されず、プログラムを長時間動かしていると動作が重くなったりフリーズしたりします。
            書き込みの場合は保存されないことも： ファイルに書き込む処理（FileWriter など）の場合、close() を忘れるとデータがディスクに保存されず消えてしまうことがあります。*/

        }catch(IOException e){ //データの入力（Input）や出力（Output）の途中でトラブルが発生したとき
            System.out.println("入出力エラーです");
        }
    }
}

