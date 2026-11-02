//２つの整数値を入力し、大きい方の数を表示するプログラムを作成してください。

import java.io.*;

class Sample2
{
    public static void main(String[] args)throws IOException
    {
        System.out.println("2つの整数を入力してください。");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        int x = Integer.parseInt(str1);
        int y = Integer.parseInt(str2);

        if(x>y){
            System.out.println("値が大きいのは"+x);
        }
        else if(y>x){
            System.out.println("値が大きいのは"+y);
        }
    }
}