package ar.com.sistac.usecases.informeSummaries;


public interface InformeSummariesOutputBoundary {
    InformeSummariesResponseModel responseModel();

    void setResponseModel(final InformeSummariesResponseModel informeSummariesResponseModel);
}
