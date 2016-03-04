package id.ac.unsyiah.elektro.mobile.tugas05_spreadsheet;

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
        int angka1 = Integer.valueOf(angka1Str);

        EditText numAngka2 = (EditText) findViewById(R.id.NumAngka2);
        String angka2Str = numAngka2.getText().toString();
        int angka2 = Integer.valueOf(angka2Str);

        EditText numAngka3 = (EditText) findViewById(R.id.NumAngka3);
        String angka3Str = numAngka3.getText().toString();
        int angka3 = Integer.valueOf(angka3Str);

        EditText numAngka4 = (EditText) findViewById(R.id.NumAngka4);
        String angka4Str = numAngka4.getText().toString();
        int angka4 = Integer.valueOf(angka4Str);

        TextView txtHasilB1 = (TextView) findViewById(R.id.HasilB1);
        TextView txtHasilB2 = (TextView) findViewById(R.id.HasilB2);
        TextView txtHasilK3 = (TextView) findViewById(R.id.HasilK1);
        TextView txtHasilK4 = (TextView) findViewById(R.id.HasilK2);

        long hasil1 = Long.valueOf(angka1 + angka2);
        String hasilStr1 = Long.toString(hasil1);
        txtHasilB1.setText(hasilStr1);

        long hasil2 = Long.valueOf(angka3 + angka4);
        String hasilStr2 = Long.toString(hasil2);
        txtHasilB2.setText(hasilStr2);

        long hasil3 = Long.valueOf(angka1 + angka3);
        String hasilStr3 = Long.toString(hasil3);
        txtHasilK3.setText(hasilStr3);

        long hasil4 = Long.valueOf(angka2 + angka4);
        String hasilStr4 = Long.toString(hasil4);
        txtHasilK4.setText(hasilStr4);
    }

}
