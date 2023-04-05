package ru.sberbank.homework;

public class Tester {
    int id;
    boolean isFree;
    Task currentTask;

    public Tester(int id){
        this.id = id;
        this.isFree = true;
    }

    public boolean AddTask(Task t){
        if (this.isFree == true && this.currentTask == null){
            this.currentTask = t;
            this.isFree = false;
            return true;
        }
        return false;
    }

    public Task CheckTask(){
        if(this.currentTask != null && this.currentTask.isDeveloped == true){
            this.currentTask.isTested = true;
        }
        return this.currentTask;
    }

    public void Release(){
        this.currentTask = null;
        this.isFree = true;
    }

    public void TesterStatus(){
        if (this.isFree == true){
            System.out.println("Тестировщик №" + this.id + " свободен");
        }
        else{
            System.out.println("Тестировщик №" + this.id + " занят задачей: " + this.currentTask.id);
        }
    }
}
