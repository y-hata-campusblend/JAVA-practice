//Q4

class Sample4
{
    public static void main(String[] args)
    {
        int num;
        int num2;

        for(num=0; num<=5; num++){
            //num2<num(0)になるから、1回目は出力されない！
            for(num2=0; num2<num; num2++){
                System.out.print("*");

                /* 内側のループの条件 num2 < num は、「num2 を 0 から始めて、num 回ぶん繰り返す」 という意味になります。

num が 1 なら ➔ 0 の 1回だけ 動く（* 1個）

num が 2 なら ➔ 0, 1 の 2回 動く（* 2個）

num が 3 なら ➔ 0, 1, 2 の 3回 動く（* 3個）

numは何回も戻ってくるから、増えてくけど、num2は何回もループしてリセットされるからm毎回num2=0からはじまる。


                 */
            }
            System.out.print("\n");
        }
    }
}