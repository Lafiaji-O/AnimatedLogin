package com.example.animatedlogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    String username, password;

   public void makeText (String string) {

       Toast.makeText(MainActivity.this, string, Toast.LENGTH_LONG).show();

   }


   public void submit (View view) {

       EditText usernameText = (EditText) findViewById(R.id.usernameText);
       EditText passwordText = (EditText) findViewById(R.id.passwordText);

       username = usernameText.getText().toString();
       password = passwordText.getText().toString();


       if (username.isEmpty()) {

           makeText("Please enter a username");

       } else if (username.equals(username) != username.equals("Damilola")) {

           makeText("Please enter a valid username");

       } else if (password.isEmpty()) {

           makeText("Please enter your password");

       } else if (password.length() < 6 || password.length() > 6) {

           makeText("Please make sure the password is 6 characters");

       } else if (password.equals(password) != password.equals("qwerty")) {

           makeText("You entered an incorrect password");

       } else  {

           makeText("Login Successful");

           ImageView cat1 = (ImageView) findViewById(R.id.cat1);
           ImageView cat2 = (ImageView) findViewById(R.id.cat2);

           cat1.animate().alpha(0f).setDuration(2000);
           cat2.animate().alpha(1f).setDuration(2000);


           /* This is just to practice use of arrays and maps in an actual example.
              Used to store the login details and display them in the log.
            */
           Map details = new HashMap();

           details.put("username", username);
           details.put("password", password);

           System.out.println(details.toString());
       }


   }

   public void clear (View view) {

       EditText usernameText = (EditText) findViewById(R.id.usernameText);
       EditText passwordText = (EditText) findViewById(R.id.passwordText);

       usernameText.getText().clear();
       passwordText.getText().clear();
   }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
