//問3
import java.io.*;

class Sample3
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("正方形の辺の長さを入力してください。");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();

        int num = Integer.parseInt(str1);

        int sum = num*num;

        System.out.println("正方形の面積は"+sum+"です。");

    }
}