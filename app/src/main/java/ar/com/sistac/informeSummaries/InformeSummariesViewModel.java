package ar.com.sistac.informeSummaries;

import android.os.Parcelable;

import java.util.List;

import ar.com.sistac.usecases.informeSummaries.InformeSummary;
import auto.parcel.AutoParcel;

@AutoParcel
public abstract class InformeSummariesViewModel implements Parcelable {
    public abstract String cit();

    public abstract String identificacion();

    public abstract String anioFabricacion();

    public abstract String calle();

    public abstract String localidad();

    public abstract String provincia();

    public abstract String entidadAuditora();

    public abstract String operador();

    public abstract String inspector();

    public abstract String fechaCreacion();

    public static InformeSummariesViewModel create(final List<InformeSummary> informeSummaries) {
        return null;
    }
}