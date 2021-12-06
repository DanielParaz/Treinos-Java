package StreamExercicios;

public class Estudante {

    private final String nome;
    private final Integer idade;
    private final String serie;


    public Estudante(String nome, Integer idade,String serie) {
        this.nome = nome;
        this.idade = idade;
        this.serie = serie;
    }
    public String getNome() {return nome;}
    public Integer getIdade() {return idade;}
    public String getSerie() {return serie;}
    @Override
    public String toString() {return "Nome: " + nome + " Idade: " + idade + " Serie: " + serie;}



}
