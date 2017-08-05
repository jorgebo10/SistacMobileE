package ar.com.sistac.usescases.informeSummaries

import ar.com.sistac.usecases.informeSummaries.InformeSummariesOutputBoundary
import ar.com.sistac.usecases.informeSummaries.InformeSummariesResponseModel

class InformeSummariesOutputBoundarySpy implements InformeSummariesOutputBoundary {
    InformeSummariesResponseModel responseModel

    @Override
    InformeSummariesResponseModel getResponseModel() {
        responseModel
    }

    @Override
    void setResponseModel(final InformeSummariesResponseModel responseModel) {
        this.responseModel = responseModel
    }
}
