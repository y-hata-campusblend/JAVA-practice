//int 型の変数 x に数値を入力し、x の値を表示するプログラムを作成してください。

import java.io.*;

class Sample8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int x = Integer.parseInt(str);

        System.out.println(x);
    }
}
//0527を代入すると、343が出力される
//[0]から書き始めると8進数で扱われるルールがある
//5*8*8+2*8+7*1
