package com.example.lincoln.projetointerdiciplinar3;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class TelaPrincipal extends Activity {
    private ListView listMovimentacao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

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
}
