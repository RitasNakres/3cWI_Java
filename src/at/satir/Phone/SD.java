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
}
