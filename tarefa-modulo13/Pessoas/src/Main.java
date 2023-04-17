public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoa1 = new PessoaFisica();
        pessoa1.setNome("Danilo");
        pessoa1.setCpf("111.222.333-44");

        PessoaJuridica pessoa2 = new PessoaJuridica();
        pessoa2.setNome("Fred");
        pessoa2.setCnpj("11.222.333/0001-44");
    }
}
