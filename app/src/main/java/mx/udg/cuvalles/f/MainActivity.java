package mx.udg.cuvalles.f;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import mx.udg.cuvalles.fragments.BlankFragment;
import mx.udg.cuvalles.fragments.R;

public class MainActivity extends FragmentActivity implements BlankFragment.DataListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void sendData(String text) {

    }
}
