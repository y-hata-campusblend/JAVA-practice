//Q5

import java.io.*;

class Sample4
{
    public static void main(String[] args)throws IOException
    {
        System.out.println("成績を入力してください。");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);
        //case 打ちたいもの　：　　←の流れにしましょう！！間違えてましたよ
        switch (res){
            case 1:
                    System.out.println("もっと頑張りましょう。");
            break;

            case 2:
                    System.out.println("もう少しがんばりましょう。");
            break;

            case 3:
                    System.out.println("さらに上を目指しましょう。");
            break;

            case 4:
                System.out.println("たいへんよくできました。");
                break;

            case 5:
                System.out.println("たいへん優秀です。");
                break;

            default:
                System.out.println("1~5の成績を入力してください。");
                break;
        }
    }
}