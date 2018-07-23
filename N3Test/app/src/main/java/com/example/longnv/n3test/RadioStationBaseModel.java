package com.example.longnv.n3test;

import android.content.Context;

import com.example.longnv.n3test.Base.radiobase.BaseModel;

/**
 * Created by SonNM6 on 2/23/2017.
 */

public class RadioStationBaseModel extends BaseModel {
    public RadioStationBaseModel(Context context) {
        super(context);
    }

    public void getModel() {
        getmICallBackPresenter().onCallBackModel("d", "d");
    }


}
