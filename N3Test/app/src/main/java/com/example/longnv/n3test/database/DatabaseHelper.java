package com.example.longnv.n3test.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.longnv.n3test.models.Question;
import com.example.longnv.n3test.models.QuestionModel;

import java.util.ArrayList;
import java.util.List;


public class DatabaseHelper extends SQLiteOpenHelper {

    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "app_db";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        // create notes table
        sqLiteDatabase.execSQL(Question.CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        // Drop older table if existed
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + Question.TABLE_NAME);

        // Create tables again
        onCreate(sqLiteDatabase);
    }

    public long insertQuestion(Question question) {
        // get writable database as we want to write data
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        // `id` and `timestamp` will be inserted automatically.
        // no need to add them
        values.put(Question.COLUMN_POINT, question.getPoint());
        values.put(Question.COLUMN_EXTRA_COMMENT, question.getExtraComment());
        values.put(Question.COLUMN_URL, question.getUrl());
        values.put(Question.COLUMN_QUESTION, question.getQuestion());
        values.put(Question.COLUMN_ANSWER_ONE, question.getAnswerOne());
        values.put(Question.COLUMN_ANSWER_TWO, question.getAnswerTwo());
        values.put(Question.COLUMN_ANSWER_THREE, question.getAnswerThree());
        values.put(Question.COLUMN_ANSWER_FOUR, question.getAnswerFour());
        values.put(Question.COLUMN_RIGTH_ANSWER, question.getRightAnswer());

        // insert row
        long id = db.insert(Question.TABLE_NAME, null, values);

        // close db connection
        db.close();

        // return newly inserted row id
        return id;
    }


    public List<Question> getAllQuetions() {
        List<Question> list = new ArrayList<>();

        // Select All Query
        String selectQuery = "SELECT  * FROM " + Question.TABLE_NAME ;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Question note = new Question();
                note.setIdQuestion(cursor.getString(cursor.getColumnIndex(Question.COLUMN_ID)));
                note.setQuestion(cursor.getString(cursor.getColumnIndex(Question.COLUMN_QUESTION)));
                note.setAnswerOne(cursor.getString(cursor.getColumnIndex(Question.COLUMN_ANSWER_ONE)));

                list.add(note);
            } while (cursor.moveToNext());
        }

        // close db connection
        db.close();

        // return notes list
        return list;
    }
}
