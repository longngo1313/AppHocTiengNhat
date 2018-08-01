package com.example.longnv.n3test.Model;

import android.content.Context;

import com.example.longnv.n3test.Base.radiobase.BaseModel;
import com.example.longnv.n3test.Base.radiobase.ICallBackModel;
import com.example.longnv.n3test.Interface.ITest;

import java.util.ArrayList;

public class QuestionModel extends BaseModel {

    public QuestionModel(Context context) {
        super(context);
    }

    public void getListQuestion(){
        ArrayList<Question> questions = new ArrayList<>();

        Question question = new Question.QuestionBuilder("01")
                .setQuestion("A?")
                .setRightAnswer("True").build();

        questions.add(question);
        questions.add(question);
        questions.add(question);
        questions.add(question);
        questions.add(question);

        this.getmICallBackPresenter().onCallBackModel("Data", questions);
     }
}
