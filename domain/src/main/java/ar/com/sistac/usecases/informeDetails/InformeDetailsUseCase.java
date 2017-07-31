package ar.com.sistac.usecases.informeDetails;

import javax.inject.Inject;

import ar.com.sistac.entities.Informe;
import ar.com.sistac.repositories.InformeRepository;

public class InformeDetailsUseCase implements InformeDetailsInputBoundary {
    private InformeRepository informeRepository;

    @Inject
    public InformeDetailsUseCase(final InformeRepository informeRepository) {
        this.informeRepository = informeRepository;
    }

    @Override
    public void infomeDetailsByCit(final Long cit, final InformeDetailsOutputBoundary presenter) {
        final Informe informe = informeRepository.getInformeById(cit);

        final InformeDetails informeDetails = InformeDetails.builder()
                .setAuditor(informe.getEntidadAuditora())
                .setCit(informe.getCit())
                .setDireccion(informe.getCalle())
                .setFechaCreacion(informe.getFechaCreacion())
                .build();

        presenter.present(InformeDetailsResponseModel.create(informeDetails));
    }
}
