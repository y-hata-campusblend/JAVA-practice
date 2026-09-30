//アニメーションする

import java.awt.*;
import java.awt.event.*;

public class Sample7 extends Frame implements Runnable
{
    int num;

    public static void main(String[] args)
    {
        Sample7 sm = new Sample7();
    }
    public Sample7()
    {
        super("練習");

        addWindowListener(new SampleWindowListener());

        Thread th = new Thread(this);
        th.start();

        setSize(500,400);
        setVisible(true);
    }
    public void run()
    {
        try{
            for(int i=0; i<11; i++){
                num = i;
                repaint(); //描画を、、
                Thread.sleep(1000); //1秒ごと
            }
    }catch(InterruptedException e){}
    }
    public void paint(Graphics g)
    {
        String str = num +"です";
        g.drawString(str,200,200);  //文字が描画されるようにする
    }
    class SampleWindowListener extends WindowAdapter
    {
        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
    }
}