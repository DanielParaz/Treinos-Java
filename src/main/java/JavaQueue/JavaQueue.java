package JavaQueue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class JavaQueue {
    public static void main(String[] args) {

        Queue<String> filadobanco = new LinkedList<>();

        filadobanco.add("Pamela");
        filadobanco.add("Patrícia");
        filadobanco.add("Roberto");
        filadobanco.add("Flávio");
        filadobanco.add("Anderson");

        System.out.println(filadobanco);

        String clienteASerAtendido = filadobanco.poll();

        System.out.println(clienteASerAtendido);

        System.out.println(filadobanco);

        String primeiroCliente = filadobanco.peek();

        System.out.println(primeiroCliente);

        System.out.println(filadobanco);

        //filadobanco.clear();

        String primeiroClienteOuErro =filadobanco.element();

        System.out.println(primeiroClienteOuErro);

        System.out.println(filadobanco);

        for (String cliente: filadobanco) {
            System.out.println(cliente);
        }

        Iterator<String> IteratorFIlaBanco = filadobanco.iterator();

        while (IteratorFIlaBanco.hasNext()) {
            System.out.println("---->" + IteratorFIlaBanco.next());
        }

        System.out.println(filadobanco.size());

        //filadobanco.clear();

        System.out.println(filadobanco.isEmpty());

        filadobanco.add("Wesley");

        System.out.println(filadobanco);


    }
}
