package View;
public class Moeda{

    private static String nome;
    private static int id;
    private static String Data ;
    private static int preco;
    private static String basePreco;
    private static String symbol;

    public Moeda(String nome, int id, String Data, int preco, String basePreco, String symbol) {
        this.nome = nome;
        this.id = id;
        this.Data = Data;
        this.preco = preco;
        this.basePreco= basePreco;
        this.symbol = symbol;
    }


    public Moeda() {
        
    }

    public static String getSymbol() {
        return nome;
    }

    public void setSymbol(String symbol) {
        this.symbol= symbol;
    }

    public static String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBasePreco() {
        return nome;
    }

    public void setBasePreco(String basePreco) {
        this.basePreco = basePreco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPreco() {
        return id;
    }

    public void setPreco(int Preco) {
        this.id = id;
    }


    public int getData() {
        return id;
    }

    public void setData(int id) {
        this.id = id;
    }
}