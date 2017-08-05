package ar.com.sistac.usecases.informeSummaries;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;

import ar.com.sistac.entities.Informe;
import ar.com.sistac.repositories.InformeRepository;


public class InformeSummariesUseCase implements InformeSummariesInputBoundary {
    private InformeRepository informeRepository;

    @Inject
    public InformeSummariesUseCase(final InformeRepository informeRepository) {
        this.informeRepository = informeRepository;
    }

    @Override
    public void summarizeInformes(final InformeSummariesOutputBoundary presenter) {

        final List<Informe> informes = informeRepository.findInformes();

        final List<InformeSummary> informeSummaries = getInformeSummaries(informes);

        presenter.setResponseModel(InformeSummariesResponseModel.create(informeSummaries));
    }

    private List<InformeSummary> getInformeSummaries(final List<Informe> informes) {

        return informes.stream().map(informe -> InformeSummary.builder()
                .setAuditor(informe.getEntidadAuditora())
                .setDireccion(informe.getCalle())
                .setCit(informe.getCit())
                .build())
                .collect(Collectors.toList());
    }
}
