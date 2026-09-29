//配列要素の数を入力する

import java.io.*;

class Sample3
{
        public static void main(String[] args)throws IOException
    {
        System.out.println("テストの受験者数を入力してください");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();//文字列型の箱を作るよ！の宣言
        int num = Integer.parseInt(str);

        int[] test;
        test = new int[num];
        //int[] test = new int[test]って書き方でもまる！

        int sum = 0;

        System.out.println("人数分の点数を入力してください");
//br.readLine　これは呼び出すたびに新しい行を呼び込んでる！ forのおかげで、5回撃ち込ませるっていう作業をさせられる！！
        for(int i=0; i<num; i++){  //iは何回分をきめる変数　　i=0の理由は、test[i]で代入するから！！
            str = br.readLine();
            int tmp = Integer.parseInt(str);
            test[i]= tmp;

            sum += tmp;
    }
        for(int i =0; i<num; i++){
            System.out.println((i+1)+"番目の人の点数は"+test[i]+"です。");
        }
        System.out.println("合計点数は"+sum+"です。");
    }
}
