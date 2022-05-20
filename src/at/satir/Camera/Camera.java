package at.satir.Camera;

import at.satir.Phone.PhoneFile;

public class Camera {

    private int pixel;
    private int weight;
    private String color;


    public Camera(int pixel, int weight, String color) {
        this.pixel = pixel;
        this.weight = weight;
        this.color = color;
    }

    public Image takePicture(int size) {
        if (size == 1) {
            Image smallImage = new Image(100,"pic1");
            return smallImage;
        } else if (size == 2) {
            Image mediumImage = new Image(500,"pic2");
            return mediumImage;
        } else if (size == 3) {
            Image largeImage = new Image(1000,"pic3");
            return largeImage;
        }
        return null;
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
