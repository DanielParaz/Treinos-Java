package TreinosDesafiosJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gincana {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        List<String> listaAlunos = new ArrayList<>();

        int numerodeAlunos;
        String Aluno;
        String valorFicha;
        int valorAtualFicha;
        int IndiceAtual;
        int IndicedoAlunoEliminado;

        numerodeAlunos = Integer.parseInt(scr.next());

        while (numerodeAlunos > 0) {
            for (int i = 0; i < numerodeAlunos; i++) {
                Aluno = scr.next();
                valorFicha = scr.next();
                listaAlunos.add(Aluno.trim() + " " + valorFicha.trim());

            }
            IndiceAtual = 0;
            IndicedoAlunoEliminado = 0;
            valorAtualFicha = Integer.parseInt(listaAlunos.get(IndiceAtual).split(" ")[1]);

            for (int i = 0; i < numerodeAlunos; i++) {
                if (valorAtualFicha == 0) {
                    IndicedoAlunoEliminado = IndiceAtual;
                }else if (valorAtualFicha % 2 == 0) {
                    IndicedoAlunoEliminado = (listaAlunos.size() - (valorAtualFicha % listaAlunos.size()) + IndiceAtual) % listaAlunos.size();
                    valorAtualFicha = Integer.parseInt(listaAlunos.get(IndicedoAlunoEliminado).split(" ")[1]);
                    listaAlunos.remove(IndicedoAlunoEliminado);
                }else if (valorAtualFicha % 2 != 0) {
                    IndicedoAlunoEliminado = (valorAtualFicha % listaAlunos.size() + IndiceAtual) %listaAlunos.size();
                    valorAtualFicha = Integer.parseInt(listaAlunos.get(IndicedoAlunoEliminado).split(" ")[1]);
                    listaAlunos.remove(IndicedoAlunoEliminado);
                }
                IndiceAtual = (valorAtualFicha % 2 == 0) ?
                        ((IndicedoAlunoEliminado <= listaAlunos.size() - 1) ?
                        IndicedoAlunoEliminado : 0):
                        ((IndicedoAlunoEliminado == 0) ?
                                (listaAlunos.size() - 1):(IndicedoAlunoEliminado -1));

            }
            System.out.println("Vencedor(a) " + listaAlunos.get(0).split(" ")[0]);

            listaAlunos.clear();
            numerodeAlunos = Integer.parseInt(scr.next());
        }
        scr.close();
    }
}
