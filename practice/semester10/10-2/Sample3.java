//文字を検索する

import java.io.*;

class Sample3
{
    public static void main(String[] args)throws IOException
    {
        System.out.println("文字列を入力してください。");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in,"Shift_JIS"));

        String str1 = br.readLine();

        System.out.println("検索文字を入力してください。");

        String str2 = br.readLine();
        //str2はクラスにつながるリモコンみたいな感じ
        char ch = str2.charAt(0);
        //上で入力させた1文字を、一文字取り出してStringクラスに送って、chに一文字目を代入。一文字だけだから(0)とcharでok。intとかにしてに文字以上にしてしまうと、一文字だけ探す意図とずれる

        int num = str1.indexOf(ch);
        //何番目にchに代入されてるものがあるか探して、何番目という数字をnumに代入

        if(num != -1)//なかったら=-1がでる
            System.out.println(str1+"の"+(num+1)+"番目に「"+ch+"」が見つかりました");
        else
            System.out.println(str1+"に「"+ch+"」はありません" );
    }
}