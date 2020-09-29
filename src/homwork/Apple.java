package homwork;

public class Apple {
    String brand;
    String color;
    String fusion;

    public Apple() {
        super();
    }

    public Apple(String brand, String color, String fusion) {
        this.brand = brand;
        this.color = color;
        this.fusion = fusion;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFusion() {
        return fusion;
    }

    public void setFusion(String fusion) {
        this.fusion = fusion;
    }

    public void behavior() {
        System.out.println("这个" + brand + "牌子的苹果颜色" + color + "口感" + fusion);
    }


}
