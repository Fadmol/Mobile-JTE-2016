package id.ac.unsyiah.elektro.mobile.testawalpilihan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by art_m on 19/03/2016.
 */
public class ActivityKedua extends Activity {

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);
        Intent pesan = getIntent();
        String pesanStr = pesan.getStringExtra("var1");
        TextView txtLabel = (TextView) findViewById(R.id.txtTampil);

        String pesanStr2 = pesan.getStringExtra("var2");

        txtLabel.setText(  pesanStr2 + " Terpilih Sebanyak " +  pesanStr +" Kali");



    }
}