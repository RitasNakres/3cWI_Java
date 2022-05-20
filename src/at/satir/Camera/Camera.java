package at.satir.Camera;

public class Camera {
    private int pixel;
    private int weight;
    private String color;


    public Camera(int pixel, int weight, String color) {
        this.pixel = pixel;
        this.weight = weight;
        this.color = color;
    }

    public int getPixel() {
        return pixel;
    }

    public void setPixel(int pixel) {
        this.pixel = pixel;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
