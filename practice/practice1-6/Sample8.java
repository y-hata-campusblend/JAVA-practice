//semester5 p144,145

import java.io.*;

class Sample8
{
    public static void main(String[] args)throws IOException
    {
        System.out.println("整数を入力してください。");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        int num1 = Integer.parseInt(str1);

        if((num1%2) == 0){
            System.out.println(num1+"は偶数です。");
        }
        else {
            System.out.println(num1 + "は奇数です");
        }

            System.out.println("2つの整数を入力してください。");

            String str2 = br.readLine();
            int num2 = Integer.parseInt(str2);

            String str3 = br.readLine();
            int num3 = Integer.parseInt(str3);

            if(num2 == num3){
                System.out.println("2つの数は同じ値です。");
            } else if(num2<num3)   {
                System.out.println(num2+"より"+num3+"のほうが大きい値です。");
            }else{
                System.out.println(num3+"より"+num2+"のほうが大きい値です");
            }

            System.out.println("0から10までの整数を入力してください");

            String str4 = br.readLine();
            int num4 = Integer.parseInt(str4);

            //かつの＆＆にしないと0以上であればおｋ10以下のマイナスでもおｋになっちゃう
            if(0<=num4 && num4<=10){
                System.out.println("正解です。");
            }else{
                System.out.println("間違いです");
            }

            System.out.println("成績を入力してください。");

     String str5 = br.readLine();
     int num5 = Integer.parseInt(str5);
//
//        String str5 = br.readLine();
//        int num5 = Integer.parseInt(str5);
//
//        String str6 = br.readLine();
//        int num6 = Integer.parseInt(str6);
//
//        String str7 = br.readLine();
//        int num7 = Integer.parseInt(str7);
//
//        String str8 = br.readLine();
//        int num8 = Integer.parseInt(str8);

        switch(num4){
            case 1 :
                System.out.println("もっと頑張りましょう");
                break;

            case 2 :
                System.out.println("いい感じ");
                break;

            case 3 :
                System.out.println("いうことなし！");
                break;

            default :
                System.out.println("1~3をいれて");
                break;


    }


    }
}