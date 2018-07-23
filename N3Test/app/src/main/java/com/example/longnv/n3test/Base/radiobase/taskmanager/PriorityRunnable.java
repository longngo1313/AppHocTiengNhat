package com.example.longnv.n3test.Base.radiobase.taskmanager;

/**
 * Created by SonNM6 on 3/3/2017.
 */

public class PriorityRunnable implements Runnable {
    private final Priority priority;

    public PriorityRunnable(Priority priority) {
        this.priority = priority;
    }

    @Override
    public void run() {
        // nothing to do here.
    }

    public Priority getPriority() {
        return priority;
    }
}
