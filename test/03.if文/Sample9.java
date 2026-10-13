//150円のドリンクがあります。投入金額を入力し、おつりがあるかどうかを判定してください。
//
//出力例）
//
//「200」を入力した場合
//　出力メッセージ：「50円のおつりがあります。」
//「150」を入力した場合
//　出力メッセージ：「おつりはありません。」
//「100」を入力した場合
//　出力メッセージ：「投入金額が50円不足しています。」

import java.io.*;

class Sample9
{
    public static void main(String[] args)throws IOException
    {
        System.out.println("投入金額を入力してください。");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int num = Integer.parseInt(str);

        if(num == 150){
            System.out.println("おつりはありません。");
        }else if(num>150){
            System.out.println((num-150)+"円のおつりがあります。");
        }else if(num<150){
            System.out.println((150-num)+"円足りません。");
        }
    }
}