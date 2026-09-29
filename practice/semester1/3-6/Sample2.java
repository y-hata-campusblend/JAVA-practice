import java.io.*;

class Sample2
{
    public static void main(String[] args)throws IOException
    {
        System.out.println("整数を入力して下さい。");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        double num = Double.parseDouble(str);

        System.out.println(num + "が入力されました。");
    }
}