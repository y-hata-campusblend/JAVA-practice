//2津の数字の入力の練習！
import java.io.*;

class Sample3
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("整数を2つ入力してください。");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        double num1 = Double.parseDouble(str1);
        double num2 = Double.parseDouble(str2);

        System.out.println("最初に" + num1 + "が入力されました。");
        System.out.println("次に" + num2 + "が入力されました。");
    }
}