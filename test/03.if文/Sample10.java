/*性別と年齢を入力し、下記の条件で生命保険料を算出してください。

男性

80歳以上：8000円
50歳以上：7000円
30歳以上：5000円
女性

80歳以上：7000円
50歳以上：6000円
30歳以上：4500円

 */

import java.io.*;

class Sample10 {
    public static void main(String[] args) throws IOException {
        System.out.println("性別（M or F）と年齢を入力してください。");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        char str1 = br.readLine().charAt(0);
        String str2 = br.readLine();

        int age = Integer.parseInt(str2);

        int fee = 0;

        if (str1 == 'M' || str1 == 'm') {
            if (age >= 80) {
                fee = 8000;
                System.out.println("保険料は" + fee + "円です。");
            } else if (80 > age && age >= 50) {
                fee = 7000;
                System.out.println("保険料は" + fee + "円です。");
            } else if (50 > age && age >= 30) {
                fee = 5000;
                System.out.println("保険料は" + fee + "円です。");
            }
        }
        if (str1 == 'F' || str1 == 'f') {
            if (age >= 80) {
                fee = 7000;
                System.out.println("保険料は" + fee + "円です。");
            } else if (80 > age && age >= 50) {
                fee = 6000;
                System.out.println("保険料は" + fee + "円です。");
            } else if (50 > age && age >= 30) {
                fee = 4500;
                System.out.println("保険料は" + fee + "円です。");
            }
        }
    }
}