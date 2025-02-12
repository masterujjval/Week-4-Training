package queue_interface.hospital_triage_system;
import java.util.PriorityQueue;

class Patient implements Comparable<Patient> {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
// cpmparteTo is called when inserting or removing elemenets from the queue
    @Override
    public int compareTo(Patient other) {
        return Integer.compare(other.severity, this.severity);
        // this is sort the elements in desceneding order
        // This is imp to sort the priority
    }

    @Override
    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}

public class HospitalTriage {
    public static void main(String[] args) {
        PriorityQueue<Patient> triageQueue = new PriorityQueue<>();

        // Adding patients
        triageQueue.add(new Patient("John", 3));
        triageQueue.add(new Patient("Alice", 5));
        triageQueue.add(new Patient("Bob", 2));

        // Treating patients in order of priority
        System.out.println("Patients will be treated in this order:");
        while (!triageQueue.isEmpty()) {
            System.out.println(triageQueue.poll());
        }
    }
}
