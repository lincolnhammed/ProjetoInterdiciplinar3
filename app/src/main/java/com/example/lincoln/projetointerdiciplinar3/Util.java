package com.example.lincoln.projetointerdiciplinar3;

/**
 * Created by Lincoln on 04/06/2017.
 */

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by Lincoln on 26/04/2017.
 */

public class Util {
    public static String toString(InputStream is) throws IOException {
        BufferedReader br;
        StringBuilder sb;
        String line;
        br=new BufferedReader(new InputStreamReader(is));
        sb=new StringBuilder();

        while((line=br.readLine())!= null){
            sb.append(line);
        }
        br.close();



        return sb.toString();
    }

    public static Militar JSONToTempo(String jsonFile){
        JSONObject mainObj;
        Militar militar = null;
        try {
            mainObj = new JSONObject(jsonFile);

            String nome_militar = mainObj.getString("nome_Militar");

            militar = new Militar();
            militar.setNome_Militar(nome_militar);

        } catch (JSONException e) {
            e.printStackTrace();
        }finally {
            return militar;
        }
    }
}
