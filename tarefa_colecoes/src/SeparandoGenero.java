import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SeparandoGenero {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite os nomes e gêneros separados por traço (-), cada conjunto separado por vírgula (,):");
        String nomesGeneros = input.nextLine();

        // Separa os nomes e gêneros em um array de strings
        String[] arrayNomesGeneros = nomesGeneros.split(",");

        // Cria as listas de nomes masculinos e femininos
        List<String> masculinos = new ArrayList<>();
        List<String> femininos = new ArrayList<>();

        // Percorre o array de nomes e gêneros e adiciona cada nome na lista correspondente
        for (String nomeGenero : arrayNomesGeneros) {
            String[] nomeGeneroArray = nomeGenero.split("-");
            String nome = nomeGeneroArray[0].trim();
            String genero = nomeGeneroArray[1].trim().toLowerCase();

            if (genero.equals("masculino")) {
                masculinos.add(nome);
            } else if (genero.equals("feminino")) {
                femininos.add(nome);
            }
        }

        // Ordena as listas em ordem alfabética
        Collections.sort(masculinos);
        Collections.sort(femininos);

        // Imprime as listas de nomes masculinos e femininos
        System.out.println("Nomes masculinos: " + masculinos);
        System.out.println("Nomes femininos: " + femininos);

    }

}
