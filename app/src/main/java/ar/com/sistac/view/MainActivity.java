package ar.com.sistac.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import ar.com.sistac.R;
import ar.com.sistac.flow.FlowController;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FlowController.launchInformeListActivity(this);
    }
}
