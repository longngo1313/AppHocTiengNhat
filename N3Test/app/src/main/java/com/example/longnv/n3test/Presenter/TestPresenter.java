package com.example.longnv.n3test.Presenter;

import android.content.Context;

import com.example.longnv.n3test.Base.radiobase.BasePresenter;
import com.example.longnv.n3test.Model.Question;
import com.example.longnv.n3test.Model.QuestionModel;

import java.util.ArrayList;

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
        ArrayList<Question> questions = (ArrayList<Question>) data;
        System.out.println("Data first ====================================:  " + questions.get(0).getIdQuestion());
        this.getmICallBackPresenter().onCallBackPresenter("Data", questions);
    }
}
