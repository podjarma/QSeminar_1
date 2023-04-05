package ru.sberbank;
import ru.sberbank.homework.*;

public class HomeTask {

    // Модифицировать класс Task
    // Создать класс Tester
    // в методе продемонстрировать реализованную логику, путем вывода в консоль
    public static void main(String[] args) {
        Developer developer = new Developer(1);
        Task task = new Task(1);
        Tester tester = new Tester(1);

        //Задание приходит разработчику
        developer.DeveloperStatus();
        developer.AddTask(task);
        developer.DeveloperStatus();
        task = developer.MakeTask();
        developer.Release();
        developer.DeveloperStatus();

        //Задание приходит задание приходит тестировщику

        tester.TesterStatus();
        tester.AddTask(task);
        tester.TesterStatus();
        task = tester.CheckTask();
        tester.Release();
        tester.TesterStatus();

        //Состояние задания после выполнения
        System.out.println("\nЗадание " + task.id + "\nРазработано: " + task.isDeveloped + "\nПротестировано: " + task.isTested);
    }
}
