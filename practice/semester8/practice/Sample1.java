//semester8 p258 q5

//My pointクラス

class Mypoint
{
    int X;
    int Y;
    //フィールドの設定

    void setX(int a){
        X = a;
    }

    void setY(int b){
        Y = b;
    }

    int getX(){
        System.out.println("X座標を調べました");
        return X;
        //Xの値もって戻ってねってこと。
    }
    //引数ない場合は空欄（）

    int getY() {
        System.out.println("Y座標を調べました");
        return Y;
    }
}

class Sample1 {
    public static void main(String[] args) {
        Mypoint poi = new Mypoint();
        //Mypointclassに接続できるpoiという名前の変数を作ってる

        poi.setX(1234);
        poi.setY(5678);

        int Xa = poi.getX();
        int Ya = poi.getY();
        //代入してねってこと。

        System.out.println("X座標は" + Xa + "Y座標は" + Ya + "です");
    }
}
