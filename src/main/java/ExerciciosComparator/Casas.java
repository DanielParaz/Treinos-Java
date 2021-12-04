package ExerciciosComparator;

public class Casas implements Comparable<Casas> {

    private final String casa;
    private final Integer perimetro;

    public Casas(String casa, Integer perimetro) {
        this.casa = casa;
        this.perimetro = perimetro;
    }
    public String getCasa() {return casa; }

    public Integer getperimetro() {return perimetro; }

    @Override
    public String toString() {return casa + " - " + perimetro;}

    @Override
    public int compareTo(Casas o) {return this.getperimetro() - o.getperimetro();}


}
