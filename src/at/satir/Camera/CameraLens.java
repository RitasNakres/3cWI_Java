package at.satir.Camera;

public class CameraLens {
    private int focalDistance;
    private Producer producer;

    public CameraLens(int focalDistance, Producer producer) {
        this.focalDistance = focalDistance;
        this.producer = producer;
    }

    public int getFocalDistance() {
        return focalDistance;
    }

    public void setFocalDistance(int focalDistance) {
        this.focalDistance = focalDistance;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }
}
