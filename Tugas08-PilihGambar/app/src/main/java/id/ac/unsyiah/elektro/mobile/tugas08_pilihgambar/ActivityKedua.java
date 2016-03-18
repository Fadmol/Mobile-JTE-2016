package id.ac.unsyiah.elektro.mobile.tugas08_pilihgambar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by art_m on 18/03/2016.
 */
public class ActivityKedua extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        Intent pesan = getIntent();
        int posisi = pesan.getIntExtra("posisi", 0);

        ImageView tampil = (ImageView) findViewById(R.id.imageView);
        int [] gambar= {0,R.drawable.mobil,R.drawable.astut,R.drawable.bmotor,R.drawable.bdayung,R.drawable.sepe};

        tampil.setImageResource(gambar[posisi]);
    }

}
