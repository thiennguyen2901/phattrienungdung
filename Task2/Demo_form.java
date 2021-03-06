package com.example.huu.demoform;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;
import java.util.StringTokenizer;

public class Demo_form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_form);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.demo_form, menu);
        ref = this.getSharedPreferences("com.demoform", Context.MODE_PRIVATE);
        ref.edit().clear().commit();
        addEvent();
        return true;
    }

    SharedPreferences ref;
    Button btnAdd;
    Button btnPrint;
    EditText txtID;
    EditText txtName;

    private void addEvent(){
        txtName = (EditText) this.findViewById(R.id.txtName);
        txtID = (EditText) this.findViewById(R.id.txtID);
        btnAdd = (Button) this.findViewById(R.id.btnAdd);
        btnPrint = (Button) this.findViewById(R.id.btnPrint);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ref.edit().putString(txtID.getText().toString(), txtName.getText().toString()).commit();
                txtID.setText("");
                txtName.setText("");
            }
        });
    }
}
