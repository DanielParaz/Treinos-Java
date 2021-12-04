package MapTreeComparator;

public class MapaComparator implements Comparable<MapaComparator> {
     private final String arvore;
     private final Integer tamanho;

     public MapaComparator(String arvore, Integer tamanho) {
         this.arvore = arvore;
         this.tamanho = tamanho;
     }
     public String getarvore() {return arvore;};
     public Integer gettamanho() {return tamanho;}

    @Override
    public String toString() {return arvore + " - " + tamanho;};

     @Override
    public int compareTo(MapaComparator o) {return this.gettamanho() - o.gettamanho();}


}
