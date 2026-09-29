//Q1

class Sample1
{
    public static void main(String[] args)
    {
        System.out.println("1～10までの偶数を出力します。");

        //初期化、条件（終わり）、カウントアップ！！カウントアップには＋＋はいらないよ
        for(int i = 1; i<=10; i++){
            if(i%2==0){
                System.out.println(i);
            }
    }

    }
}