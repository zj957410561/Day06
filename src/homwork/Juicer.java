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
        // Thread.sleep(2000); // 让程序休眠2S
        System.out.println("榨苹果");
    }
}
