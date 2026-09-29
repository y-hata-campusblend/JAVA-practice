//ファイルから入力する

import java.io.*;

class Sample9
{
    public static void main(String[] args)
    {
        try{
            BufferedReader br =
                    new BufferedReader(new FileReader("test2.txt"));

            int[] test = new int[8];
            String str;

            for(int i=0; i<test.length; i++){
                str = br.readLine();
                test[i] = Integer.parseInt(str);
                /*str = br.readLine(); test[i] = Integer.parseInt(str);
                 strって文字に、brクラスに保管されてるものを1行取り出します。取り出したstrを、integerクラスのparseintで数字に変換してtestに代入！ってことでいい？
                 StringとかIntegerはクラスライブラリに保存されてるからそのまま呼び出せてるってこと　　　*/
            }
            int max = test[0];
            int min = test[0];
            for(int i=0; i<test.length; i++){
                if(max < test[i])
                    max = test[i];  //ここら辺は勝手に、max,minに代入されるだけ
                if(min > test[i])
                    min = test[i];
                System.out.println(test[i]);//一個ずつ出力される
            }
            System.out.println("最高点は"+max+"です。");
            System.out.println("最低点は"+min+"です。");

            br.close();
        }
        catch(IOException e){
            System.out.println("入出力エラーです。");
        }
    }
}