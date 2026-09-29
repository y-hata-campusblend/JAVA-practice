//文字列を追加する

import java.io.*;

class Sample4{
    public static void main(String[] args)throws IOException
    {
        System.out.println("文字列を入力してください");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in,"Shift_JIS"));

        String str1 =br.readLine();

        System.out.println("追加する文字列を入力してください");

        String str2 = br.readLine();//追加の文字列を入力させる

        StringBuffer sb = new StringBuffer(str1);//追加される側のもじをまず送る。コンストラクタの引数として
        sb.append(str2);  //追加するsbをstr2をappendメソッドをつかっておくる。メソッドの因数として

        System.out.println(str1+"に"+str2+"を追加すると"+sb+"です");
    }
}