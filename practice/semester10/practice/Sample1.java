//s10 Q2
import java.io.*;

class Sample1
{
    public static void main(String[] args)throws IOException
    {
        System.out.println("文字列を入力してください。");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        StringBuffer sb = new StringBuffer(str);
        sb.reverse();

     /*   StringBuffer sb = new StringBuffer();
        sb.reverse(str);
        一言でいうと、reverse() は「渡された文字列をひっくり返して返す魔法の道具」ではなく、「自分の箱（StringBuffer）の中に入っている文字をひっくり返す命令」だからです。
そのまま代入sb = strは型がちがうからだめ。付け加えたいならsb.append(str)使わないと無理。
      */

        System.out.println(str+"を逆順にすると"+sb+"です");
    }
}