//配列の要素を超えて代入する

class Sample1{
    public static void main(String[] args)
    {
        int[] test = new int[5];

        System.out.println("test[10]に値を代入します。");

        test[10] = 80;
        System.out.println("test[10]に80を代入しました。");
        System.out.println("無事終了しました。");
    }
}

//PS C:\Users\81704\IdeaProjects\JAVA-practice\practice\semester14> java Sample1
//test[10]に値を代入します。
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5
//        at Sample1.main(Sample1.java:10)

//ArrayIndexOutOfBoundsException=例外  例外が送出されたと呼ぶ！