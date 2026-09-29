//p174 semster6 q5
import java.io.*;

class Sample12
{
    public static void main(String[] args)throws IOException
    {
        System.out.println("2以上の素数を入力してください");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int num = Integer.parseInt(str);

        for(int i =2; i <= num; i++) {//17÷17であまり０になっちゃうから、i=17になる条件は除外させる！
            if(num%i == 0  && i<num){
                System.out.println(num+"は素数ではありません。");
                break;
                }
            else if( num == i ){
                    System.out.println(num+"は素数です");
            }


        }
            /* {
           if( num == i ){
                System.out.println(num+"は素数です");
                //iはただの箱！！お試し用の数字だよ
            }
            else if(num%i == 0){
                System.out.println(num+"は素数ではありません。");
                break;
            }*/

            /*まず、i=2からみてく。入力されたの(num)が、２だったら、まずif文のnum==iをみる。
            2=2成り立つから素数。
            もしnum=4だったら。まずi=2からみてって、if文の中身は（num==i,4=-2）成り立たないから、次のelse ifをみる。
            4/2のあまりは0なので、素数になるよね。ってかんじ。で、break;しないと、i=4まで続いちゃうから気を付けよう
            素数じゃないほうの条件を先に入れちゃうと、2/2=1・・・0で成り立っちゃうので、後に来させる
             */
    }

}
