package com.example.longnv.n3test.models;

import android.content.Context;

import com.example.longnv.n3test.Base.radiobase.BaseModel;
import com.example.longnv.n3test.Base.radiobase.taskmanager.DefaultExecutorSupplier;

import java.util.ArrayList;

public class QuestionModel extends BaseModel {

    public QuestionModel(Context context) {
        super(context);
    }

    public void getListQuestion(){

        DefaultExecutorSupplier.getInstance().forBackgroundTasks().execute(new Runnable() {
            @Override
            public void run() {
                final ArrayList<Question> questions = new ArrayList<>();

                Question question = new Question.QuestionBuilder("01")
                        .setQuestion("Nguyen Vu Long")
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
