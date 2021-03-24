package com.example.myagriapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    EditText deviceid, pass;
    Button loginsuccess;
    int i = 0;

    // DBHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        //   getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void LOGIN (View view) {
        startActivity(new Intent(this, Dashboard.class));
    }

  /*      retrofitClient = new RetrofitClient();
        deviceid = (EditText) findViewById(R.id.login);
        pass = (EditText) findViewById(R.id.password);
        loginsuccess = (Button) findViewById(R.id.buttonlogin);

      /* loginsuccess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = deviceid.getText().toString();
                String password = pass.getText().toString();
                usePost(username, password);

            }


        });*/
    }


   /* private void usePost(String username, String password) {
        retrofitClient.loginPost(username, password);

    }
    public void LOGIN (View view) {
        String username = deviceid.getText().toString();
        String password = pass.getText().toString();
        usePost(username, password);
     //   Intent intent = new Intent(LoginActivity.this,Dashboard.class);
       // startActivity(intent);

    }

}

    /*        db = new DBHelper(this);
    
            loginbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String user = deviceid.getText().toString();
                    String pass = password.getText().toString();
                    if (user.equals(" ") || pass.equals(" ")) {
                        Toast.makeText(LoginActivity.this, "Please enter all fields", Toast.LENGTH_SHORT).show();
                    } else {
                        Boolean checkuserpass = db.checkpassword(user,pass);
                        Boolean checkuserid=db.checkid(user);
                        if(checkuserpass==true && checkuserid==true) {
                            Toast.makeText(LoginActivity.this, "Login successful", Toast.LENGTH_SHORT).show();
    
                            Intent intent = new Intent(getApplicationContext(), Dashboard.class);
                            startActivity(intent);
                        }
                        else {
                            Toast.makeText(LoginActivity.this,"Invalid Credentials",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            });
        }
        }
    
    
    
    
         /*   button.setOnClickListener(new View.OnClickListener() {
    
                @Override
                public void onClick(View v)
                {
                    openNewActivity();
                }
            });
        }
    public void LOGIN (View view) {
        startActivity(new Intent(this, Dashboard.class));
    }

}
   public void REGISTER (View view){
        startActivity(new Intent(this,Register.class));
    } */
