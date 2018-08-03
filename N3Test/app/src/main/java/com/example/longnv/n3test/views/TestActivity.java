package com.example.longnv.n3test.views;

import android.support.annotation.NonNull;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.longnv.n3test.Base.radiobase.BaseActivity;
import com.example.longnv.n3test.adapter.QuestionListAdapter;
import com.example.longnv.n3test.models.Question;
import com.example.longnv.n3test.presenters.TestPresenter;
import com.example.longnv.n3test.R;

import java.util.ArrayList;

public class TestActivity extends BaseActivity<TestPresenter> {

    private RecyclerView mRvListQuestions;

    @Override
    protected int setViewLayout() {
        return R.layout.activity_test;
    }

    @Override
    protected void onSetupLayout() {
        mRvListQuestions = findViewById(R.id.rv_question);
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

        Log.d("15081991", " SIZE --------- " + questions.size());

        if(questions == null){
            return;
        }

        QuestionListAdapter questionListAdapter = new QuestionListAdapter(questions, this);

        mRvListQuestions.setAdapter(questionListAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getParent());
        mRvListQuestions.setLayoutManager(layoutManager);
        mRvListQuestions.setItemAnimator(new DefaultItemAnimator());
    }
}
