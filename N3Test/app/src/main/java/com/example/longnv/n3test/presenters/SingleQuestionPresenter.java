package com.example.longnv.n3test.presenters;

import android.content.Context;

import com.example.longnv.n3test.Base.radiobase.BasePresenter;
import com.example.longnv.n3test.models.QuestionModel;

public class SingleQuestionPresenter extends BasePresenter<QuestionModel> {

    public SingleQuestionPresenter(Context context) {
        super(context);
    }

    @Override
    protected QuestionModel setModel() {
        return new QuestionModel(getContext());
    }

    @Override
    public void onCallBackModel(String key, Object data) {
        this.getmICallBackPresenter().onCallBackPresenter(key, data);
    }
}
