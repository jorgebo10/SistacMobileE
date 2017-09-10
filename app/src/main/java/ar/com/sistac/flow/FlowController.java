package ar.com.sistac.flow;

import android.content.Context;
import android.content.Intent;

import ar.com.sistac.informeSummaries.InformeSummariesActivity;

public class FlowController {

    public static void launchInformeListActivity(Context context) {
        Intent intent = new Intent(context, InformeSummariesActivity.class);
        context.startActivity(intent);
    }
}
