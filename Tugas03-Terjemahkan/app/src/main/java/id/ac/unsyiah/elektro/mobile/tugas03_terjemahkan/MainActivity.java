package id.ac.unsyiah.elektro.mobile.tugas03_terjemahkan;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
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
    }public void pasKlikTerjemahkan(View view ){
        TextView textView = (TextView) findViewById(R.id.textView);
        String apakabar = getString(R.string.TulisanInd);
        textView.setText(apakabar);
        TulisanInd = true;
    }
    public void pasKlik(View lihat ){
        TextView textView = (TextView) findViewById(R.id.textView);
        String apakabar = getString(R.string.TulisanAch);
        textView.setText(apakabar);
        TulisanAch = true;
    }
    public void pasKlikk(View lihat ){
        TextView textView = (TextView) findViewById(R.id.textView);
        String apakabar = getString(R.string.TulisanIng);
        textView.setText(apakabar);
        TulisanIng = true;
    }


    private boolean TulisanInd = false;
    private boolean TulisanAch = false;
    private boolean TulisanIng = false;

}
