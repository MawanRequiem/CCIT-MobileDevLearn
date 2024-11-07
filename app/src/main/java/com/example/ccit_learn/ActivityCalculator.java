package com.example.ccit_learn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

public class ActivityCalculator extends Activity{
    String fungsi;
    Integer kode;
    Bundle b;
    boolean clicked = false;
        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_calculator);
            Intent intent = new Intent(ActivityCalculator.this, ActivityInput.class);
            Button btnAdd = (Button)findViewById(R.id.btnTambah);
            Button btnMin = (Button) findViewById(R.id.btnKurang);
            Button btnTim = (Button) findViewById(R.id.btnKali);
            Button btnDiv = (Button) findViewById(R.id.btnBagi);
            Button btnMod = (Button) findViewById(R.id.btnModulo);

            if(btnAdd.isSelected()) {

            } else if(btnMin.isSelected()){

            } else if(btnTim.isSelected()) {

            }else if(btnDiv.isSelected()){

            }else if(btnMod.isSelected()){

            }

        }
    }
