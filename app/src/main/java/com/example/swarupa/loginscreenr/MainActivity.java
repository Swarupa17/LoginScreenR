package com.example.swarupa.loginscreenr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginButton();


    }

    private void loginButton() {
        final EditText username = (EditText)findViewById(R.id.editText2);
        final EditText password = (EditText)findViewById(R.id.editText1);
        Button login_Button=(Button)findViewById(R.id.btnSubmit);
        login_Button.setOnClickListener(
                new  View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        if (username.getText().toString().equals("User")&& password.getText().toString().equals("password"))
                        {
                            Toast.makeText(MainActivity.this,"UserName and Password Valid",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent("com.example.swarupa.loginscreenr.Second");
                            startActivity(intent);
                        }else
                        {
                            Toast.makeText(MainActivity.this,"UserName and Password not valid",Toast.LENGTH_SHORT).show();
                        }


                    }
                }
        );
    }
}
