package ar.com.sistac.informeSummaries;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import ar.com.sistac.view.SingleFragmentActivity;

public class InformeSummariesActivity extends SingleFragmentActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected Fragment createFragment() {
        return new InformeSummariesFragment();
    }
}
