package nus.duke.task;

public class Todo extends Task {

    public Todo(String wish) {
        super(wish);
    }

    @Override
    public String getTaskType(){
        return "T";
    }
}
