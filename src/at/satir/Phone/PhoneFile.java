package at.satir.Phone;

public class PhoneFile {

    private String extension;
    private int size; //Megabyte
    private String name;

    public PhoneFile(String extension, int size, String name) {
        this.extension = extension;
        this.size = size;
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return this.extension + " | " + this.name + " | " + this.size;
    }
}
