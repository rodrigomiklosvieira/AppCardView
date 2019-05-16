package br.com.etecia.appcardview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.idToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Voltar");
        getSupportActionBar().setIcon(R.drawable.ic_voltar_dp);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_principal, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.mFavoritos:
                startActivity(new Intent(MainActivity.this, Favoritos_Activity.class));
                break;
            case R.id.mSobre:
                startActivity(new Intent(MainActivity.this, Sobre_Activity.class));
                break;
            case R.id.mCompartilhar:
                startActivity(new Intent(MainActivity.this, Compartilhar_Activity.class));
                break;
            case R.id.mConfiguracao:
                startActivity(new Intent(MainActivity.this, Configuracoes_Activity.class));
                break;
            case R.id.mTempo:
                startActivity(new Intent(MainActivity.this, Tempo_Activity.class));
                break;

        }

        return super.onOptionsItemSelected(item);
    }
}
