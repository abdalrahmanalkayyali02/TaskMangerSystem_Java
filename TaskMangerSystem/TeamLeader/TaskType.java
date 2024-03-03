public class TaskType { 

  private String TaskName;
  private String TaskDiscribtion;
  private static int TaskID = 0;
  private int Taskid;


  // this function is used to set the taskname which given as string parameter 
  public void setTaskName(String TaskName) {
    this.TaskName = TaskName;
  }

  // this function is used to ge the taskname value its constant no edite for value 
  public final String getTaskName() {
    return TaskName;
   }

  // this function is used to se the TaskDiscribtion for the task as parameter 
  public void setTaskDiscribtion(String TaskDiscribtion) {
    this.TaskDiscribtion = TaskDiscribtion;
  }

  // this function is uses to get the TaskDiscribtion value constant to edite for value 
  public final String getTaskDiscribtion() {
    return TaskDiscribtion;
  }

  // this function is used to get the task id 
  public final int getTaskID() {
    return Taskid;
  }

  // default constructer 
  public TaskType() {
    this.TaskName = " ";
    this.TaskDiscribtion = " ";
    this.Taskid = TaskType.TaskID;
    TaskType.TaskID++;
  }
}
