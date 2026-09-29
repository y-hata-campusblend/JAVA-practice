//s10 q4

import java.io.*;

class Sample3
{
    public static void main(String[] args)throws IOException
    {
        System.out.println("整数を二つ入力してください。");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        //Integerクラスもおぶじぇくとつくってなくても呼び出せる！！！

       int ans = Math.min(num1,num2);
       //勝手にintにしてくれる。int min　か　double minがある

        System.out.println(num1+"と"+num2+"のうち小さいほうは"+ans+"です。");
    }
}

//★Mathクラスはnew出来ない！Mathクラスは計算処理・関数をまとめただけだから。
//書くなら直接！newイラン。newいらないものは、privateなコンストラクタがせっていされてるから。