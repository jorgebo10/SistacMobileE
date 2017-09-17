package ar.com.sistac.usescases.informeSummaries

import ar.com.sistac.model.Informe
import ar.com.sistac.repositories.InformeRepository
import ar.com.sistac.usecases.informeSummaries.InformeSummariesOutputBoundary
import ar.com.sistac.usecases.informeSummaries.InformeSummariesUseCase;
import spock.lang.Specification;

class InformeSummariesUseCaseSpec extends Specification {
    InformeSummariesUseCase informeSummariesUseCase
    InformeRepository informeRepository
    InformeSummariesOutputBoundary informeSummariesOutputBoundary

    def setup() {
        informeRepository = Mock(InformeRepository.class)
        informeSummariesUseCase = new InformeSummariesUseCase(informeRepository)
        informeSummariesOutputBoundary = new InformeSummariesOutputBoundarySpy()
    }

    def "summarizing informes get one result"() {

        given: "there is a few informes"
        informeRepository.findInformes() >> Arrays.asList(new Informe(cit: 12L, calle: "french", entidadAuditora: "pepe"));

        when: "ask for informes summarizing"
        informeSummariesUseCase.summarizeInformes(informeSummariesOutputBoundary)

        then: "response model has the expected informe"
        assertExpectedInforme()
    }

    private void assertExpectedInforme() {
        assert informeSummariesOutputBoundary.getResponseModel().informeSummaries().size() == 1
        informeSummariesOutputBoundary.getResponseModel().informeSummaries().get(0).with {
            assert cit() == 12
            assert auditor() == "pepe"
            assert direccion() == "french"
        }
    }
}

