package ar.com.sistac.repositories;

import java.util.List;

import ar.com.sistac.entities.Informe;


public interface InformeRepository {
    List<Informe> findInformes();

    Informe getInformeById(final Long id);
}
