//p174 Q4

class Sample4
{
    public static void main(String[] args)
    {
        for(int i = 1; i<= 5; i++){
            for(int j = 1; j<=i ; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

/*1回目、i=0の時、j=1からJ<=0まで続けるけど、1<0は成り立たないから、出力されない。
2回目、i=1の時、j＜=iの1<=1は成り立つから1っこ出力

 */