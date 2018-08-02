package com.example.longnv.n3test.views;

import android.support.annotation.NonNull;

import com.example.longnv.n3test.Base.radiobase.BaseActivity;
import com.example.longnv.n3test.models.Question;
import com.example.longnv.n3test.presenters.TestPresenter;
import com.example.longnv.n3test.R;

import java.util.ArrayList;

public class TestActivity extends BaseActivity<TestPresenter> {
    @Override
    protected int setViewLayout() {
        return R.layout.activity_test;
    }

    @Override
    protected void onSetupLayout() {
        getPresenter().getListQuestion();
    }

    @NonNull
    @Override
    protected TestPresenter setPresenter() {
        return new TestPresenter(getApplicationContext());
    }

    @Override
    public void onCallBackPresenter(String key, Object data) {
        ArrayList<Question> questions = (ArrayList<Question>) data;
        System.out.println("Activity====================================:  " + questions.get(0).getQuestion());
        System.out.println("Activity==================================== KEY :  " + key);
        System.out.println("Thread =========================================" + Thread.currentThread().getName());
    }
}
