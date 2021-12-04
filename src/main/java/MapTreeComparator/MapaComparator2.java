package MapTreeComparator;

import java.util.Comparator;

public class MapaComparator2 implements Comparator<MapaComparator> {
    @Override
    public int compare(MapaComparator o1, MapaComparator o2) {return o2.gettamanho() - o1.gettamanho();}
}
