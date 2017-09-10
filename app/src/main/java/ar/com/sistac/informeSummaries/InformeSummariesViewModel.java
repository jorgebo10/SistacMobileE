package ar.com.sistac.informeSummaries;

import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

import ar.com.sistac.usecases.informeSummaries.InformeSummaryResponseModel;
import auto.parcel.AutoParcel;

@AutoParcel
public abstract class InformeSummariesViewModel implements Parcelable {

    public abstract List<InformeSummaryViewModel> viewModels();

    public static InformeSummariesViewModel create(final List<InformeSummaryResponseModel> informeSummaries) {

        List<InformeSummaryViewModel> informeSummaryViewModels = new ArrayList<>();

        for (InformeSummaryResponseModel responseModel : informeSummaries) {
            informeSummaryViewModels.add(InformeSummaryViewModel.create(responseModel));
        }
        return new AutoParcel_InformeSummariesViewModel(informeSummaryViewModels);
    }
}