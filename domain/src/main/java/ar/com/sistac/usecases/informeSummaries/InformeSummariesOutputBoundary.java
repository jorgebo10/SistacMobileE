package ar.com.sistac.usecases.informeSummaries;


public interface InformeSummariesOutputBoundary {
    InformeSummariesResponseModel getResponseModel();

    void setResponseModel(final InformeSummariesResponseModel informeSummariesResponseModel);
}
