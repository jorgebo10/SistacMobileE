package ar.com.sistac.usecases.informeDetails;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class InformeDetailsResponseModel {

    static InformeDetailsResponseModel create(final InformeDetails informeDetails) {
        return new AutoValue_InformeDetailsResponseModel(informeDetails);
    }

    public abstract InformeDetails informeDetails();
}
