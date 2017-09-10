package ar.com.sistac.informeSummaries;

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
import ar.com.sistac.di.InformeSummariesFragmentModule;
import butterknife.BindView;
import butterknife.ButterKnife;

public class InformeSummariesFragment extends Fragment {
    @BindView(R.id.informe_recycler_view)
    RecyclerView recyclerView;
    @Inject
    InformeSummariesAdapter informeSummariesAdapter;
    @Inject
    InformeSummariesPresenter informeSummariesPresenter;

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, final @Nullable ViewGroup container,
                             final @Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final View view = inflater.inflate(R.layout.fragment_informe_list, container, false);
        ButterKnife.bind(this, view);

        SistacApplication.get(getActivity())
                .getAppComponent()
                .plus(new InformeSummariesFragmentModule(this))
                .inject(this);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(informeSummariesAdapter);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        informeSummariesPresenter.summarizeInformes();
        InformeSummariesViewModel informeSummariesViewModel = informeSummariesPresenter.getViewModel();
        informeSummariesAdapter.setInformes(informeSummariesViewModel.viewModels());
        informeSummariesAdapter.notifyDataSetChanged();
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
