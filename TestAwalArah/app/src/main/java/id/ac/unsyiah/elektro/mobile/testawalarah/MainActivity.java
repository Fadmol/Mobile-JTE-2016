package id.ac.unsyiah.elektro.mobile.testawalarah;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
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
    public void Klik (View view){
        final TextView txtX = (TextView) findViewById(R.id.Xnum);
        final TextView txtY = (TextView) findViewById(R.id.Ynum);
        final TextView txtZ = (TextView) findViewById(R.id.Znum);
        ImageButton btnYT = (ImageButton) findViewById(R.id.btnYT);
        ImageButton btnYK = (ImageButton) findViewById(R.id.btnYK);
        ImageButton btnXT = (ImageButton) findViewById(R.id.btnXT);
        ImageButton btnXK = (ImageButton) findViewById(R.id.btnXK);
        ImageButton btnZT = (ImageButton) findViewById(R.id.btnZT);
        ImageButton btnZK = (ImageButton) findViewById(R.id.btnZK);




        btnXT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x++;
                txtX.setText((String.valueOf(x)));
            }
        });

        btnXK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x--;
                txtX.setText((String.valueOf(x)));
            }
        });

        btnYT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                y++;
                txtY.setText((String.valueOf(y)));
            }
        });

        btnYK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                y--;
                txtY.setText((String.valueOf(y)));
            }
        });
        btnZT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                z++;
                txtZ.setText((String.valueOf(z)));
            }
        });

        btnZK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                y--;
                txtZ.setText((String.valueOf(z)));
            }
        });
    }
    int x=0;
    int y = 0;
    int z = 0;
}
