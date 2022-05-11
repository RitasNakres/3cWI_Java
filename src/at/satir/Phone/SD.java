package at.satir.Phone;

import java.util.ArrayList;
import java.util.List;

public class SD {
    private int capacity; // Megapixel
    private List<PhoneFile> files;

    public SD(int capacity) {
        this.capacity = capacity;
        this.files = new ArrayList<>();
    }

    public void save(PhoneFile file) {
        files.add(file);
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<PhoneFile> getFiles() {
        return files;
    }

    public int getFreeSpace() {
        int size = 0;

        for (PhoneFile phoneFile : files) {
            size += phoneFile.getSize();
        }
        if (capacity <= size) {
            System.out.println("Can't take picture");
            setCapacity(size);
        } else {
            return capacity - size;
        }
        return capacity;
    }
}
