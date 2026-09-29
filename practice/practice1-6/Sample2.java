//p173  semester Q2

import java.io.*;

class Sample2
{
    public static void main(String[] args)throws IOException
    {
        System.out.println("テストの点数を入力してください。");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        int num;
        int sum = 0;
        //doの外で宣言しないと、最後のsystem.outで使えない！！

        do{String str =br.readLine();
            num = Integer.parseInt(str);
            sum += num;
            //doの中で、書かれた奴を数字に変換して足してくよって処理入れないと、入力して終わりのループができるからだめ

        }while(num != 0);

        System.out.println("テストの合計点は"+sum+"点です。");
    }
}