import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Carro> carros = new ArrayList<>();

        CarroEsportivo carroEsportivo = new CarroEsportivo("Ferrari");
        CarroDeLuxo carroDeLuxo = new CarroDeLuxo("Bentley");
        CarroComum carroComum = new CarroComum("Siena");

        carros.add(carroEsportivo);
        carros.add(carroDeLuxo);
        carros.add(carroComum);

        for (Carro carro : carros){
            System.out.println(carro.getMarca());
        }

    }
}
