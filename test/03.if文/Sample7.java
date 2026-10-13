//中間試験と、期末試験の点数（それぞれ 0 ～ 100 点）を入力し、次の条件に従って合格、不合格を判定するプログラムを作成してください。
//
//両方とも 60 点以上の場合、合格
//合計が 130 点以上の場合、合格
//合計が 100 点以上で、どちらかの試験が 90 点以上であれば、合格
//上記以外は、不合格

import java.io.*;

class Sample7 {
    public static void main(String[] args) throws IOException {
        System.out.println("中間試験と期末試験の点数を入力してください。");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String str1 = br.readLine();

        int a = Integer.parseInt(str);
        int b = Integer.parseInt(str1);

        if (a > 100 || b > 100 || a < 0 || b < 0) {
            System.out.println("正しい点数を入力してください。");
        } else if ((a >= 60 && b >= 60) || ((a + b) >= 130) || ((a + b) >= 100) && (a >= 90 || b >= 90)) {
            System.out.println("合格");
        } else {
            System.out.println("不合格");
        }
    }
}