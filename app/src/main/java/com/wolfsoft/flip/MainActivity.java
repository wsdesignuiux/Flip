package com.wolfsoft.flip;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText email;
    EditText pass;
    EditText again;
    EditText mob;
    TextView cont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/Hanken-Book.ttf");

        email = (EditText)findViewById(R.id.email);
        email.setTypeface(custom_font);
        pass = (EditText)findViewById(R.id.pass);
       pass.setTypeface(custom_font);
         again= (EditText)findViewById(R.id.again);
       again.setTypeface(custom_font);
        mob = (EditText)findViewById(R.id.mob);
        mob.setTypeface(custom_font);
        cont = (TextView)findViewById(R.id.cont);
        cont.setTypeface(custom_font);
    }
}
