//semester3 p69 q3,4,5

import java.io.*;

class Sample6
{
    public static void main(String[] args)throws IOException
    {
        System.out.println("あなたは何歳ですか？");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int num = Integer.parseInt(str);

        System.out.println("あなたは"+num+"歳です");

        //System.out.println("\n");==改行二つになっちゃう
        System.out.println("円周率の値はいくつですか？");

        String str2 = br.readLine();
        Double num2 = Double.parseDouble(str2);

        System.out.println("円周率の値は"+num2+"です。");

        System.out.println("\n"+"身長と体重を入力してください。");

        String str3 = br.readLine();
        String str4 = br.readLine();

        Double height = Double.parseDouble(str3);
        Double weight = Double.parseDouble(str4);

        System.out.println("身長は"+height+"cmです。"+"\n"+"体重は"+weight+"kgです。");

    }


}