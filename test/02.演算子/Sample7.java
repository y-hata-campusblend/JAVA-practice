//String 型の変数 s に文字列を入力し、s の値を表示するプログラムを作成してください。

import java.io.*;

class Sample7 {
    public static void main(String[] args) throws IOException {
        System.out.println("文字列を入力してください。");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        System.out.println(s);
    }
}

//ターミナルとコードの文字の出力のやつが違う。やり方わからない