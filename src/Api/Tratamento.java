package Api;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.StringReader;

public class Tratamento {

    private static final Call chamada = new Call();

    public static void formataData() {
        String jsonResponse = chamada.Get();

        if (jsonResponse != null) {
     
            JsonReader jsonReader = Json.createReader(new StringReader(jsonResponse));

            JsonObject jsonObject = jsonReader.readObject();

            jsonReader.close();

      
            if (jsonObject.containsKey("data")) {
       
                JsonArray dataArray = jsonObject.getJsonArray("data");

        
                for (JsonObject dataObject : dataArray.getValuesAs(JsonObject.class)) {
 
                    int id = dataObject.getInt("id");
                    String name = dataObject.getString("name");
                    String symbol = dataObject.getString("symbol");


          
                    System.out.println("ID: " + id);
                    System.out.println("Nome: " + name);
                    System.out.println("Símbolo: " + symbol);
                    System.out.println("----------------------------------");
                }
            } else {
                System.out.println("O JSON não possui a chave 'data'.");
            }
        } else {
            System.out.println("A resposta JSON é nula.");
        }
    }
}