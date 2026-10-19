import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Student {
    private String nume;
    private String prenume;
    private String grupa;
    private List<Integer> note;

    public Student(String nume, String prenume, String grupa){
        this.nume = nume;
        this.prenume = prenume;
        this.grupa = grupa;
        this.note = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getGrupa() {
        return grupa;
    }

    public List<Integer> getNote(){
        return note;
    }

    public void adaugaNota(int nota){
        this.note.add(nota);
    }

    //a
    public void genereazaNoteAleatorii(){
        Random rand = new Random();
        this.note.clear();
        for(int i=0;i<5;i++){
            this.note.add(rand.nextInt(7)+4);
        }
    }

    public boolean esteIntegralist(){
        for(int nota : note) {
            if(nota<5){
                return false;
            }
        }
        return true;
    }

    public int numarRestante(){
        int restante = 0;
        for(int nota : note){
            if(nota<5){
                restante++;
            }
        }
        return restante;
    }

    //media celor 5 note
    public Integer medie() {
        if (note.isEmpty()) {
            return 0;
        }
        int suma = 0;
        for (int nota : note) {
            suma += nota;
        }
        return suma / note.size();
    }
    public double medieExacta(){
        if(note.isEmpty()){
            return 0.0;
        }
        double suma = 0;
        for(int nota : note){
            suma += nota;
        }
        return suma / note.size();
    }

    public String toString() {
        String result = "";
        result += String.format("%-7s", grupa);
        result += String.format(" %12s", nume);
        result += String.format(" %12s", prenume);
        result += String.format(" | Note: %-15s", note);
        result += String.format(" | Medie: %2d (Exact: %.2f)", medie(), medieExacta());
        result += String.format(" | Restante: %d", numarRestante());
        return result;
    }

}
