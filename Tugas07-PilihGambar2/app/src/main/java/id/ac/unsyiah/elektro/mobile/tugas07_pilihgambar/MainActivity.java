package id.ac.unsyiah.elektro.mobile.tugas07_pilihgambar;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void klik(View v) {
        ImageView gambar = (ImageView) findViewById(R.id.Tampil);
        Spinner spinner = (Spinner) findViewById(R.id.pilihan);

        final String pilihan = spinner.getSelectedItem().toString().trim();

        if (pilihan.equals("Mobil")) {
            gambar.setImageResource(R.drawable.mobil);
        } else if (pilihan.trim().equals("Sepeda Motor")) {
            gambar.setImageResource(R.drawable.astut);
        }else if (pilihan.trim().equals("Becak Dayung")) {
            gambar.setImageResource(R.drawable.bdayung);
        }else if (pilihan.trim().equals("Becak Motor")) {
            gambar.setImageResource(R.drawable.bmotor);
        }else if (pilihan.trim().equals("Sepeda")) {
            gambar.setImageResource(R.drawable.sepe);
        }
    }
}