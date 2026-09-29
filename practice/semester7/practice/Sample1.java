//p212 q4

import java.io.*;

class Sample1
{
    public static void main(String[] args)throws IOException
    {
        System.out.println("5人のテストの点数を入力してください。");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str;
        int[] test = new int[5];

        for(int i=0;i<5;i++){
            str = br.readLine();
            int tmp = Integer.parseInt(str);
            test[i] = tmp;
            //入力した数字がtmpになるから、＝test[i]に格納する
        }

        for(int i=0;i<5;i++){
            System.out.println((i+1)+"番目の人の点数は"+test[i]+"です。");
    }

        for(int i =0; i<test.length-1; i++){
            for(int j= i+1; j<test.length; j++){
                //iより後ろの要素を見たいから、i+1,j<test.lengthはiより後ろ全部を見るため！
                if (test[j]>test[i]){//test0を順に１～4まで比較してくよ
                    int num = test[j];//num=0;とかにするとテストの値が上書きされちゃう
                    test[j] = test[i];//任意の変数に一旦、ｊの値を入れて、入れ替え
                    test[i] = num; //先頭に入れる

                    //一番先頭、test[0]に最高点を持ってく！
                }
            }
        }
        System.out.println("最高点は"+test[0]+"です");
    }
}