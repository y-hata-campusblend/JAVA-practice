//同じパッケージに含める

package pb;
//pbにするとエラーになる。pbパッケージの中の、  Carクラスを探しちゃうから。

class Sample3
{
    public static void main(String[] args)
    {
        Car car1 = new Car();
        car1.show();
    }
}

//このディレクトリの中からpaって名前のパッケージを探そう！って感じだから、パッケージ名のディレクトリにｃｄで移行しちゃうとエラーになる