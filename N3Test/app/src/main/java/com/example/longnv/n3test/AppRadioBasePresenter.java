package com.example.longnv.n3test;

import android.content.Context;

import com.example.longnv.n3test.Base.radiobase.BasePresenter;


/**
 * Created by SonNM6 on 2/28/2017.
 */

public class AppRadioBasePresenter extends BasePresenter<RadioStationBaseModel> {
    @Override
    protected RadioStationBaseModel setModel() {
        return new RadioStationBaseModel(getContext());
    }

    public AppRadioBasePresenter(Context context) {
        super(context);
    }


    @Override
    public void onCallBackModel(String key, Object data) {
    //
    }
}
