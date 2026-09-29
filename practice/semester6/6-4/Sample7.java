//for文をネスト(入れ子にする)する

class Sample7
{
    public static void main(String[] args)
    {
        for(int i=0; i<5; i++){
            for(int j=0; j<3; j++){
                System.out.println("iは"+ i + ":jは" +j);
            }
        }
    }
}