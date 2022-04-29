package at.satir.Phone;

import java.util.ArrayList;
import java.util.List;

public class Camera {
    private int resolution;
    private int fileNumber = 0;
    private List<Camera> cameras;
    private String name;


    public Camera(int resolution) {
        this.resolution = resolution;
        this.cameras = new ArrayList<>();
    }


    public PhoneFile takePicture() {
        PhoneFile file = new PhoneFile("jpeg", 50, "pic " + fileNumber);
        fileNumber++;
        return file;
    }

    public List<Camera> getCamera() {
        return cameras;
    }

    public String getName(){
        return name;
    }
}
