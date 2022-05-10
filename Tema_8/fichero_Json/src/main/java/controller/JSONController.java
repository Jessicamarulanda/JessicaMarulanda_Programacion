package controller;


import com.google.gson.Gson;
import model.Asignaturas;
import model.Conocimiento;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class JSONController {
    ArrayList<Asignaturas> asignaturas;
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

 public void leerAsignatura(String nombre,int numero){
     StringBuffer cadena = new StringBuffer();
     File file = new File("src/main/resources/asignaturas.json");
     BufferedReader bufferedReader = null;
     asignaturas = new ArrayList<>();
     try {
         FileReader fileReader = new FileReader(file);
         bufferedReader = new BufferedReader(fileReader);
         String linea = null;
         while((linea= bufferedReader.readLine()) != null)
         {
             cadena.append(linea);
         }
         JSONObject jsonObject = new JSONObject(cadena.toString());
         JSONArray arrayAsignatursas = jsonObject.getJSONArray("asignaturas");
         for (int i = 0; i < arrayAsignatursas.length(); i++){
             JSONObject asignatura = arrayAsignatursas.getJSONObject(i);
             Gson gson = new Gson();
             Asignaturas asignaturasjava = gson.fromJson(asignatura.toString(), Asignaturas.class);
             asignaturas.add(asignaturasjava);
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
 public void caracteristicasAsignaturas(Asignaturas asignaturas){
     System.out.println(asignaturas.getNombre());
     asignaturas.getProfesor().mostrarDatos();
     System.out.println(asignaturas.getSiglas());
     System.out.println(asignaturas.getHora());
     asignaturas.leerConocimiento();
     System.out.println();

 }
 public void lecturaJSONAPI() {
     String  urlST= "https://randomuser.me/api/?results=5000";
     try {
         URL url = new URL(urlST);
         try {
             HttpURLConnection connection =(HttpURLConnection) url.openConnection();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
           //  System.out.println(connection);
             BufferedReader bufferedReader1;
             bufferedReader1 = new BufferedReader(new InputStreamReader(connection.getInputStream()));
             StringBuffer stringBuffer = new StringBuffer();
             String linea = null;
             while ((linea=bufferedReader1.readLine()) != null)
             {
                 stringBuffer.append(linea);
             }

             String response = stringBuffer.toString();
             JSONObject responseJSON = new JSONObject(response);
             JSONArray arrayResultado = responseJSON.getJSONArray("results");

             for (int i = 0; i < arrayResultado.length() ; i++) {
                 JSONObject objetoResultado = arrayResultado.getJSONObject(i);
                 //System.out.println(objetoResultado);
                 String mail = objetoResultado.getString("email");
                 System.out.println(mail);
             }
         } catch (IOException e) {
             e.printStackTrace();
         }
     } catch (MalformedURLException e) {
         e.printStackTrace();
     }
 }
}
