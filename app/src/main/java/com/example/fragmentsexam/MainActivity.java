package com.example.fragmentsexam;

import androidx.appcompat.app.AppCompatActivity;
//import androidx.fragment.app.Fragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner spin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spin = (Spinner)findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Fragment FragmentSelected = null;
                switch (position){
                    case 0:
                        FragmentSelected = new ListFragmentos();

                    case 1:
                        FragmentSelected = new GridFragmentos();
                }
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.fragmento, FragmentSelected);
                transaction.commit();


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}