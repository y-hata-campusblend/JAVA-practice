//p299 q5

class Mypoint {
    private int x;
    private int y;

    public Mypoint() {
        x = 0;
        y = 0;
        System.out.println("初期座標を(" + x + "," + y + ")に設定しました。");
        //初期座標を0.0とする
    }

    public Mypoint(int px, int py) {
        if (px >= 0 && px <= 100 && py >= 0 && py <= 100) {
            x = px;
            y = py;
            System.out.println("初期座標を(" + x + "," + y + ")に設定しました。");
        } else {
            System.out.println("正確な値ではない");
        }
    }

    public void setX(int px){
        x = px;
        System.out.println("x="+x);
    }

    public void setY(int py){
        y = py;
        System.out.println("y="+y);

    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}

class Sample1
{
    public static void main(String[] args){

        Mypoint a = new Mypoint();
        a.setX(15);
        a.setY(25);

        Mypoint b = new Mypoint(10,20);
        int num = b.getX();
        int num2 = b.getY();

        System.out.println(num+","+num2);
    }
}
