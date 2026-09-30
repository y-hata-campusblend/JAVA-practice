//マウスに反応させる

import java.awt.*;
import java.awt.event.*;

public class Sample4 extends Frame
{
    private Button bt;

    public static void main(String[] args)
    {
        Sample4 sm = new Sample4();
    }
    public Sample4()
    {
        super("サンプル");

        bt = new Button("ようこそ。");
        add(bt);

        addWindowListener(new SampleWindowListener());
        bt.addMouseListener(new SampleMouseListener());

        setSize(500,400);
        setVisible(true);
     }

     class SampleWindowListener extends WindowAdapter
     {
        public void windowClosing(WindowEvent e)
        {
         System.exit(0);
        }
     }
     class SampleMouseListener implements MouseListener {
         public void mouseClicked(MouseEvent e) {
         }

         public void mouseReleased(MouseEvent e) {
         }

         public void mousePressed(MouseEvent e) {
         }

         public void mouseEntered(MouseEvent e) {
         }

         {
             bt.setLabel("いらっしゃいませ");//マウスが入ったとき
         }

         public void mouseExited(MouseEvent e) {
             bt.setLabel("ようこそ。");//マウスが出たときに行われる
         }
     }
}