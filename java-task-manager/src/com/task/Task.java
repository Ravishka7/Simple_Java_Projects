package com.task;

public class Task {
    private String desc;
    private boolean completed;

    public Task(String desc) {
        this.desc = desc;
        this.completed = false;
    }

    public String getDesc() {
        return desc;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markCompleted() {
        this.completed = true;
    }

    @Override
    public String toString(){
        return "[" + (completed ? "X" : "") + "]" + desc;
    }
}
