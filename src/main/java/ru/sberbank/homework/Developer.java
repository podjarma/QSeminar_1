package ru.sberbank.homework;

public class Developer {
    int id;
    boolean isFree;
    Task currentTask;

    public Developer(int id, boolean isFree){
        this.id = id;
        this.isFree = isFree;
    }

    public Developer(int id){
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

    public Task MakeTask(){
        if(this.currentTask != null){
            this.currentTask.isDeveloped = true;
        }
        return this.currentTask;
    }

    public void Release(){
        this.currentTask = null;
        this.isFree = true;
    }

    public void DeveloperStatus(){
        if (this.isFree == true){
            System.out.println("Разработчик №" + this.id + " свободен");
        }
        else{
            System.out.println("Разработчик №" + this.id + " занят задачей: " + this.currentTask.id);
        }
    }
}
