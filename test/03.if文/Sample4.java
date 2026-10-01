/*int 型の変数 x、y にそれぞれ数値を入力し、x がｙより大きい場合には「x は y より大きい」、
x が y より小さい場合には「x は y より小さい」、x と y が等しい場合には「x と y は等 しい」と表示するプログラムを作成してください。 */

import java.io.*;

class Sample4
{
    public static void main(String[] args)throws IOException
    {
        System.out.println("2つの整数x,yを入力してください。");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String str1 = br.readLine();

        int x = Integer.parseInt(str);
        int y = Integer.parseInt(str1);

        if(x>y){
            System.out.println("xはyより大きい");
        }else if(y>x){
           System.out.println ("xはyより小さい");
        }else if(x==y){
            System.out.println("xとyは等しい");
        }
    }
}