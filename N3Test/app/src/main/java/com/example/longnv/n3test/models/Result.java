package com.example.longnv.n3test.models;

public class Result {

    private String time;
    private String realPoint;
    private String maxPoint;
    private String userName;
    private String id;
    private String questType;


    public Result(String time, String realPoint, String maxPoint, String userName, String id, String questType) {
        this.time = time;
        this.realPoint = realPoint;
        this.maxPoint = maxPoint;
        this.userName = userName;
        this.id = id;
        this.questType = questType;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getRealPoint() {
        return realPoint;
    }

    public void setRealPoint(String realPoint) {
        this.realPoint = realPoint;
    }

    public String getMaxPoint() {
        return maxPoint;
    }

    public void setMaxPoint(String maxPoint) {
        this.maxPoint = maxPoint;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuestType() {
        return questType;
    }

    public void setQuestType(String questType) {
        this.questType = questType;
    }

    private Result(ResultBuilder builder) {
        this.time = builder.time;
        this.realPoint = builder.realPoint;
        this.maxPoint = builder.maxPoint;
        this.userName = builder.userName;
        this.id = builder.id;
        this.questType = builder.questType;
    }

    public static class ResultBuilder{

        private String time;
        private String realPoint;
        private String maxPoint;
        private String userName;
        private String id;
        private String questType;

        public ResultBuilder(String id) {
            this.id = id;
        }


        public ResultBuilder setTime(String time) {
            this.time = time;
            return this;
        }

        public ResultBuilder setRealPoint(String realPoint) {
            this.realPoint = realPoint;
            return this;
        }

        public ResultBuilder setMaxPoint(String maxPoint) {
            this.maxPoint = maxPoint;
            return this;
        }


        public ResultBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public ResultBuilder setQuestType(String questType) {
            this.questType = questType;
            return this;
        }

        public Result build(){
            return new Result(this);
        }
    }
}
