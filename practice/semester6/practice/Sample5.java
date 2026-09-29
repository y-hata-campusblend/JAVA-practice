//Q5

import java.io.*;

class Sample5
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.println("2以上の整数を入力してください。");
        long num = Integer.parseInt(br.readLine());
/*まず、２（i）＝＝numかみる。そのあとelseでnumをiで割ってみて、あまりが０になるかみる。
あてはまらなかったら、iにプラス1して３（i）になって、また同じことの繰り返し。
最後に、i==numなら素数。それまでに、num/iをして、あまりが0になれば、素数じゃない。からbreakでループストップ。
 */
        for (long i = 2; i<=num; i++){
            if(i == num) {
                System.out.println(num+"は素数です。");
            }
            else if(num % i == 0) {
                System.out.println(num + "は素数ではありません");
                break;
            }
    }

    }
}