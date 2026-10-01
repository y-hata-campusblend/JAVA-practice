//int 型の変数 x、y にそれぞれ数値を入力し、x が ｙ より大きい場合には「x は y より大き い」、x が y より小さい場合には「x は y より小さい」と表示するプログラムを作成してください。

import java.io.*;

class Sample3
{
    public static void main(String[] args)throws IOException
    {
        System.out.println("2つの整数x,yを入力してください。");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        int x = Integer.parseInt(str1);
        int y = Integer.parseInt(str2);

        if(x>y){
            System.out.println("xはyより大きい。");
        } else if(y>x){
            System.out.println("xはyより小さい");
        }
    }
}