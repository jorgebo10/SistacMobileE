package ar.com.sistac.informeSummaries;

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
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class InformeSummariesAdapter extends RecyclerView.Adapter<InformeSummariesAdapter.InformeHolder> {
    private InformeSummariesFragment mInformeListFragment;
    private List<InformeSummaryViewModel> mInformes = new ArrayList<>();

    @Inject
    public InformeSummariesAdapter(final InformeSummariesFragment informeListFragment) {
        this.mInformeListFragment = informeListFragment;
    }

    @Override
    public InformeHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        final LayoutInflater layoutInflater = LayoutInflater.from(mInformeListFragment.getActivity());
        View view = layoutInflater.inflate(R.layout.list_item_informe, parent, false);
        return new InformeHolder(view);
    }

    @Override
    public void onBindViewHolder(final InformeHolder holder, final int position) {
        final InformeSummaryViewModel informe = mInformes.get(position);
        holder.bindInforme(informe);
    }

    void setInformes(List<InformeSummaryViewModel> informes) {
        mInformes = informes;
    }

    @Override
    public int getItemCount() {
        return mInformes.size();
    }

    static final class InformeHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
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

        private InformeSummaryViewModel mInforme;

        private InformeHolder(final View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick(R.id.ver)
        public void clickedVerInformeDetails(final TextView  ver) {
            Log.d("VER", mInforme.cit().toString());
        }

        void bindInforme(final InformeSummaryViewModel informe) {
            this.mInforme = informe;
            mCitTextView.setText(informe.cit().toString());

            mDireccionTextView.setText(informe.direccion());
        }

        @Override
        public void onClick(final View view) {
        }
    }
}

