package methodreference;

public class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public static int compareByScore(Student s1,Student s2){
        return s1.getScore()-s2.getScore();
    }
    public static int compareByName(Student s1,Student s2){
        return s1.getName().compareToIgnoreCase(s2.getName());
    }
}

