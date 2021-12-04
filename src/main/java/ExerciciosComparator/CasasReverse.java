package ExerciciosComparator;


import java.util.Comparator;

public class CasasReverse implements Comparator<Casas> {
    @Override
    public int compare(Casas o1, Casas o2) {
        return o2.getperimetro() - o1.getperimetro();
    }
}