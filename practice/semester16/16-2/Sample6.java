//マウスで描画する

import java.awt.*;
import java.awt.event.*;

public class Sample6 extends Frame
{
    int x = 10;
    int y = 10;

    public static void main(String[] args)
    {
        Sample6 sm = new Sample6();
    }
    public Sample6()
    {
        super("練習");

        addWindowListener(new SampleWindowListener());
        addMouseListener(new SampleMouseAdapter());

        setSize(500,400);
        setVisible(true);
    }
    public void paint(Graphics g) //paintメソッドを上書き
    {
        g.setColor(Color.RED);
        g.fillOval(x,y,10,10); //図形を描画する処理
    }

    class SampleWindowListener extends WindowAdapter
    {
        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
    }
    class SampleMouseAdapter extends MouseAdapter
    {
        public void mousePressed(MouseEvent e) //マウスを押したときに
        {
            x = e.getX();  //推した位置の取得
            y = e.getY();
            repaint();  //図形が描画されるようになる
        }
    }

}

