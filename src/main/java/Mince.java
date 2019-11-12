import java.util.HashMap;
import java.util.Map;

public class Mince {
    private int hodnotaMince;

    public Mince(int hodnotaMince) {
        this.hodnotaMince = hodnotaMince;
    }

    public int getHodnotaMince() {
        return hodnotaMince;
    }

    public void setHodnotaMince(int hodnotaMince) {
        this.hodnotaMince = hodnotaMince;
    }

    private Map<Integer, Mince> MinceMap = new HashMap<>();

    private void Mince(){
        MinceMap.put(1, new Mince(1));
        MinceMap.put(2, new Mince(2));
        MinceMap.put(3, new Mince(5));
        MinceMap.put(4, new Mince(10));
        MinceMap.put(5, new Mince(20));
        MinceMap.put(6, new Mince(50));

    }
}
