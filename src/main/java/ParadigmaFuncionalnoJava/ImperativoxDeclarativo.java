package ParadigmaFuncionalnoJava;

import java.util.function.Function;

public class ImperativoxDeclarativo {
    public static void main(String[] args) {
        Function<Integer, Object> buscarUsuario = idUsuario ->
                //buscar meu usuario
                new Object();
        System.out.println(buscarUsuario.apply(15));

    }

    }

