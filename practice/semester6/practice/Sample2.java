//Q2

import java.io.*;

class Sample2
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        //入力させるシステム

        int sum=0;  //合計点をためておく変数、最初は０！
        int num;  //入力された点数を入れる変数

        do{
            System.out.println("テストの点数を入力してください。");

            String str= br.readLine();
            num = Integer.parseInt(str);

            sum += num; //sum=sum +numと同じ意味

        }while(num != 0);//numが0じゃない間は繰り返す,do whileはtrueでもどる

        System.out.println("テストの合計点は"+  sum + "です。");
    }
}