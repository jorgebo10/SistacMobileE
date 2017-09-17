package ar.com.sistac.auditSummaries;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import ar.com.sistac.R;
import ar.com.sistac.audit.summaries.AuditSummaryResponseModel;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AuditSummariesAdapter extends RecyclerView.Adapter<AuditSummariesAdapter.AuditHolder> {
    private AuditSummariesFragment auditSummariesFragment;
    private List<AuditSummaryResponseModel> mAudits = new ArrayList<>();

    @Inject
    public AuditSummariesAdapter(final AuditSummariesFragment informeListFragment) {
        this.auditSummariesFragment = informeListFragment;
    }

    @Override
    public AuditHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        final LayoutInflater layoutInflater = LayoutInflater.from(auditSummariesFragment.getActivity());
        View view = layoutInflater.inflate(R.layout.list_item_audit, parent, false);
        return new AuditHolder(view);
    }

    @Override
    public void onBindViewHolder(final AuditHolder holder, final int position) {
        final AuditSummaryResponseModel audit = mAudits.get(position);
        holder.bindAudit(audit);
    }

    void setAudits(List<AuditSummaryResponseModel> audits) {
        mAudits = audits;
    }

    @Override
    public int getItemCount() {
        return mAudits.size();
    }

    static final class AuditHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        @BindView(R.id.cit)
        TextView mCitTextView;
        @BindView(R.id.direccion)
        TextView mDireccionTextView;
        @BindView(R.id.entidadAuditora)
        TextView mEntidadAuditoraTextView;
        @BindView(R.id.operario)
        TextView mOperarioTextView;
        @BindView(R.id.fechaCreacion)
        TextView mFechaCreacionTextView;
        @BindView(R.id.status)
        ImageView mStatusImageView;

        private AuditSummaryResponseModel audit;

        private AuditHolder(final View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick(R.id.ver)
        public void clickedVerAuditDetails(final TextView  ver) {
            Log.d("VER", audit.cit());
        }

        void bindAudit(final AuditSummaryResponseModel audit) {
            this.audit = audit;
            mCitTextView.setText(audit.cit());

            mDireccionTextView.setText(audit.address().toString());
            mFechaCreacionTextView.setText(audit.date().toString());
            mEntidadAuditoraTextView.setText(audit.auditor().toString());
        }

        @Override
        public void onClick(final View view) {
        }
    }
}

