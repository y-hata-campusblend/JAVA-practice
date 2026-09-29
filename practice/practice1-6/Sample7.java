//semster4 P106,107

import java.io.*;

class Sample7
{
    public static void main(String[] args)throws IOException
    {
        System.out.println("0-4="+(0-4));
        System.out.println("3.14×2="+(3.14*2));
        System.out.println("5÷3="+(5/3));
        System.out.println("30÷7のあまりは"+30%7);
        System.out.println("（7+32）÷5="+(7+32)/5);

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\n"+"正方形の辺の長さを入力してください");

        String i = br.readLine();
        Double j = Double.parseDouble(i);

        System.out.println("正方形の面積は"+ (j*j )+ "です");

        System.out.println("三角形の高さと底辺を入力してください。");

        String k = br.readLine();
        Double l = Double.parseDouble(k);

        String m = br.readLine();
        Double n = Double.parseDouble(m);

        System.out.println("三角形の面積は"+(l*n)/2 +"です");

        System.out.println("科目1~5の点数を入力してください。");

        String str1 = br.readLine();
        int num2 = Integer.parseInt(str1);

        String str2 = br.readLine();
        int num3 = Integer.parseInt(str2);

        String str3 = br.readLine();
        int num4 = Integer.parseInt(str3);

        String str4 = br.readLine();
        int num5 = Integer.parseInt(str4);

        String str5 = br.readLine();
        int num6 = Integer.parseInt(str5);

        int sum = (num2+num3+num4+num5+num6);
        double ave = (sum/(double)5);

        //numたちはint型！！キャスト演算子を忘れないように

        System.out.println("五科目の合計点は"+sum+"です。");
        System.out.println("五科目の平均点は"+ave+"です。");

        //自動変換（キャスト不要）: 小さい型から大きい型へ（例: int → double）
        //
        //手動キャスト（が必要）: 大きい型から小さい型へ（データが一部消える危険があるため明示が必要）


    }
}