//s10 q3 stringbuffer insert (int offset, string str)因数の位置に文字列を追加する
import java.io.*;

class Sample2
{
    public static void main(String[] args)throws IOException
    {
        System.out.println("文字列を入力してください。");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println("aの挿入位置を整数で入力してください。");
        String str2 = br.readLine();
        int num = Integer.parseInt(str2);

        StringBuffer ans = new StringBuffer(str);
        ans.insert((num-1),"a");

        System.out.println(ans+"になりました。");
    }
}