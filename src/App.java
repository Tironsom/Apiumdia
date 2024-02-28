
import Api.Tratamento;
import View.Mostra;

public class App {
    public static void main(String[] args) throws Exception {
        Mostra m  = new Mostra();
        Tratamento t = new Tratamento();
        m.mostraMoedas(t.formataData());
   

    }
}
