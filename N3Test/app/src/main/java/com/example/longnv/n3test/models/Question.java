package com.example.longnv.n3test.models;


public class Question {


    public static final String TABLE_NAME = "question_tbl";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_POINT = "point";
    public static final String COLUMN_EXTRA_COMMENT = "extraComment";
    public static final String COLUMN_URL = "url";
    public static final String COLUMN_QUESTION = "question";
    public static final String COLUMN_ANSWER_ONE = "answerOne";
    public static final String COLUMN_ANSWER_TWO = "answerTwo";
    public static final String COLUMN_ANSWER_THREE = "answerThree";
    public static final String COLUMN_ANSWER_FOUR = "answerFour";
    public static final String COLUMN_RIGTH_ANSWER = "rightAnswer";


    // Create table SQL query
    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_POINT + " TEXT,"
                    + COLUMN_EXTRA_COMMENT + " TEXT,"
                    + COLUMN_URL + " TEXT,"
                    + COLUMN_QUESTION + " TEXT,"
                    + COLUMN_ANSWER_ONE + " TEXT,"
                    + COLUMN_ANSWER_TWO + " TEXT,"
                    + COLUMN_ANSWER_THREE + " TEXT,"
                    + COLUMN_ANSWER_FOUR + " TEXT,"
                    + COLUMN_RIGTH_ANSWER + " TEXT"
                    + ")";

    private String idQuestion;
    private String point;
    private String extraComment;
    private String url;
    private String question;
    private String answerOne;
    private String answerTwo;
    private String answerThree;
    private String answerFour;
    private String rightAnswer;

    public Question(String idQuestion, String point, String extraComment, String url, String question, String answerOne, String answerTwo, String answerThree, String answerFour, String rightAnswer) {
        this.idQuestion = idQuestion;
        this.point = point;
        this.extraComment = extraComment;
        this.url = url;
        this.question = question;
        this.answerOne = answerOne;
        this.answerTwo = answerTwo;
        this.answerThree = answerThree;
        this.answerFour = answerFour;
        this.rightAnswer = rightAnswer;
    }

    public Question() {
    }

    public String getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(String idQuestion) {
        this.idQuestion = idQuestion;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public String getExtraComment() {
        return extraComment;
    }

    public void setExtraComment(String extraComment) {
        this.extraComment = extraComment;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswerOne() {
        return answerOne;
    }

    public void setAnswerOne(String answerOne) {
        this.answerOne = answerOne;
    }

    public String getAnswerTwo() {
        return answerTwo;
    }

    public void setAnswerTwo(String answerTwo) {
        this.answerTwo = answerTwo;
    }

    public String getAnswerThree() {
        return answerThree;
    }

    public void setAnswerThree(String answerThree) {
        this.answerThree = answerThree;
    }

    public String getAnswerFour() {
        return answerFour;
    }

    public void setAnswerFour(String answerFour) {
        this.answerFour = answerFour;
    }

    public String getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(String rightAnswer) {
        this.rightAnswer = rightAnswer;
    }


    private Question(QuestionBuilder builder) {
        this.idQuestion = builder.idQuestion;
        this.point = builder.point;
        this.extraComment = builder.extraComment;
        this.url = builder.url;
        this.question = builder.question;
        this.answerOne = builder.answerOne;
        this.answerTwo = builder.answerTwo;
        this.answerThree = builder.answerThree;
        this.answerFour = builder.answerFour;
        this.rightAnswer = builder.rightAnswer;
    }

    public static class QuestionBuilder {

        //Required param
        private String idQuestion;

        //Optional param
        private String point;
        private String extraComment;
        private String url;
        private String question;
        private String answerOne;
        private String answerTwo;
        private String answerThree;
        private String answerFour;
        private String rightAnswer;

        public QuestionBuilder(String idQuestion) {
            this.idQuestion = idQuestion;
        }

        public QuestionBuilder setPoint(String data) {
            this.point = data;
            return this;
        }

        public QuestionBuilder setExtraComment(String data) {
            this.extraComment = data;
            return this;
        }

        public QuestionBuilder setUrl(String data) {
            this.url = data;
            return this;
        }

        public QuestionBuilder setQuestion(String data) {
            this.question = data;
            return this;
        }

        public QuestionBuilder setAnswerOne(String data) {
            this.answerOne = data;
            return this;
        }

        public QuestionBuilder setAnswerTwo(String data) {
            this.answerTwo = data;
            return this;
        }

        public QuestionBuilder setAnswerThree(String data) {
            this.answerThree = data;
            return this;
        }


        public QuestionBuilder setAnswerFour(String data) {
            this.answerFour = data;
            return this;
        }

        public QuestionBuilder setRightAnswer(String data) {
            this.rightAnswer = data;
            return this;
        }

        public Question build() {
            return new Question(this);
        }
    }

}
