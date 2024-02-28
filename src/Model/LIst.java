package Model;

public class LIst<T> {
    private Object[] elementos;
    private int tamanho;
    private static final int TAMANHO_PADRAO = 30;
    
    public LIst() {
        this.elementos = new Object[TAMANHO_PADRAO];
        this.tamanho = 0;
    }
    
    public LIst(int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }
    
    public void adicionar(T elemento) {
        if (this.tamanho == this.elementos.length) {
            aumentarCapacidade();
        }
        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
    }
    
    public T obter(int indice) {
        if (indice < 0 || indice >= this.tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido: " + indice);
        }
        return (T) this.elementos[indice];
    }
    
    public int tamanho() {
        return this.tamanho;
    }
    
    private void aumentarCapacidade() {
        int novaCapacidade = this.elementos.length * 2;
        Object[] novoArray = new Object[novaCapacidade];
        for (int i = 0; i < this.elementos.length; i++) {
            novoArray[i] = this.elementos[i];
        }
        this.elementos = novoArray;
    }
}