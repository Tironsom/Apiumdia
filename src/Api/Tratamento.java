package Api;

import View.Moeda;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class Tratamento {

    private static final Call chamada = new Call();

    public static List<Moeda> formataData() {
        String jsonResponse = chamada.Get();
        List<Moeda> listaMoedas = new ArrayList<>();

        if (jsonResponse != null) {
            JsonReader jsonReader = Json.createReader(new StringReader(jsonResponse));
            JsonObject jsonObject = jsonReader.readObject();
            jsonReader.close();

            if (jsonObject.containsKey("data")) {
                JsonArray dataArray = jsonObject.getJsonArray("data");

                int i = 0;
                for (JsonObject dataObject : dataArray.getValuesAs(JsonObject.class)) {
                    Moeda m = new Moeda();
                    i++;
                    m.setId(i);
                    m.setSymbol(dataObject.getString("symbol"));
                    m.setNome(dataObject.getString("baseAsset"));
                    m.setPreco(dataObject.getInt("maxPrice"));
                    m.setBasePreco(dataObject.getString("quoteAsset"));

                    listaMoedas.add(m);
                }
            } else {
                System.out.println("O JSON não possui a chave 'data'.");
            }
        } else {
            System.out.println("A resposta JSON é nula.");
        }
        
        return listaMoedas;
    }
}