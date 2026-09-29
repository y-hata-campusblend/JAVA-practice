package pb;
import pc.Car; //今はカークラスのみimportされてる

class Sample6
{
    public static void main(String[] args)
    {
        Car car1 = new Car();
        car1.show();// pc.Car car1 = new pc.Car();と記載する必要がない。importしてるから
    }
}