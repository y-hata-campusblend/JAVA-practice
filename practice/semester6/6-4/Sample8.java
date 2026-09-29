//ネスト if文などと組み合わせる

class Sample8
{
    public static void main(String[] args)
    {
     //①記号を切り替えるためのスイッチを作る。boolenはtrue/falseしか入らない、次は＊、～どっちを出すかの目印
        boolean bl = false;
        //②外側のループ　縦に5行分
        for(int i=0; i<5; i++){
            //③内側のループ　横に5文字分　外が一戸やるごとに、横５やるよ
            for(int j=0; j<5; j++){
                /*④スイッチがfalseなら、＊を表示して、blをtrueにして・スイッチの状態を見て処理を変える。
                falseなら＊だして、trueに帰る。
                 */
                if(bl == false){
                    System.out.print("*");
                    bl=true;
                }
                //スイッチがtrueなら～をひょうじして、すいっちをfalse にする
                else{
                    System.out.print("~");
                    bl = false;
                }
            }
            //1行書き終えたら次の行へ改行すして外側ループに戻るよ×５
            System.out.print("\n");
        }
    }
}