package id.ac.unsyiah.elektro.mobile.testawalinclusive;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

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
    public void KlikHasil(View view) {
            EditText awal= (EditText) findViewById(R.id.Num1);
            String awalStr = awal.getText().toString();
            int a = Integer.valueOf(awalStr);

            EditText akhir = (EditText) findViewById(R.id.Num2);
            String akhirStr = akhir.getText().toString();
            int t = Integer.valueOf(akhirStr);

            TextView hasil = (TextView) findViewById(R.id.Hasil);

            int jumlah = 0;
            if (a <= t){
                while (a <= t) {
                    jumlah += a;
                    a++;
                }
                String aStr = Integer.toString(jumlah);
                hasil.setText(aStr);
            }else{
                while (a >= t) {
                    jumlah += a;
                    a--;

                }
                String aStr = Integer.toString(jumlah);
                hasil.setText(aStr);
            }
        }
    }
