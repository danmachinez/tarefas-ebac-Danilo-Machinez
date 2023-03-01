import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valorPrim;

        System.out.println("Digite um valor qualquer inteiro: ");
        valorPrim = sc.nextInt();

        Integer valorWrapper = valorPrim;

        System.out.println("Agora o valor "+valorWrapper+" está em forma de Wrapper.");

    }
}