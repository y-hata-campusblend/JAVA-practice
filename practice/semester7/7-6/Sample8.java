//繰り返し条件の中で配列の長さを指定する

class Sample7
{
    public static void main(String[] args)
    {
        int[] test = {80,60,22,50,75};

        for(int i = 0; i<test.length; i++){
            System.out.println((i+1)+"番目の人の点数は"+test[i]+"です。");
        }

        System.out.println("テストの受験者数は"+test.length+"です。");
    }

}