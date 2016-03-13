package id.ac.unsyiah.elektro.mobile.tebakangka;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by art_m on 12/03/2016.
 */
public class ActivityKedua extends Activity {

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);


        Intent pesan = getIntent();
        String pesanStr = pesan.getStringExtra("var1");
        TextView txtLabel = (TextView) findViewById(R.id.txtTebak);
        txtLabel.setText(pesanStr);

        String pesanStr2 = pesan.getStringExtra("var2");
        TextView txtLabel2 = (TextView) findViewById(R.id.txtHasil);
        txtLabel2.setText(pesanStr2);


    }
}