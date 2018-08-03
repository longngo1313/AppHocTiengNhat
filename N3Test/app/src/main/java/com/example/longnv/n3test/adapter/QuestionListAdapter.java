package com.example.longnv.n3test.adapter;



import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.longnv.n3test.R;
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
    public void onBindViewHolder(CustomViewHolder holder, int position) {

        if(mListData==null || mActivity==null){
            return;
        }

        Question question = mListData.get(position);

        if(question == null){
            return;
        }

        holder.mQuestion.setText(question.getQuestion());

    }

    @Override
    public int getItemCount() {
        return (mListData!=null && !mListData.isEmpty()) ? mListData.size() : 0;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {

        private TextView mQuestion;

        public CustomViewHolder(View view) {
            super(view);
            this.mQuestion = view.findViewById(R.id.txt_question);
        }
    }
}
