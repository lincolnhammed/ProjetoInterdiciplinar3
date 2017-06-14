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
        Graduacao graduacao = null;
        Subunidade subunidade = null;

        try {
            mainObj = new JSONObject(jsonFile);
            JSONObject nomeObj = mainObj.getJSONObject("objeto");
            String nome_militar = nomeObj.getString("nome_Militar");
            int numero_indentificacao = nomeObj.getInt("numero_indentificacao");


            JSONObject nomeObj1 = nomeObj.getJSONObject("graduacao");
            String patente = nomeObj1.getString("patente");
            long id = nomeObj1.getLong("id_Graduacao");

            JSONObject nomeObj2 = nomeObj.getJSONObject("subunidade");
            String subunidade1 = nomeObj2.getString("subunidade");

            militar = new Militar();
            graduacao =new Graduacao();
            subunidade = new Subunidade();
            graduacao.setPatente(patente);
            subunidade.setSubunidade(subunidade1);

            militar.setNome_Militar(nome_militar);
            militar.setNumero_indentificacao(numero_indentificacao);
            militar.setGraduacao(graduacao);
            militar.setSubunidade(subunidade);


        } catch (JSONException e) {
            e.printStackTrace();
        }finally {
            return militar;
        }
    }
}
