//sample1を経て、任意の数字を入れるコードはどうなるか気になるための練習！！

import java.io.*;

class Sample2
{
    public static void main(String[] args)throws IOException
    {
        System.out.println("2つの整数を入力してください。");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        System.out.println("num1とnum2にいろいろな演算を行います。");
        System.out.println("num1+num2は" + (num1+num2) + "です。");
        System.out.println("num1-num2は" + (num1-num2) + "です。");
        System.out.println("num1×num2は" + (num1*num2) + "です。");
        System.out.println("num1÷num2は" + (num1/num2) + "です。");
        System.out.println("num1÷num2のあまりは" + (num1%num2) + "です。");
    }
}