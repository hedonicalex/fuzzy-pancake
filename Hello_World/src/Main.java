import java.awt.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        Car myCar=new Car(Color.WHITE,"Mercedes");

        System.out.println("Print from Main.java. Details of your car");
        System.out.println("Brand: "+myCar.brand);
        System.out.println("Color: "+myCar.color);
    }

}
