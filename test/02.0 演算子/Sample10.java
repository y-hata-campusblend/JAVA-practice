//2つの整数値を入力し、平均値を求めるプログラムを作成してください。
//※計算は整数で行い、小数点以下は切り捨ててよい。

class Sample10
{
    public static void main(String[] args)
    {
        int x = 13;
        int y = 25;

        System.out.println((x+y)/2);
    }

}

/*
数字が増えたときのために、下の書き方もできる

int count = 0;  全体の個数
int sum = 0;

sum += x; count++; (インクリメント演算子　++は1つ増やしてねだから、そのまま横に置いといてok!)
sum += y; count++;

sum / count
 */