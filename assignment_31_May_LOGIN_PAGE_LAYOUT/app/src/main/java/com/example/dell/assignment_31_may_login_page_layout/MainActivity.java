package com.example.dell.assignment_31_may_login_page_layout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = (Button) findViewById(R.id.reset);
        b1.setOnClickListener(this);

    }

    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.reset:
                EditText mai = (EditText)findViewById(R.id.mail);
                EditText pas = (EditText)findViewById(R.id.pass);
                mai.setText("");
                pas.setText("");
                break;
        }
    }

}
