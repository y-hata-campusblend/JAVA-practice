//int 型の変数 x、y にそれぞれ数値を入力し、x と y の和、差(x-y)、積、商と余り (x÷y)、を表示するプログラムを作成してください。

import java.io.*;

class Sample9 {
    public static void main(String[] args) throws IOException {
        System.out.println("数字を二つ入力してください。");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String str1 = br.readLine();

        int x = Integer.parseInt(str);
        int y = Integer.parseInt(str1);

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);
    }
}

//print(\n)を駆使して、1行にすれば、System.out.println書きまくる必要はない
//どっちが実用的？