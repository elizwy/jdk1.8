package methodreference;

public class StudentCompartor {
    public int compareByScore(Student s1,Student s2){
        return s1.getScore()-s2.getScore();
    }
    public int compareByName(Student s1,Student s2){
        return s1.getName().compareToIgnoreCase(s2.getName());
    }
}
