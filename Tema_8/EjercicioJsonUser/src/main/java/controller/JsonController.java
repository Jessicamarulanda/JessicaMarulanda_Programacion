package controller;

import com.google.gson.Gson;
import model.Name;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class JsonController {
    protected  int resultado;
    protected  String genero;
    public void lecturaUser(int resultado,String genero) {
        this.genero = genero;
        this.resultado = resultado;
        String  urlST= "https://randomuser.me/api/?results=" + resultado + "&agender" + genero;
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
                    JSONObject nombre = (JSONObject) arrayResultado.getJSONObject(i).get("name");


                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
