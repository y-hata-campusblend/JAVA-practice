//ボタンををつける

import java.awt.*;
import java.awt.event.*;

public class Sample3 extends Frame
{
    private Button bt;

    public static void main(String[] args)
    {
        Sample3 sm = new Sample3();
    }
    public Sample3()
    {
        super("練習");//タイトル作成

        bt = new Button("やっほ～"); //ボタンの作成
        add(bt);//ボタンの追加

        addWindowListener(new SampleWindowListener());
        bt.addActionListener(new SampleActionListener()); //イベントを受け取ることができるようにする、クリック等に反応する仕組み＝イベント処理

        setSize(250,200);
        setVisible(true);
    }

class SampleWindowListener extends WindowAdapter
{
    public void windowClosing(WindowEvent e) //閉じたときのばってんの処理
    {
        System.exit(0);
    }
}
class SampleActionListener implements ActionListener
{
    public void actionPerformed(ActionEvent e) //イベント発生時に呼び出されるもの
    {
        bt.setLabel("こんにちは");
    }
}
}
