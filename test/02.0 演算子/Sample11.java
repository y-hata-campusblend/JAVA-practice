//数値 13 と 17 の積を表示するプログラムを作成してください。
//
//※変数を使用しない。
//※ System.out.println()の引数部分で演算を行う。

import java.io.*;

class Sample11
{
    public static void main(String[] args)
    {
        System.out.println(13*17);
    }
}

/*throws IOException {    throwsだと例外発生したらそのまま投げる　それか、try catchつかう
        System.out.println("整数を2つ入力してください。");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        System.out.println("掛け算すると答えは、" + num1 * num2);
    }
}*/
