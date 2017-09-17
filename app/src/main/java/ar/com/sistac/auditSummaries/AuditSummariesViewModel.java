package ar.com.sistac.auditSummaries;

import android.os.Parcelable;

import java.util.List;

import ar.com.sistac.audit.summaries.AuditSummaryResponseModel;
import auto.parcel.AutoParcel;

@AutoParcel
public abstract class AuditSummariesViewModel implements Parcelable {

    public static AuditSummariesViewModel create(final List<AuditSummaryResponseModel> audits) {
        return new AutoParcel_AuditSummariesViewModel(audits);
    }

    public abstract List<AuditSummaryResponseModel> getAuditSummariesResponseModel();
}