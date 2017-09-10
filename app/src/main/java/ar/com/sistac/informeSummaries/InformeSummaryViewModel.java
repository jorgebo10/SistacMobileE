package ar.com.sistac.informeSummaries;

import android.os.Parcelable;

import ar.com.sistac.usecases.informeSummaries.InformeSummaryResponseModel;
import auto.parcel.AutoParcel;

@AutoParcel
public abstract class InformeSummaryViewModel implements Parcelable {

    public static InformeSummaryViewModel create(final InformeSummaryResponseModel informeSummaryResponseModel) {
        return builder().cit(informeSummaryResponseModel.cit()).direccion(informeSummaryResponseModel.direccion()).build();
    }

    public static Builder builder() {
        return new AutoParcel_InformeSummaryViewModel.Builder();
    }

    public abstract Long cit();

    public abstract String direccion();

    @AutoParcel.Builder
    public interface Builder {
        Builder cit(Long cit);

        Builder direccion(String x);

        InformeSummaryViewModel build();
    }
}
