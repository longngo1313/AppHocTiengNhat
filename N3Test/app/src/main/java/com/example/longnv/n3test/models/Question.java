package com.example.longnv.n3test.models;


public class Question {

    private String idQuestion;
    private String point;
    private String extraComment;
    private String url;
    private String question;
    private String answerOne;
    private String answerTwo;
    private String answerThree;
    private String answerFour;
    private String rigthAnswer;

    public Question(String idQuestion, String point, String extraComment, String url, String question, String answerOne, String answerTwo, String answerThree, String answerFour, String rigthAnswer) {
        this.idQuestion = idQuestion;
        this.point = point;
        this.extraComment = extraComment;
        this.url = url;
        this.question = question;
        this.answerOne = answerOne;
        this.answerTwo = answerTwo;
        this.answerThree = answerThree;
        this.answerFour = answerFour;
        this.rigthAnswer = rigthAnswer;
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

    public String getRigthAnswer() {
        return rigthAnswer;
    }

    public void setRigthAnswer(String rigthAnswer) {
        this.rigthAnswer = rigthAnswer;
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
        this.rigthAnswer = builder.rigthAnswer;
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
        private String rigthAnswer;

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
            this.rigthAnswer = data;
            return this;
        }

        public Question build() {
            return new Question(this);
        }
    }

}
