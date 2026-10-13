//整数値を入力し、以下の４つの分類から該当するものを表示するプログラムを作成してください。
//
//正の偶数
//正の奇数
//負の偶数
//負の奇数
//正でも負でもない偶数

import java.io.*;

class Sample6 {
    public static void main(String[] args) throws IOException {
        System.out.println("整数を入力してください。");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int x = Integer.parseInt(str);

        if (x > 0 && x % 2 == 0) {
            System.out.println(x + "は正の偶数です。");
        } else if (x < 0 && x % 2 == 0) {
            System.out.println(x + "は負の偶数です。");
        } else if (x > 0 && x % 2 != 0) {
            System.out.println(x + "は正の奇数です。");
        } else if (x < 0 && x % 2 != 0) {
            System.out.println(x + "は負の奇数です。");
        } else if (x == 0) {
            System.out.println(x + "は正でも負でもない偶数です。");
        }
    }
}

//0が正の偶数になってしまう
//→　且つ(&&)と、または(||)を反対に覚えてた

//複数の条件をそれぞれ独立してチェックしたい場合はifを連続
//条件の中からどれか一つを実行したい場合は、else if