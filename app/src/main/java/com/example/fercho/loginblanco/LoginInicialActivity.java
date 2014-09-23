package com.example.fercho.loginblanco;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;
import org.json.JSONArray;
import java.util.ArrayList;


public class LoginInicialActivity extends Activity {
    EditText txtUsername;
    EditText txtPass;
    Button btnLogin;
    TextView txtRegister;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_inicial);


        txtUsername = (EditText)this.findViewById(R.id.txtUsername);
        txtPass = (EditText)this.findViewById(R.id.txtPass);
        btnLogin = (Button)this.findViewById(R.id.send);


        btnLogin.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                Intent listview = new Intent(LoginInicialActivity.this,ListChanceActivity.class);
                LoginInicialActivity.this.startActivity(listview);
                /*
                ArrayList parametros = new ArrayList();
                parametros.add("usuario");
                parametros.add(txtUsername.getText().toString());
                parametros.add("Contraseña");
                parametros.add(txtPass.getText().toString());*/


            }
        });
        txtRegister = (TextView)this.findViewById(R.id.txtRegister);
        txtRegister.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itemIntent = new Intent (LoginInicialActivity.this,RegisterActivity.class);
                LoginInicialActivity.this.startActivity(itemIntent);
            }
        });

        }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.login_inicial, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
