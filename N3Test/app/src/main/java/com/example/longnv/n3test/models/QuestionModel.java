package com.example.longnv.n3test.models;

import android.content.Context;
import android.util.Log;

import com.example.longnv.n3test.Base.radiobase.BaseModel;
import com.example.longnv.n3test.Base.radiobase.taskmanager.DefaultExecutorSupplier;
import com.example.longnv.n3test.database.DatabaseHelper;

import java.util.ArrayList;
import java.util.List;

public class QuestionModel extends BaseModel {


    public QuestionModel(Context context) {
        super(context);
    }

    private DatabaseHelper mDataHelper;

    public void getListQuestion(){


        mDataHelper = new DatabaseHelper(getContext());
        List<Question> questionList =  mDataHelper.getAllQuetions();
        Log.d("15081991 " , "" + questionList.size());


        DefaultExecutorSupplier.getInstance().forBackgroundTasks().execute(new Runnable() {
            @Override
            public void run() {
                final ArrayList<Question> questions = new ArrayList<>();

                Question question = new Question.QuestionBuilder("01")
                        .setQuestion("Nguyen Vu Long")
                        .setAnswerOne("One")
                        .setAnswerTwo("Two")
                        .setAnswerThree("Three")
                        .setAnswerFour("Four")
                        .setRightAnswer("True").build();

                questions.add(question);
                questions.add(question);
                questions.add(question);
                questions.add(question);
                questions.add(question);

                DefaultExecutorSupplier.getInstance().forMainThreadTasks().execute(new Runnable() {
                    @Override
                    public void run() {
                        getmICallBackPresenter().onCallBackModel("DefaultExecutorSupplier", questions);
                    }
                });

            }
        });

     }
}
