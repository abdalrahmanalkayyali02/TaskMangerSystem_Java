import java.util.Scanner;

public class demo {
  public static void main(String[] argc) {
    String TaskName, TaskDiscribtion;
    Scanner input = new Scanner(System.in);
    TaskType task, task1; 
    task =  new TaskType();
    task1 = new TaskType();

    System.out.println("Enter the Task Name : ");
    TaskName = input.next();
    task.setTaskName(TaskName);
    
    System.out.println("Enter the Task Discribtion");
    TaskDiscribtion = input.next();
    task.setTaskDiscribtion(TaskDiscribtion);
    
    System.out.println("Task Name : " + task.getTaskName());
    System.out.println("Task Discribtion : " + task.getTaskDiscribtion());
    System.out.println("Task ID : " + task.getTaskID());
    System.out.println("Task ID : " + task1.getTaskID());

  }
}
