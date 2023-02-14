/**
 * @author danmach
 */
public class Carro {

    /**
     * Metodos do nosso Objeto "Carro
     */
    private String modelo;
    private String cor;
    private int anoFabricacao;
    private float preco;

    /**
     * Getters and Setters dos metodos
     * @return os propios metodos
     */
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
