package id.ac.unsyiah.elektro.mobile.tugas11_doubletexteditor;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by art_m on 25/03/2016.
 */
public class FragmentAtas extends Fragment {

    public FragmentAtas() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_atas, container, false);
    }
}