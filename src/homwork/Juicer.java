package homwork;

public class Juicer {
    String brand;

    public Juicer() {
    }

    public Juicer(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void Juice(Apple apple)
    {
        System.out.println("榨苹果");
    }
}
