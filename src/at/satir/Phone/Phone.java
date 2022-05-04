package at.satir.Phone;

import java.util.ArrayList;
import java.util.List;

public class Phone {
    private SD sdCard;
    private Sim sim;
    private Camera camera;



    public Phone(SD sdCard, Sim sim, Camera camera) {
        this.sdCard = sdCard;
        this.sim = sim;
        this.camera = camera;
    }

    public void doCall(String number) {
        this.sim.doCall(number);
    }

    public void takePicture() {
        PhoneFile file = this.camera.takePicture();
        this.sdCard.save(file);
        System.out.println(file.getName());
    }

    public List<PhoneFile> printFiles() {
        List<PhoneFile> files = this.sdCard.getFiles();
        for (PhoneFile file : files) {
            System.out.println(file.getInfo());
        }
        return files;
    }

    public void addCamera(Camera camera) {
      this.camera.getCameras().add(camera);
    }

    public List<Camera> printCameras() {
        List<Camera> cameras = this.camera.getCameras();
        for (Camera camera : cameras) {
            System.out.println(camera.getName());
        }
        return cameras;
    }
}
