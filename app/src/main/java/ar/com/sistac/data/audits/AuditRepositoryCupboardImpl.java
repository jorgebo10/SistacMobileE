package ar.com.sistac.data.audits;

import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import ar.com.sistac.model.audit.Audit;
import ar.com.sistac.model.audit.AuditRepository;
import ar.com.sistac.model.audit.Auditor;
import ar.com.sistac.model.tank.Address;
import ar.com.sistac.model.tank.Tank;

public class AuditRepositoryCupboardImpl implements AuditRepository {
        private SQLiteDatabase sqlLiteDatabase;

        @Inject
        public AuditRepositoryCupboardImpl(final SQLiteDatabase sqlLiteDatabase) {
            this.sqlLiteDatabase = sqlLiteDatabase;
        }

        @Override
        public List<Audit> findAudits() {
            List<Audit> audits = new ArrayList<>();

            Audit audit1 = new Audit();
            audit1.setId(89L);
            audit1.setAuditionDate(new Date());
            Tank tank1 = new Tank("fjdkfjfj", "1");
            tank1.setAddress(Address.builder()
                    .setLocation("Universidad del comahue")
                    .setState("BA")
                    .setStreet("Avenida lacrose")
                    .build());
            audit1.setTank(tank1);
            audit1.setAuditor(Auditor.builder()
                    .name("jorge")
                    .surname("Bo")
                    .build());
            audit1.setOperator(Auditor.builder()
                    .name("juan")
                    .surname("Bo")
                    .build());

            Audit audit2 = new Audit();
            audit2.setId(90L);
            audit2.setAuditionDate(new Date());
            Tank tank2 = new Tank("hola tanke2", "2");
            tank2.setAddress(Address.builder()
                    .setLocation("Universidad del centro")
                    .setState("BA")
                    .setStreet("Avenida martin")
                    .build());
            audit2.setTank(tank2);
            audit2.setAuditor(Auditor.builder()
                    .name("pepe")
                    .surname("Bo")
                    .build());
            audit2.setOperator(Auditor.builder()
                    .name("pepe")
                    .surname("Bo")
                    .build());

            audits.add(audit1);
            audits.add(audit2);

            return audits;

        }
}
