package com.task;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private List<Task> taskList;

    public  Main() {
        this.taskList = new ArrayList<>();
    }

    public void addTask(String desc) {
        Task newTask = new Task(desc);
        taskList.add(newTask);
        System.out.println("Task added: " + newTask);
    }

    public void markTaskCompleted(int index) {
        if (index >= 0 && index < taskList.size()) {
            Task task = taskList.get(index);
            task.markCompleted();
            System.out.println("Task marked as completed: " + task);
        } else {
            System.out.println("Invalid task index");
        }
    }

    public void displayTasks() {
        if (taskList.isEmpty()){
            System.out.println("No tasks available.");
        } else {
            System.out.println("Tasks:");
            for (int i = 0; i < taskList.size(); i++) {
                System.out.println(i + "." + taskList.get(i));
            }
        }
    }



    public static void main(String[] args) {
        Main taskManager = new Main();

        taskManager.addTask("Complete Java project");
        taskManager.addTask("Read a book");
        taskManager.addTask("Go for a run");

        taskManager.displayTasks();

        taskManager.markTaskCompleted(0);
        taskManager.displayTasks();
    }
}