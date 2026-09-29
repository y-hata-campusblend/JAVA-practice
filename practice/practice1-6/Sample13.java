//p107 q5
import java.io.*;

class Sample13{
    public static void main(String[] args)throws IOException
    {
        System.out.println("科目1~5の点数を入力してください。");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        for(int i=1; i<=5; i++){
            String str = br.readLine();
            int num = Integer.parseInt(str);
            sum += num;
        }

        System.out.println("合計点は"+sum+"平均点は"+(sum/(double)5));
    }
}