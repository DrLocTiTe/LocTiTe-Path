package U5.Examen;

import java.util.Comparator;

public class compararQuemar implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Minecraft) o1).capQuemar - ((Minecraft) o2).capQuemar;
    }
}
