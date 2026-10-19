import java.util.Comparator;

public class AlphabeticalGroupComparator implements Comparator<Student>{
    public int compare(Student o1, Student o2){
        int resGrupa=o1.getGrupa().compareTo(o2.getGrupa());
        if(resGrupa != 0 ){
            return resGrupa;
        }
        int resNume = o1.getNume().compareTo(o2.getNume());
        if (resNume != 0) {
            return resNume;
        }
        return o1.getPrenume().compareTo(o2.getPrenume());


    }
}
