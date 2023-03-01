import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3;
        double nota4;

        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.println("Digite a primeira nota: ");
        nota2 = sc.nextDouble();
        System.out.println("Digite a primeira nota: ");
        nota3 = sc.nextDouble();
        System.out.println("Digite a primeira nota: ");
        nota4 = sc.nextDouble();

        double mediaAlunos = (nota1 + nota2 + nota3 + nota4) / 4;

        String aprovacao = aprovaAluno(mediaAlunos);
        System.out.println(aprovacao + "e sua nota média foi: "+mediaAlunos);

    }
   public static String aprovaAluno(double mediaAlunos) {

        if (mediaAlunos >= 7) {
           return("O aluno está aprovado ");
       } else if (mediaAlunos == 5 || mediaAlunos == 6){
            return("O aluno está de recuperação ");
        } else {
            return ("o aluno reprovou ");
       }
   }
}