package controller;


import com.google.gson.Gson;
import model.Conocimiento;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;

public class JSONController {
 String jsonString = "{\n" +
         "  \"nombre\": \"Jessica\",\n" +
         "  \"apellidos\": \"Marulanda\",\n" +
         "  \"edad\": 22,\n" +
         "  \"hobbies\": [\n" +
         "    \"musica\",\n" +
         "    \"deporte\",\n" +
         "    \"cine\",\n" +
         "    \"informática\"\n" +
         "  ]}";

 public void pasarStringJSON() {
  // System.out.println(jsonString);
    JSONObject jsonObject = new JSONObject(jsonString);
    String nombre =jsonObject.getString("nombre");
    int edad = jsonObject.getInt("edad");
    JSONArray hobbies = jsonObject.getJSONArray("hobbies");
    System.out.println(nombre);
    System.out.println(edad);
    for (int  i=0; i< hobbies.length(); i++)
    {
     System.out.println(hobbies.getString(i));
    }
    //System.out.println(jsonObject);
 }
 public void leerFicheroJSON(){
     StringBuffer cadena = new StringBuffer();
     File file = new File("src/main/resources/Persona.json");
     BufferedReader bufferedReader = null;
     try {
         FileReader fileReader = new FileReader(file);
         bufferedReader = new BufferedReader(fileReader);
         String linea = null;
       while((linea= bufferedReader.readLine()) != null)
       {
           cadena.append(linea);
       }
       JSONObject jsonObject = new JSONObject(cadena.toString());
       JSONArray arrayConocimientos = jsonObject.getJSONArray("conocimiento");
         for (int i = 0; i < arrayConocimientos.length(); i++){
             JSONObject conocimiento = arrayConocimientos.getJSONObject(i);
             Gson gson = new Gson();
             Conocimiento conocimientojava = gson.fromJson(conocimiento.toString(),Conocimiento.class);
             System.out.println(conocimientojava.getConcepto());
             /*String concepto = conocimiento.getString("concepto");*/
         }
       //System.out.println(jsonObject);
     } catch (IOException e) {
         e.printStackTrace();
     }finally {
         try {
             bufferedReader.close();
         } catch (IOException e) {
             e.printStackTrace();
         }
     }


 }
}
