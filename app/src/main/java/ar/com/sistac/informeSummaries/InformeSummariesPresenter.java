package ar.com.sistac.informeSummaries;


import javax.inject.Inject;

import ar.com.sistac.usecases.informeSummaries.InformeSummariesOutputBoundary;
import ar.com.sistac.usecases.informeSummaries.InformeSummariesResponseModel;
import ar.com.sistac.usecases.informeSummaries.InformeSummariesUseCase;

public class InformeSummariesPresenter implements InformeSummariesOutputBoundary {
    private final InformeSummariesUseCase informeSummariesUseCase;
    private InformeSummariesViewModel viewModel;


    @Inject
    public InformeSummariesPresenter(final InformeSummariesUseCase informeSummariesUseCase) {
        this.informeSummariesUseCase = informeSummariesUseCase;
    }

    public InformeSummariesViewModel getViewModel() {
        return viewModel;
    }

    @Override
    public void setResponseModel(final InformeSummariesResponseModel responseModel) {
         this.viewModel = InformeSummariesViewModel.create(responseModel.informeSummaries());
    }

    public void summarizeInformes() {
        this.informeSummariesUseCase.summarizeInformes(this);
    }
}
