import java.io.*;

class Sample1
{
    public static void main(String[] args)throws IOException
    {
        System.out.println("文字列を入力して下さい。");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "Shift_JIS"));

        String str = br.readLine();

        System.out.println(str + "が入力されました。");
    }
}