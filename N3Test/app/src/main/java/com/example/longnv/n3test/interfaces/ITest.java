package com.example.longnv.n3test.interfaces;

import com.example.longnv.n3test.Base.radiobase.ICallBackModel;
import com.example.longnv.n3test.models.Question;

import java.util.ArrayList;

public interface ITest extends ICallBackModel {
    void onQuestionUpdate(ArrayList<Question> questions);
}
