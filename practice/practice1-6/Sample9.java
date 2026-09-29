//semster6 p173

import java.io.*;

class Sample9
{
    public static void main(String[] args)throws IOException
    {
        System.out.println("1~10までの偶数を出力します");

        int i;

        for(i = 1; i<=10 ; i++){
            if(i%2 == 0 ){
                System.out.println(i);
            }
        }

        System.out.println("テストの点数を入力してください");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

       /* String str = br.readLine();
        int num = Integer.parseInt(str); */

        int num= 0;
        int sum = 0;

        //上でnum定義して、whileになるまでdoを繰り返してねの処理をする。で、doの中で入力の処理をさせるために、string strのやつ必須！！！

        do {
            String str2 = br.readLine();
            num = Integer.parseInt(str2);

            sum += num;
        } while(num != 0 );


        System.out.println("テストの合計点数は"+sum+"点です。");

       /* while(num != 0){
            num++;
            System.out.println()
        }*/

    }
}
