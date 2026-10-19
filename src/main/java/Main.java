import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studenti = new ArrayList<>();
        studenti.add(new Student("Popescu", "Marian", "225_3"));
        studenti.add(new Student("Popescu", "Maria", "225_3"));
        studenti.add(new Student("Popa", "Marian", "225_3"));
        studenti.add(new Student("Bica", "Irina", "225_3"));
        studenti.add(new Student("Badea", "Ion", "225_1"));
        studenti.add(new Student("Cacoveanu", "Andreea", "225_1"));
        studenti.add(new Student("Onofrei", "Mircea", "225_1"));

        //a
        for (Student s : studenti){
            s.genereazaNoteAleatorii();
        }

        System.out.println("Lista initiala cu note generate aleatoriu");
        for (Student s: studenti){
            System.out.println(s);
        }

        //b1
        Collections.sort(studenti, new AlphabeticalGroupComparator());
        System.out.println("\nb1) Ordonare alfabetica pe grupe ");
        for(Student s: studenti){
            System.out.println(s);
        }

        List<Student> integralisti = new ArrayList<>();
        List<Student> restantieri = new ArrayList<>();

        for(Student s: studenti){
            if (s.esteIntegralist()){
                integralisti.add(s);
            }else{
                restantieri.add(s);
            }
        }

        //b2
        Collections.sort(integralisti, new ByGradesComparator());
        System.out.println("\nb2) Integralisti ordonati descrescator dupa medie");
        if(integralisti.isEmpty()){
            System.out.println("Nu exista integralisti. ");
        }else{
            for (Student s: integralisti){
                System.out.print(s);
            }
        }

        //b3
        Collections.sort(restantieri, new ByRestanteComparator());
        System.out.print("\nb3) Restantieri ordonati crescator dupa nr de restante ");
        if(restantieri.isEmpty()){
            System.out.println("Nu exista restantieri");
        }else{
            for (Student s : restantieri){
                System.out.println(s);
            }
        }

    }


}
