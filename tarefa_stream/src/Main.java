import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> listaNomesGeneros = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os nomes e gêneros separados por um traço (-) e cada par separado por vírgulas: ");
        String input = scanner.nextLine();

        String[] paresNomesGeneros = input.split(",");
        for (String par : paresNomesGeneros) {
            listaNomesGeneros.add(par.trim());
        }

        List<String> listaNomesFemininos = listaNomesGeneros.stream()
                .filter(nomeGenero -> nomeGenero.split("-")[1].equalsIgnoreCase("Feminino"))
                .map(nomeGenero -> nomeGenero.split("-")[0])
                .toList();

        System.out.println("Lista de nomes femininos: ");
        listaNomesFemininos.forEach(System.out::println);
    }
}
