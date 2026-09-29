//p174 q4

class Sample11
{
    public static void main(String[] args)
    {
        for(int i = 1; i <=5; i++){
            for(int j = 0; j<i; j++){    //i<jだとつねにfalseになるよ＝何も表示されなくなるよ
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}