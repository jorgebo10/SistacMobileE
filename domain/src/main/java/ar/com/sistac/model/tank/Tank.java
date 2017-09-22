package ar.com.sistac.model.tank;


import java.util.Date;

import ar.com.sistac.model.audit.Audit;
import ar.com.sistac.model.audit.Auditor;

public final class Tank {
    private final String cit;
    private final TankId tankId;
    private Address address;
    private Layout layout;


    public Tank(String cit, TankId tankId, Address address, Layout layout) {
        this.cit = cit;
        this.tankId = tankId;
        this.address = address;
        this.layout = layout;
    }

    public Audit auditOnDateByAuditor(final Date auditionDate, final Auditor auditor) {
        return new Audit(tankId, auditionDate, auditor);
    }

    public String getCit() {
        return cit;
    }

    public Address getAddress() {
        return address;
    }

    public Layout getLayout() {
        return layout;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setLayout(Layout layout) {
        this.layout = layout;
    }
}
