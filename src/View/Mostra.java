package View;

import java.util.List;
import View.Moeda;

public class Mostra {

    public static void mostraMoedas(List<Moeda> lista) {
        for (int i = 0; i < lista.size(); i++) {
            Moeda moeda = lista.get(i); 
            System.out.println("Moeda " + (i + 1) + ":");
            System.out.println("Symbol: " + moeda.getSymbol());
            System.out.println("Nome: " + moeda.getNome());
            System.out.println("Preço: " + moeda.getPreco());
            System.out.println("Base Preço: " + moeda.getBasePreco());
            System.out.println(); 
        }
    }
}