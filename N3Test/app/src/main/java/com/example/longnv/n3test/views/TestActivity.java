package com.example.longnv.n3test.views;

import android.support.annotation.NonNull;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.util.Log;

import com.example.longnv.n3test.Base.radiobase.BaseActivity;
import com.example.longnv.n3test.adapter.QuestionListAdapter;
import com.example.longnv.n3test.interfaces.IAnswer;
import com.example.longnv.n3test.models.Question;
import com.example.longnv.n3test.presenters.TestPresenter;
import com.example.longnv.n3test.R;

import java.util.ArrayList;

public class TestActivity extends BaseActivity<TestPresenter> {

    private RecyclerView mRvListQuestions;

    private ArrayList<Question> mListQuestion = new ArrayList<>();

    private ArrayList<String> mListAnswers = new ArrayList<>();

    private static final String EMPTY_ANSWER =  "5";

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

        if(!(data instanceof ArrayList )){
            return;
        }

        if(((ArrayList) data).isEmpty() || !(((ArrayList) data).get(0) instanceof Question) ){
            return;
        }

        mListQuestion = (ArrayList<Question>) data;

        for(int i = 0; i < mListQuestion.size(); i++){
            mListAnswers.add(EMPTY_ANSWER);
        }

        QuestionListAdapter questionListAdapter = new QuestionListAdapter(mListQuestion, this);

        mRvListQuestions.setAdapter(questionListAdapter);

        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        mRvListQuestions.setLayoutManager(layoutManager);

        SnapHelper helper = new LinearSnapHelper();
        helper.attachToRecyclerView(mRvListQuestions);
        mRvListQuestions.setItemAnimator(new DefaultItemAnimator());

        questionListAdapter.setActionCallBack(new IAnswer() {
            @Override
            public void onAnswerChange(int id, String answer) {

                if(mListAnswers.isEmpty()){
                    return;
                }

                mListAnswers.set(id, answer);

            }
        });
    }
}
