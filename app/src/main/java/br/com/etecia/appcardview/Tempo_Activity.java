package br.com.etecia.appcardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class Tempo_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tempo_layout);

        Toolbar toolbar = (Toolbar) findViewById(R.id.idToolbarTempo);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Places");
    }
}
