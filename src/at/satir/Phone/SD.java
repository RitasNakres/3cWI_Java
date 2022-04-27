package at.satir.Phone;

import java.util.ArrayList;
import java.util.List;

public class SD {
    private int capacity;
    private List<PhoneFile> files;

    public SD(int capacity) {
        this.capacity = capacity;
        this.files = new ArrayList<>();
    }

    public void save(PhoneFile file) {
        files.add(file);
    }

    public int getCapacity() {
        return capacity;
    }

    public List<PhoneFile> getFiles() {
        return files;
    }

    public int getFreeSpace() {
        int size = 0;
        for (PhoneFile file : files) {
            size += file.getSize();
        }
        return capacity - size;
    }
}
