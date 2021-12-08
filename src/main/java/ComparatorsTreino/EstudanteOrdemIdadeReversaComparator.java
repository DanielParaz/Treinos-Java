package ComparatorsTreino;

import java.util.Comparator;

public class EstudanteOrdemIdadeReversaComparator implements Comparator<ComparatorsListExample.Estudante> {

    @Override
    public int compare(ComparatorsListExample.Estudante o1, ComparatorsListExample.Estudante o2) {
        return o2.getIdade() - o1.getIdade();
    }
}
