package com.example.longnv.n3test.presenters;

import android.content.Context;

import com.example.longnv.n3test.Base.radiobase.BasePresenter;
import com.example.longnv.n3test.models.QuestionModel;

public class TestPresenter extends BasePresenter<QuestionModel> {


    public TestPresenter(Context context) {
        super(context);
    }

    @Override
    protected QuestionModel setModel() {
        return new QuestionModel(getContext());
    }

    public void getListQuestion(){
        if(mModel == null){
            return;
        }
        mModel.getListQuestion();
    }

    @Override
    public void onCallBackModel(String key, Object data) {
        this.getmICallBackPresenter().onCallBackPresenter(key, data);
    }
}
