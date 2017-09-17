package ar.com.sistac.auditSummaries;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;

import ar.com.sistac.R;
import ar.com.sistac.SistacApplication;
import ar.com.sistac.di.AuditSummariesFragmentModule;
import butterknife.BindView;
import butterknife.ButterKnife;

public class AuditSummariesFragment extends Fragment {
    @BindView(R.id.audit_recycler_view)
    RecyclerView recyclerView;
    @Inject
    AuditSummariesAdapter auditSummariesAdapter;
    @Inject
    AuditSummariesPresenter auditSummariesPresenter;

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, final @Nullable ViewGroup container,
                             final @Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final View view = inflater.inflate(R.layout.fragment_audit_list, container, false);
        ButterKnife.bind(this, view);

        SistacApplication.get(getActivity())
                .getAppComponent()
                .plus(new AuditSummariesFragmentModule(this))
                .inject(this);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(auditSummariesAdapter);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        auditSummariesPresenter.summarizeAudits();
        AuditSummariesViewModel auditSummariesViewModel = auditSummariesPresenter.getViewModel();
        auditSummariesAdapter.setAudits(auditSummariesViewModel.getAuditSummariesResponseModel());
        auditSummariesAdapter.notifyDataSetChanged();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }
}
