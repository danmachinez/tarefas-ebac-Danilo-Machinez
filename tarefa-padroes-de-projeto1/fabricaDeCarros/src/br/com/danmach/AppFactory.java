package br.com.danmach;

public class AppFactory {
    private static Carro pedirCarro(String fabrica){
        CarroFactory car = switch (fabrica) {
            case "gm" -> new GMFactory();
            case "ferrari" -> new FerrariFactory();
            default -> null;
        };
        Carro carro = new Carro();
        carro.setTipo(car.escolherTipo());
        carro.setOrigem(car.escolherOrigem());
        return carro;
    }

    public static void main(String[] args) {
        Carro car1 = pedirCarro("gm");
        Carro car2 = pedirCarro("ferrari");
    }
}
