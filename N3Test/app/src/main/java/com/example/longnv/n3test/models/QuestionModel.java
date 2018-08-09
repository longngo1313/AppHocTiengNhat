package com.example.longnv.n3test.models;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;

import com.example.longnv.n3test.Base.radiobase.BaseModel;
import com.example.longnv.n3test.Base.radiobase.taskmanager.DefaultExecutorSupplier;
import com.example.longnv.n3test.database.DatabaseHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class QuestionModel extends BaseModel {


    public QuestionModel(Context context) {
        super(context);
    }

    private DatabaseHelper mDataHelper;

    private Disposable mDisposable;

    @SuppressLint("CheckResult")
    public void getListQuestion(){

//        getInt().subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Observer<Integer>() {
//                    @Override
//                    public void onSubscribe(Disposable d) {
//                        Log.d("15081991 -onSubscribe- ", "  " + Thread.currentThread().getName());
//                    }
//
//                    @Override
//                    public void onNext(Integer integer) {
//                        Log.d("15081991 -onNext- ", "  " + Thread.currentThread().getName() + " data " + integer);
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//
//                    }
//
//                    @Override
//                    public void onComplete() {
//                        Log.d("15081991 -onComplete- ", "  " + Thread.currentThread().getName());
//                    }
//                });

        Observable<List<Question>> listObservable = Observable.fromCallable(new Callable<List<Question>>() {
            @Override
            public List<Question> call() throws Exception {
                return queryListQuestion();
            }
        });

        mDisposable = listObservable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<List<Question>>() {
                    @Override
                    public void accept(List<Question> questions) throws Exception {
                        Log.d("15081991 -accept- ", "  " + Thread.currentThread().getName() + " Data is -- " + questions);
                        getmICallBackPresenter().onCallBackModel("DefaultExecutorSupplier", questions);
                    }
                });


//        DefaultExecutorSupplier.getInstance().forBackgroundTasks().execute(new Runnable() {
//            @Override
//            public void run() {
//                final ArrayList<Question> questions = new ArrayList<>();
//
//                Question question = new Question.QuestionBuilder("01")
//                        .setQuestion("Nguyen Vu Long")
//                        .setAnswerOne("One")
//                        .setAnswerTwo("Two")
//                        .setAnswerThree("Three")
//                        .setAnswerFour("Four")
//                        .setRightAnswer("True").build();
//
//                questions.add(question);
//                questions.add(question);
//                questions.add(question);
//                questions.add(question);
//                questions.add(question);
//
//                DefaultExecutorSupplier.getInstance().forMainThreadTasks().execute(new Runnable() {
//                    @Override
//                    public void run() {
//                        getmICallBackPresenter().onCallBackModel("DefaultExecutorSupplier", questions);
//                    }
//                });
//
//            }
//        });

    }

    private List<Question> queryListQuestion(){
        ArrayList<Question> questions = new ArrayList<>();
        Log.d("15081991 query", "  " + Thread.currentThread().getName());
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
        return questions;
    }


}
