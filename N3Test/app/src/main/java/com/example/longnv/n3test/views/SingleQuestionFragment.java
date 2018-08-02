package com.example.longnv.n3test.views;

import android.annotation.SuppressLint;
import android.widget.TextView;

import com.example.longnv.n3test.Base.radiobase.BaseFragment;
import com.example.longnv.n3test.presenters.SingleQuestionPresenter;
import com.example.longnv.n3test.R;

public class SingleQuestionFragment extends BaseFragment<SingleQuestionPresenter> {

    private TextView mTxtQuestion;

    @Override
    protected int setViewLayout() {
        return  R.layout.fragment_single_question;
    }

    @SuppressLint("ResourceType")
    @Override
    protected void onSetupLayout() {

        mTxtQuestion = mViewFragment.findViewById(R.id.txt_question);
    }

    @Override
    protected SingleQuestionPresenter setPresenter() {
        return new SingleQuestionPresenter(getContext());
    }

    @Override
    public void onCallBackPresenter(String key, Object data) {

    }
}
