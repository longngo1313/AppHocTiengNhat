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

    @SuppressLint("CheckResult")
    public void getListQuestion(){

        getInt().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Integer>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        Log.d("15081991 -onSubscribe- ", "  " + Thread.currentThread().getName());
                    }

                    @Override
                    public void onNext(Integer integer) {
                        Log.d("15081991 -onNext- ", "  " + Thread.currentThread().getName());
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {
                        Log.d("15081991 -onComplete- ", "  " + Thread.currentThread().getName());
                    }
                });



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


     public Observable<Integer>  getInt(){
         return Observable.defer(new Callable<ObservableSource<? extends Integer>>() {
             @Override public Observable<Integer> call() {
                 Log.d("15081991 Observable", Thread.currentThread().getName() );
                 return Observable.just(1,2,3,4,5,6,7,8,9,10);
             }
         });
     }


}
