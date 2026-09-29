//p173 q3

class Sample10
{
    public static void main(String[] args)
    {
        for(int i = 1; i <= 9; i++ ){
            for(int j = 1; j <= 9; j++){
                System.out.print((i*j)+ "\t" );//このなかに/n入れると一個ずつ改行されちゃう
            }
            System.out.print("\n"); //外側ループの｛｝中に入ってるからこのコードは1回目内側ループ終了後適用される！
        }
    }
}
