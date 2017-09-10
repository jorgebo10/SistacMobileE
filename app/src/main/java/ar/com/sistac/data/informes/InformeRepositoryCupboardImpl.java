package ar.com.sistac.data.informes;

import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import ar.com.sistac.entities.Informe;
import ar.com.sistac.repositories.InformeRepository;

public class InformeRepositoryCupboardImpl implements InformeRepository {
        private SQLiteDatabase sqlLiteDatabase;

        @Inject
        public InformeRepositoryCupboardImpl(final SQLiteDatabase sqlLiteDatabase) {
            this.sqlLiteDatabase = sqlLiteDatabase;
        }

        @Override
        public List<Informe> findInformes() {
            List<Informe> informes = new ArrayList<>();
            Informe informe = new Informe();
            informe.setCit(89L);
            informe.setFechaCreacion(new Date());
            informe.setCalle("Av. San martin 458");
            informe.setLocalidad("Picun leufu");
            informe.setAnioFabricacion(2006);
            informe.setProvincia("Neuquen");
            informe.setEntidadAuditora("Universidad del comahue");
            informe.setOperador("Pedro Garcia");
            informes.add(informe);

            Informe informe1 = new Informe();
            informe1.setCit(894444L);
            informe1.setCalle("Av. Irigoyen 458");
            informe1.setLocalidad("Vaca muerta");
            informe1.setProvincia("San juan");
            informe1.setEntidadAuditora("Empresa unquie");
            informe1.setAnioFabricacion(2006);
            informe1.setOperador("juan gonzales");
            informe1.setFechaCreacion(new Date());
            informes.add(informe1);

            Informe informe2 = new Informe();
            informe2.setCit(844495L);
            informe2.setCalle("Av. San martin 458");
            informe2.setLocalidad("Picun leufu");
            informe2.setProvincia("Buenos Aires");
            informe2.setEntidadAuditora("Universidad de Buenos Aire");
            informe2.setOperador("jorge ezequiel");
            informe2.setAnioFabricacion(2006);
            informe2.setFechaCreacion(new Date());
            informes.add(informe2);
            informes.add(informe);
            informes.add(informe);

            return informes;

        }

    @Override
    public Informe getInformeById(final Long id) {
        Informe informe = new Informe();
        informe.setCit(89L);
        informe.setIdentificacion("OK-09_90");
        informe.setFechaCreacion(new Date());
        informe.setCalle("Av. San martin 458");
        informe.setLocalidad("Picun leufu");
        informe.setProvincia("Neuquen");
        informe.setAnioFabricacion(2006);
        informe.setEntidadAuditora("Universidad del comahue");
        informe.setOperador("Pedro Garcia");
        informe.setInspector("jorge ezequiel");
        informe.setFechaCreacion(new Date());

        return informe;
    }
}
