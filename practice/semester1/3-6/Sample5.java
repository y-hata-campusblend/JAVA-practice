import java.io.*;

class Sample5
{
    public static void main(String[] args) throws IOException
{
    System.out.println("あなたは何歳ですか？");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String num = br.readLine();

    System.out.println("あなたは23歳です。");
    }
}
