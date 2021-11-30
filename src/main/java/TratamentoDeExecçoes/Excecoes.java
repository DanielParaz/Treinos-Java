package TratamentoDeExecçoes;

class Exception {
    public static void metodo() {
        try {
            new java.io.FileInputStream("ErroCausado.txt");
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Não foi possível abrir o arquivo de erro para leitura");
        }

    }
}
