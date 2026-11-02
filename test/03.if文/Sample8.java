//血液型(A, B, O, AB)のいずれかを入力すると、それに対応した血液型占いのメッセージを表示してください。（メッセージの内容は任意）
//※if文、switch文両方で作ること

//if文の場合

import java.io.*;

class Sample8 {
    public static void main(String[] args) throws IOException {
        System.out.println("血液型を入力してください。");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        if (str == "A" || "a") {
            System.out.println("A型は細かい");
        } else if (str == "B" || "b") {
            System.out.println("B型はうるさい");
        } else if (str == "O" || "o") {
            System.out.println("O型は雑");
        } else if (str == "AB" || "ab") {
            System.out.println("AB型は変");
        } else {
            System.out.println("正しい血液型を入力してください。");
        }
    }
}



/*switch文の場合

import java.io.*;

class Sample8 {
    public static void main(String[] args) throws IOException {
        System.out.println("血液型を入力してください。");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        switch (str) {
            case "A":
                System.out.println("A型は細かい");
                break;

            case "B":
                System.out.println("B型はうるさい");
                break;

            case "O":
                System.out.println("O型は雑");
                break;

            case "AB":
                System.out.println("AB型は変");
                break;

            case "a":
                System.out.println("A型は細かい");
                break;

            case "b":
                System.out.println("B型はうるさい");
                break;

            case "o":
                System.out.println("AB型は変");
                break;

            case "ab":
                System.out.println("AB型は変");
                break;

            default:
                System.out.println("正しい血液型を入力してください。");
                break;
        }
    }
}

 */

//一文字の時：char型の場合　'a'
//        :String型の場合　"b"
//今回はAB型があるため、char型は使用できない