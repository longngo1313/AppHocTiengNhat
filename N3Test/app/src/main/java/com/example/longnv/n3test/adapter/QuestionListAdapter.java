package com.example.longnv.n3test.adapter;



import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.longnv.n3test.R;
import com.example.longnv.n3test.interfaces.IAnswer;
import com.example.longnv.n3test.models.Question;

import java.util.ArrayList;


/**
 * Created by NGUYEN VU LONG on 8/21/2017.
 * FPT Sofware Company Limited
 */

public class QuestionListAdapter extends RecyclerView.Adapter<QuestionListAdapter.CustomViewHolder> {

    private Activity mActivity;

    private LayoutInflater mInflater;

    public static final String TAG = "QuestionListAdapter";

    public IAnswer mIAnswer;

    private ArrayList<Question> mListData = new ArrayList<>();

    public QuestionListAdapter(ArrayList<Question> personContact, Activity activity) {
        this.mListData = personContact;
        this.mInflater = LayoutInflater.from(activity);
        this.mActivity = activity;
    }



    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.fragment_single_question, parent, false);
        return new QuestionListAdapter.CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, final int position) {

        if(mListData==null || mActivity==null){
            return;
        }

        Question question = mListData.get(position);

        if(question == null){
            return;
        }

        holder.mQuestion.setText(question.getQuestion());
        holder.mAnswerOne.setText(question.getAnswerOne());
        holder.mAnswerTwo.setText(question.getAnswerTwo());
        holder.mAnswerThree.setText(question.getAnswerThree());
        holder.mAnswerFour.setText(question.getAnswerFour());
        holder.mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                RadioButton radioButton = radioGroup.findViewById(i);

                String result = radioButton.getText().toString();

                if (result.isEmpty()){
                    return;
                }

                if(mIAnswer != null){
                    mIAnswer.onAnswerChange(position, result);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return (mListData!=null && !mListData.isEmpty()) ? mListData.size() : 0;
    }


    public void setActionCallBack(IAnswer mIAnswer){
        this.mIAnswer = mIAnswer;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {

        private TextView mQuestion;

        private RadioButton mAnswerOne,mAnswerTwo,mAnswerThree,mAnswerFour;

        private RadioGroup mRadioGroup;


        public CustomViewHolder(View view) {
            super(view);
            this.mQuestion = view.findViewById(R.id.txt_question);
            this.mAnswerOne = view.findViewById(R.id.txt_answer_1);
            this.mAnswerTwo = view.findViewById(R.id.txt_answer_2);
            this.mAnswerThree = view.findViewById(R.id.txt_answer_3);
            this.mAnswerFour = view.findViewById(R.id.txt_answer_4);
            this.mRadioGroup = view.findViewById(R.id.rg_answers);
        }
    }
}
