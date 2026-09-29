//練習。ある一人だけ知りたい場合

import java.io.*;

class Sample2
{
    public static void main(String[] args)throws IOException
    {
        System.out.println("点数を知りたい人の番号を入力してください");
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int num = Integer.parseInt(str);

        int[] test;
        test = new int[5];

        test[0] = 80;
        test[1] = 60;
        test[2] = 22;
        test[3] = 50;
        test[4] = 75;

        System.out.println(num+"番目の人の点数は"+test[num-1]+"です。");
    }

}