package br.com.danmach;

public class FerrariFactory extends CarroFactory{
    @Override
    public Tipo escolherTipo() {
        return new Combustao();
    }

    @Override
    public Origem escolherOrigem() {
        return new Importado();
    }
}
