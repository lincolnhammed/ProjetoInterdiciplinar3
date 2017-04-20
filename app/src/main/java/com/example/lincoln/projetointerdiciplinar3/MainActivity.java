package com.example.lincoln.projetointerdiciplinar3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

            public void abrirMensagem(View view){
                TextView tLogin=(TextView) findViewById(R.id.tLogin);
                TextView tSenha=(TextView) findViewById(R.id.tSenha);
                String login=tLogin.getText().toString();
                String senha=tSenha.getText().toString();

                if(login.equals("lincoln")&&senha.equals("1234")){
                    alert("Login realizado com Sucesso");

                    Intent novaTela= new Intent(this, TelaPrincipal.class);
                    novaTela.putExtra("MENSAGEM",login);
                    startActivity(novaTela);

                }else
                    alert("Login ou senha incorretos");
        }

    private void alert(String s){
        Toast.makeText(this,s,Toast.LENGTH_LONG).show();

    }
}
