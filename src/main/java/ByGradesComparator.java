import java.util.Comparator;

public class ByGradesComparator implements Comparator<Student>{
    public int compare(Student o1, Student o2){
        if (o1.medieExacta() == o2.medieExacta()){
            return 0;
        }
        return o1.medieExacta() < o2.medieExacta() ? 1 : -1;
    }
}
