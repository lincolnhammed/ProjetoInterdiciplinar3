package com.example.lincoln.projetointerdiciplinar3;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
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

            public void abrirMensagem(View view) {
                BancoLoginController crud = new BancoLoginController(getBaseContext());
                TextView tLogin = (TextView) findViewById(R.id.tLogin);
                TextView tSenha = (TextView) findViewById(R.id.tSenha);
                String login = tLogin.getText().toString();
                String senha = tSenha.getText().toString();
                boolean resultado;

                LoginMODEL entrar = new LoginMODEL(login, senha);

                resultado = crud.entrar(entrar);

                if (resultado) {
                    alert("boaaaaaaaaaaaaaaaaaaa");
                    Intent intent = new Intent(MainActivity.this, TelaPrincipal.class);
                    startActivity(intent);
                    finish();
                } else {
                    alert("Login ou senha incorretos");
                }
//                    Intent novaTela= new Intent(this, TelaPrincipal.class);
//                    novaTela.putExtra("MENSAGEM",login);
//                    startActivity(novaTela);

            }

    public void inserir(View v){
        Intent intent = new Intent(MainActivity.this,InsereLoginActivity.class);
        startActivity(intent);
    }

                private void alert(String s) {
                    Toast.makeText(this, s, Toast.LENGTH_LONG).show();
                }



    }





