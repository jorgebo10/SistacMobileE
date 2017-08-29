package ar.com.sistac.usecases.informeSummaries;


import com.google.auto.value.AutoValue;

import java.util.List;


@AutoValue
public abstract class InformeSummariesResponseModel {

    static InformeSummariesResponseModel create(final List<InformeSummary> informeSummaries) {
        return new AutoValue_InformeSummariesResponseModel(informeSummaries);
    }

    public abstract List<InformeSummary> informeSummaries();
}