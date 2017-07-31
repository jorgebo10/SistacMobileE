package ar.com.sistac.usecases.informeDetails;

public interface InformeDetailsOutputBoundary {
    InformeDetailsResponseModel getResponseModel();

    void present(final InformeDetailsResponseModel informeDetailsResponseModel);
}
