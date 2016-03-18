package id.ac.unsyiah.elektro.mobile.tugas09_tebakgambar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by art_m on 18/03/2016.
 */
public class ActivityKedua extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        Intent pesan = getIntent();
        String pesanStr = pesan.getStringExtra("var1");
        TextView txtLabel = (TextView) findViewById(R.id.textView);
        txtLabel.setText(pesanStr);

        int pesan0 = pesan.getIntExtra("var2",0);
        ImageView gambar = (ImageView) findViewById(R.id.imageView);
        gambar.setImageResource(pesan0);


    }
}