package com.example.lincoln.projetointerdiciplinar3;

import android.app.Activity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class TelaPrincipal extends Activity {
    private ListView listMovimentacao;

    TextView textServer;
     @Override
  protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
        textServer = (TextView) findViewById(R.id.textServer);
        startAPI();

        TextView textMensagem = (TextView) findViewById(R.id.textMensagem);
        String recebida = getIntent().getStringExtra("MENSAGEM");
        textMensagem.setText(recebida);

        List<Movimentacao> produto=new ArrayList<>();

        produto.add(new Movimentacao(1,"12/12",18,"12:30","2839",
                new Militar(1,"lincoln",10, new Graduacao(1,"soldado"),new Subunidade(1,"nao sei")),
                new VTR(1,"fusca"),
                new Missao(1,"nome","descricao")));


        listMovimentacao=(ListView) findViewById(R.id.listProduto);
        ArrayAdapter<Movimentacao> produtoAdapter=new MovimentacaoAdapter(this,R.layout.movimentacao,produto);
        listMovimentacao.setAdapter(produtoAdapter);
    }
//     public void pesquisar(View view) {
//
//         TextView tPesquisa = (TextView) findViewById(R.id.tPesquisa);
//
//         String pesquisa = tPesquisa.getText().toString();
//
//         String teste= tPesquisa.getText().toString();
//         Pesquisa pesq = new Pesquisa();
//         pesq.setPesquisa(teste);
//
//     }

    public void startAPI(){
        new ConnectionAPI().execute();
    }
    private class ConnectionAPI extends AsyncTask<Void, Void, Militar> {
        @Override
        public void onPreExecute(){

        }
        @Override
        protected Militar doInBackground(Void... params) {
            HttpURLConnection con = null;



            try {
//                Pesquisa pesquisa =new Pesquisa();
//               String teste = pesquisa.getPesquisa();
                //172.31.0.83 10.0.2.2
                URL url = new URL("http://172.31.0.83:9999/ProjetoInterdiciplinar3.1/WS/Aluno/Recuperar?matricula=291");
                con = (HttpURLConnection) url.openConnection();
                con.setRequestMethod("GET");
                con.setDoInput(true);

                String resposta = Util.toString(con.getInputStream());
              Militar militar = Util.JSONToTempo(resposta);
                return militar;

            } catch (Exception e) {
                Log.e("error", e.getMessage());
            } finally {
                con.disconnect();

            }
            return null;
        }

        @Override
        public void onPostExecute(Militar militar){
            String info = "Nome: " + militar.getNome_Militar();
            info += "\nNumero Indentificação: " + militar.getNumero_indentificacao();
            info += "\nGraduacao: " + militar.getGraduacao().getPatente();
            info += "\nSubunidade: " + militar.getSubunidade().getSubunidade();
            textServer.setText(info);
        }
    }




}
