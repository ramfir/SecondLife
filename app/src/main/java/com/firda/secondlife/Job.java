package com.firda.secondlife;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Job {
    String title;
    long length;
    long progr = 0;
    long maxProgress;

    public static List<Job> jobs = new ArrayList<>();

    Job(String title, long length) {
        this.title = title;
        this.length = length;
        this.maxProgress = length;
    }

    public String getTitle() {
        return title;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) { this.length = length; }
    public void setTitle(String title) { this.title = title; }
}
