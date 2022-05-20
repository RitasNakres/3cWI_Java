package at.satir.Phone;

import java.util.ArrayList;

public class Camera {
    private int resolution;
    private int fileNumber = 0;
    private ArrayList<Camera> cameras;
    private String name;

    public Camera(int resolution, String name) {
        this.resolution = resolution;
        this.name = name;
        this.cameras = new ArrayList<>();
    }

    public PhoneFile takePicture(int size) {
        if (size == 1) {
            PhoneFile fileSmall = new PhoneFile("jpeg", 250, "pic " + fileNumber);
            fileNumber++;
            return fileSmall;
        } else if (size == 2) {
            PhoneFile fileMedium = new PhoneFile("jpeg", 500, "pic " + fileNumber);
            fileNumber++;
            return fileMedium;
        } else if (size == 3) {
            PhoneFile fileBig = new PhoneFile("jpeg", 1000, "pic " + fileNumber);
            fileNumber++;
            return fileBig;
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Camera> getCameras() {
        return cameras;
    }

    public int getInfo() {
        return this.resolution;
    }
}
