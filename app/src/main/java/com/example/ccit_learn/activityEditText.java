package com.example.ccit_learn;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import androidx.annotation.Nullable;

public class activityEditText extends Activity {
    EditText eText;
    Button btn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contoh_edittext);

        //Inisialisasi value dari variabel dengan value yang di isikan pada UI
        eText = (EditText) findViewById(R.id.editText);
        btn = (Button) findViewById(R.id.buttonEditText);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String str = eText.getText().toString();
                Toast msg = Toast.makeText(getBaseContext(), str, Toast.LENGTH_LONG);
                msg.show();
            }
        });
    }
}
