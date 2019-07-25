package com.nmsoft.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // requestWindowFeature(Window.FEATURE_NO_TITLE);
     //   getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main2);
    }

    public void VerLogin (View view) {
        EditText Edtemail = (EditText) findViewById(R.id.tlEmail);
        EditText EdtSenha = (EditText) findViewById(R.id.tlPass);

        String email = Edtemail.getText().toString();
        String senha = EdtSenha.getText().toString();

       if (email.equals("niedsonemanoeltbm@gmail.com")&&(senha.equals("10-20-30"))) {
           Alert("Login realizado com sucesso.");
        }else {
           Alert("Usuário ou senha incorretos.");
       }
    }
    private void Alert(String s) {
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
    }
}
