package br.com.danmach;

public class GMFactory extends CarroFactory{
    @Override
    public Tipo escolherTipo() {
        return new Eletrico();
    }

    @Override
    public Origem escolherOrigem() {
        return new Nacional();
    }
}
