//フレームを使う

import java.awt.*;
import java.awt.event.*;

public class Sample1 extends Frame //フレームクラスを拡張する
{
    public static void main(String[] args)
    {
        Sample1 sm = new Sample1();  //拡張したクラスからオブジェクトを作成する。自分自身のオブジェクトを作詞絵
    }
    public Sample1()//親クラスのコンストラクタを呼びだす
    {
        super("サンプル");  //ウィンドウのタイトルの設定

        addWindowListener(new SampleWindowListener());  //「ウインドウで何か操作（×ボタンを押すなど）が起きたら、下に書いた SampleWindowListener で処理してね！」と登録しています

        setSize(250,200);  //ウィンドウのサイズを設定
        setVisible(true);  //ウィンドウが表示されるようにする。falseは非表示、不可視。
    }
    class SampleWindowListener extends WindowAdapter  //ウインドウ操作を受け取るためのクラスを継承しています。
    {
        public void windowClosing(WindowEvent e)  //ウィンドウを閉じることができるようにする
            System.exit(0);   //プログラム全体を正常終了させます。（これを書かないと、×ボタンを押しても画面が消えるだけでプログラム自体は裏で動き続けてしまいます）。
        }
}