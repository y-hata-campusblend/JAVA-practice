//p472 q3

import java.io.*;

class Sample1
{
    public static void main(String[] args)
    {
        try{
            BufferedReader br =
                    new BufferedReader(new FileReader("practice1.txt"));

            String str1 = br.readLine();
            String str2 = br.readLine();

            System.out.println(str1+"\n"+str2);

            br.close();
        }catch(IOException e){
            System.out.println("入出力エラーです。");
        }
    }
}