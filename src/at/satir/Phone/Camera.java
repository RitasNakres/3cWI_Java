package at.satir.Phone;

import java.util.ArrayList;
import java.util.List;

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

    public PhoneFile takePicture() {
        PhoneFile file = new PhoneFile("jpeg", 50, "pic " + fileNumber);
        fileNumber++;
        return file;
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
