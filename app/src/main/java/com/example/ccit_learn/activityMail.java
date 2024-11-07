package com.example.ccit_learn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class activityMail extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_mail);
        Button btnSend = (Button) findViewById(R.id.sendMail);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// Membuat objek Intent
                Intent si = new Intent(Intent.ACTION_SEND);
// Mengatur MIME Type
                si.setType("message/rfc822");
// Mengatur data nilai untuk Alamat E-Mail
                si.putExtra(Intent.EXTRA_EMAIL, new String[]{"dharmawan1209@gmail.com"});
// Mengatur data nilai untuk Subject E-Mail
                si.putExtra(Intent.EXTRA_SUBJECT, "Welcome WIBU PNJ 3SE1");
// Mengatur data nilai untuk Badan E-Mail
                si.putExtra(Intent.EXTRA_TEXT, "Dharmawan Surya Kusuma");
/* Menjalankan Activity dengan parameter fungsi createChooser dengan
parameter objek Intent */
                startActivity(Intent.createChooser(si, "Choose Mail App"));
            }
        });
    }
}

