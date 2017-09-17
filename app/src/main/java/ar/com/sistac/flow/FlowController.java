package ar.com.sistac.flow;

import android.content.Context;
import android.content.Intent;

import ar.com.sistac.auditSummaries.AuditSummariesActivity;

public class FlowController {

    public static void launchInformeListActivity(Context context) {
        Intent intent = new Intent(context, AuditSummariesActivity.class);
        context.startActivity(intent);
    }
}
