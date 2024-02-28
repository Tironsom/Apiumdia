package View;
class Moeda{

    private String nome;
    private int id;
    private String Data ;
    private int preco;


    public Moeda(String nome, int id, String Data, int preco) {
        this.nome = nome;
        this.id = id;
        this.Data = Data;
        this.preco = preco;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getData() {
        return id;
    }

    public void setData(int id) {
        this.id = id;
    }
}