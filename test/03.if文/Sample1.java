//int 型の変数 x、y にそれぞれ数値を入力し、x が y より大きい場合に「x は y より大きい。」 という文を表示するプログラムを作成してください。
import java.io.*;

class Sample1
{
    public static void main(String[] args)throws IOException
    {
        System.out.println("xの値とyの値を入力してください。");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String str1 = br.readLine();

        int x = Integer.parseInt(str);
        int y = Integer.parseInt(str1);

        if(x>y){
            System.out.println("xはyより大きい。");
        }
    }
}