package id.ac.unsyiah.elektro.mobile.prak21_pin2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Created by art_m on 19/03/2016.
 */
public class ActivityKetiga extends Activity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_ketiga);

            Intent pesan = getIntent();
            String pesanStr = pesan.getStringExtra("ubah");

        }

        public void onClick3(View view){

            EditText ubah = (EditText) findViewById(R.id.editText);

            String pinStr = ubah.getText().toString();
            int pinInt = Integer.valueOf(pinStr);

            SharedPreferences sharedPreferences =
                    getSharedPreferences("id.ac.unsyiah.elektro.mobile.Prak21-PIN2.PREF_BERSAMA", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putInt("PIN", pinInt);
            editor.apply();

            Intent pesan2 = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(pesan2);
            finish();
        }
    }