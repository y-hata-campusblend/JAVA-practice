//switch文の中でbreak文を使う

import java.io.*;

class Sample10
{
    public static void main(String[] args)throws IOException
    {
        System.out.println("成績を入力してください。");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int num = Integer.parseInt(str);

        switch(num){
            case 1:
            case 2:
                System.out.println("もう少しがんばりましょう");
                break;

            case 3:
            case 4:
                System.out.println("この調子でがんばりましょう");
                break;

            case 5:
                System.out.println("たいへん優秀です");
                break;

            default:
                System.out.println("1～5までの成績を入力してください");
                break;
        }
    }
}