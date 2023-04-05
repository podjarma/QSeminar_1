package ru.sberbank.homework;

public class Task {
    public int id;
    public boolean isDeveloped;
    public boolean isTested;

    public Task(int id){
        this.id = id;
        this.isDeveloped = false;
        this.isTested = false;
    }
}
