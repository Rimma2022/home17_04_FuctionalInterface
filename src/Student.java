import java.util.Map;
import java.util.Set;

public class Student {
    private String fio;
    private Map<String, Integer> marks;
    private double avg;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Map<String, Integer> getMarks() {
        return marks;
    }

    public void setMarks(Map<String, Integer> marks) {
        this.marks = marks;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public Student(String fio, Map<String, Integer> marks) {
        this.fio = fio;
        this.marks = marks;
        Set<Map.Entry <String, Integer>> entrySet = marks.entrySet();
        int sum = 0;
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            sum = sum + entry.getValue();
        }
        this.avg = sum/ marks.size();

    }

    @Override
    public String toString() {
        String str = "ФИО: " + fio + "\nmarks: " + marks +
                "\navg=" + avg;
        return str;

    }
}
