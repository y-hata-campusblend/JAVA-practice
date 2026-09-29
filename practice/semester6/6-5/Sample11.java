//continue文でブロックの最初に戻る

import java.io.*;

class Sample11
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("何番目の処理を飛ばしますか");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str =br.readLine();
        int res = Integer.parseInt(str);

        for(int i=1; i<=10; i++){
            if(i == res)
                continue;

            //res==入力した数字は、if文のcontinueに引っかかって中断されるから、下のprintlnにいかないよ
            System.out.println(i+"番目の処理です。");
        }

    }
}