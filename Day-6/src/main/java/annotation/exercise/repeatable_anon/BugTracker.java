package annotation.exercise.repeatable_anon;


public class BugTracker {

    @BugReport(description = "Bug 1: Incorrect user input validation.")
    @BugReport(description = "Bug 2: Null pointer exception when input is empty.")
    public void processData() {
        System.out.println("Processing data...");
    }
}
