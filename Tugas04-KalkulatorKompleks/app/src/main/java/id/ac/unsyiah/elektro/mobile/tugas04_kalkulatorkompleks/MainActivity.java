package id.ac.unsyiah.elektro.mobile.tugas04_kalkulatorkompleks;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

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
    public void onClickSamaDengan(View view) {
        EditText numAngka1 = (EditText) findViewById(R.id.NumAngka1);
        String angka1Str = numAngka1.getText().toString();
        float angka1 = Float.valueOf(angka1Str);

        EditText numAngka2 = (EditText) findViewById(R.id.NumAngka2);
        String angka2Str = numAngka2.getText().toString();
        float angka2 = Float.valueOf(angka2Str);

        EditText numAngka3 = (EditText) findViewById(R.id.NumAngka3);
        String angka3Str = numAngka3.getText().toString();
        float angka3 = Float.valueOf(angka3Str);

        EditText numAngka4 = (EditText) findViewById(R.id.NumAngka4);
        String angka4Str = numAngka4.getText().toString();
        float angka4 = Float.valueOf(angka4Str);

        Spinner spnOperasi = (Spinner) findViewById(R.id.spinner);
        TextView txtHasil = (TextView) findViewById(R.id.Hasil);

        String selectedItem = (String) spnOperasi.getSelectedItem();
        if (selectedItem.trim().equals("+")) {
            float hasil = Float.valueOf(angka1 + angka3);
            String hasilStr = Float.toString(hasil);

            float hasilI = Float.valueOf(angka2 + angka4);
            String hasilStrI = Float.toString(hasilI);
            txtHasil.setText(hasilStr +"+"+ hasilStrI +"i");

        } else if (selectedItem.trim().equals("-")) {
            float hasil = Float.valueOf(angka1 - angka3);
            String hasilStr = Float.toString(hasil);

            float hasilI = Float.valueOf(angka2 - angka4);
            String hasilStrI = Float.toString(hasilI);

            txtHasil.setText(hasilStr +"+"+ hasilStrI +"i");

        } else if (selectedItem.trim().equals("*")) {
            float hasil = Float.valueOf(angka1 * angka3);
            float hasilI = Float.valueOf(angka2 * angka4);
            String hasilStr = Float.toString(hasil - hasilI);

            float hasilK = Float.valueOf(angka2 * angka3);
            float hasilIK = Float.valueOf(angka1 * angka4);
            String hasilStrI = Float.toString(hasilK + hasilIK);

            txtHasil.setText(hasilStr +"+"+ hasilStrI +"i");
        }


    }
}
