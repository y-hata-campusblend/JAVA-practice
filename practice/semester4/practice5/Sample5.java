//問５

import java.io.*;

class Sample5
{
    public static void main(String[] args)throws IOException
    {
        System.out.println("科目1～5の点数を入力してください。");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();
        String str3 = br.readLine();
        String str4 = br.readLine();
        String str5 = br.readLine();

        double num1 = Double.parseDouble(str1);
        double num2 = Double.parseDouble(str2);
        double num3 = Double.parseDouble(str3);
        double num4 = Double.parseDouble(str4);
        double num5 = Double.parseDouble(str5);

        double sum = num1+num2+num3+num4+num5;

        System.out.println("五科目の合計点は" + sum + "です。");
        System.out.println("五科目の平均点は" +  sum/5  + "です。");

        //以下教科書の回答
        int sum2 = 0;

        sum2 += num1;
        sum2 += num2;
        sum2 += num3;
        sum2 += num4;
        sum2 += num5;

        System.out.println("五科目の合計点は" + sum2 + "です。");
        System.out.println("五科目の平均点は" +  sum2/(double)5  + "です。");
    }
}