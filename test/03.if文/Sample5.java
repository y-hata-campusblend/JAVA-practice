//正の整数値を入力し、それが偶数か奇数かを判定するプログラムを作成してください。
//※偶数、奇数の判定には除算の余りを利用する。

import java.io.*;

class Sample5
{
    public static void main(String[] args)throws IOException
    {
        System.out.println("整数を入力してください。");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine(); //brで、キーボードやファイルから1行分とってきてとお願いし、readLineが戻り値としてくれる。readLineのじてんで、文字入力可能になる
        int x = Integer.parseInt(str);

        if(x%2 == 0){
            System.out.println(x+"は偶数です。");
        }else if(x%2 != 0){ //!=は等しくない　という意味。＝は１つで大丈夫
            System.out.println(x+"は奇数です。");
        }
    }
}