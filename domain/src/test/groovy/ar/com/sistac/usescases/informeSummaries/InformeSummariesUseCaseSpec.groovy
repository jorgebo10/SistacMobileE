package ar.com.sistac.usescases.informeSummaries;


import spock.lang.Specification;

class InformeSummariesUseCaseSpec extends Specification {

    def "test use case"() {

        given: "test"
        def var1 = "hola"

        when: "execute"
        var1 = "chau"

        then: "check"
        var1 == "hola"

    }
}

