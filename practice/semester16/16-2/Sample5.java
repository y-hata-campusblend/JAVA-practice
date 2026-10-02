//画像を表示する

import java.awt.*; //画面のパーツやレイアウトを作るためのクラス群
import java.awt.event.*; //ボタンが押されたとかのイベントを検知・処理できるクラス群

public class Sample5 extends Frame
{
    Image im;

    public static void main(String[] args)
    {
        Sample5 sm = new Sample5();
    }
    public Sample5()
    {
        super("サンプル");

        Toolkit tk = getToolkit(); //ツールキットの取得
        im = tk.getImage("Image.jpg"); //画像の取得

        addWindowListener(new SampleWindowListener());

        setSize(2000,800);
        setVisible(true);
    }
    public void paint(Graphics g) //paint()メソッドを上書きして
    {
        g.drawImage(im, 100,100,this);//画像を描画する処理を行う
    }
    class SampleWindowListener extends WindowAdapter
    {
        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
    }
}


kobayashi

