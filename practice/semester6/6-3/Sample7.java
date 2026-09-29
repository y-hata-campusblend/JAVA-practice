//do while　1～10のやつ

import java.io.*;

class Sample7
{
    public static void main(String[] args)throws IOException
{
    BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

   int num;//変数numをループの外で宣言するよ、doの中で宣言すると最後のsystemoutでnumが使えない

    do{
        System.out.println("1~10の数字を入力してください。");

        //一旦上のシステムを表示させたい！これがdoでいける
        //while文でwhileの条件文の上に同じようにprintlnで入力しての文言いれれば同じの作れるよ
        String str = br.readLine();
        num = Integer.parseInt(str);

    }while(num<  1 || num> 10);//1未満、10より大きいならもう一度doに戻るよ

    System.out.println("正しい値" + num + "が入力されました。");
}
}

