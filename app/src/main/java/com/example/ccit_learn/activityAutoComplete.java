package com.example.ccit_learn;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.annotation.Nullable;

public class activityAutoComplete extends Activity {
    AutoCompleteTextView autocomplit;
    //Pembuatan array untuk saran di dalam auto complete

    String[] arr = {"skibidi","gyattt","ohio","rizzz","Kai Cenat"};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.control_autocomplete);
        autocomplit = (AutoCompleteTextView) findViewById(R.id.autoCompleteCoba);
//        Membuat sebuah adapter yang berfungsi sebagai perantara dengan sebuah data set,
//        pada case ini adalah array mungkin contoh lain bisa database?
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, arr);
//        Berfungsi untuk set minimum karakter yang dimasukan untuk memunculkan auto complete
        autocomplit.setThreshold(1);
//         Set adapter untuk digunakan
        autocomplit.setAdapter(adapter);
    }
}
