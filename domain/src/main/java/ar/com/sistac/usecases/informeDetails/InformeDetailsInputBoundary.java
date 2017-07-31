package ar.com.sistac.usecases.informeDetails;

public interface InformeDetailsInputBoundary {
    void infomeDetailsByCit(final Long cit, final InformeDetailsOutputBoundary presenter);
}