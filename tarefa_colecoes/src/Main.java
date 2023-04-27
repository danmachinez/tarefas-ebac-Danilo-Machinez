import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os nomes separados APENAS por vírgula: ");
        String input = scanner.nextLine();

        String[] nomes = input.split(",");
        Arrays.sort(nomes, String.CASE_INSENSITIVE_ORDER);

        System.out.println("Nomes ordenados em ordem alfabética: ");
        for (String nome : nomes) {
            System.out.println(nome.trim());
        }
    }
}
