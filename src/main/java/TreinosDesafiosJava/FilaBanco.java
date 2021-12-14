package TreinosDesafiosJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilaBanco {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int linhas = Integer.parseInt(br.readLine());
        int qtdeNaoMudou;

        List<Integer> listnumeros = new ArrayList<>();
        List<Integer> listOrdenada = new ArrayList<>();

        for (int i = 0; i < linhas; i++) {
            qtdeNaoMudou = 0;
            var clientes = Integer.parseInt(br.readLine());
            var sms = br.readLine();

            listnumeros.addAll(Arrays.stream(sms.split(" ")).map(Integer::valueOf).collect(Collectors.toList()));
            listOrdenada.addAll(listnumeros.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

            for (int j = 0; j < clientes; j++) {
                if(listnumeros.get(j).compareTo(listOrdenada.get(j)) == 0){
                    qtdeNaoMudou++;
                }
            }
            System.out.println(qtdeNaoMudou);
            listnumeros.clear();
            listOrdenada.clear();
        }



    }
}
