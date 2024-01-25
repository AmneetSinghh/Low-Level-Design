package LLD;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

enum Status {
    TODO, IN_PROGRESS, DONE
}

class Task {

    String title;
    String description;
    Status status;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }
}

public class Tasktracker {

    List<Task> taskList = new ArrayList<>();

    void addTask(String title, String description, Status status) {
        Task task = new Task(title, description);
        if (status == null) {
            task.status = Status.TODO;
        } else {
            task.status = status;
        }
        taskList.add(task);
    }

    void removeTask(String title) {
        for (Task task : taskList) {
            if (Objects.equals(task.title, title)) {
                taskList.remove(task);
                break;
            }
        }
    }

    List<Task> listTasks(Status status) {
        if (status == null) return taskList;
        List<Task> resultTasks = new ArrayList<Task>();
        for (Task task : taskList) {
            if (status == task.status) {
                resultTasks.add(task);
            }
        }
        return resultTasks;
    }
}


class Runner {

    static void printList(Status status, Tasktracker tasktracker) {
        for (Task task : tasktracker.listTasks(status)) {
            System.out.println(task.title + " " + task.description + " " + task.status);
        }
    }


    public static void main(String[] args) throws java.lang.Exception {
        Tasktracker tasktracker = new Tasktracker();
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                tasktracker.addTask(("title" + i), ("description" + i), Status.TODO);
            } else if (i % 3 == 1) {
                tasktracker.addTask(("title" + i), ("description" + i), Status.IN_PROGRESS);
            } else {
                tasktracker.addTask(("title" + i), ("description" + i), null);
            }
        }

        System.out.println("** For all task **");
        printList(null, tasktracker);

        System.out.println("** For todo task **");
        printList(Status.TODO, tasktracker);

        System.out.println("** For inprogress task **");
        printList(Status.IN_PROGRESS, tasktracker);

        /*
         * Remove
         */
        tasktracker.removeTask("title1");

        System.out.println("** For all task **");
        printList(null, tasktracker);

    }
}