package ar.com.sistac.usecases.informeSummaries;


import com.annimon.stream.Collectors;
import com.annimon.stream.Stream;

import java.util.List;

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

        final List<InformeSummaryResponseModel> informeSummaries = getInformeSummaries(informes);

        presenter.setResponseModel(InformeSummariesResponseModel.create(informeSummaries));
    }

    private List<InformeSummaryResponseModel> getInformeSummaries(final List<Informe> informes) {

        return Stream.of(informes)
                .map(informe -> InformeSummaryResponseModel.builder()
                .setAuditor(informe.getEntidadAuditora())
                .setDireccion(informe.getCalle())
                .setCit(informe.getCit())
                .build())
                .collect(Collectors.toList());
    }
}
