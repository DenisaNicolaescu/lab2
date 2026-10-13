import java.util.*;

public class lab2 {
    public static void main(String[] args) {


        List<Integer> x = new ArrayList();
        List<Integer> y = new ArrayList();
        List<Integer> xPlusY = new ArrayList(); //a
        Set<Integer> zSet = new TreeSet(); //b
        List<Integer> xMinusY = new ArrayList();//c
        int p = 4;
        List<Integer> xPlusYLimitedByP = new ArrayList(); //d

        Random rand = new Random();

        for (int i = 0; i <= 4; i++) {
            x.add(rand.nextInt(11));
        }

        Collections.sort(x);

        System.out.println("Lista x: ");
        for (int nr : x) {
            System.out.print(nr + " ");
        }


        for (int i = 0; i <= 6; i++) {
            y.add(rand.nextInt(11));
        }

        Collections.sort(y);

        System.out.println("\nLista y: ");
        for (int nr : y) {
            System.out.print(nr + " ");
        }

        xPlusY.addAll(x);
        xPlusY.addAll(y);
        Collections.sort(xPlusY);
        System.out.println("\nxPlusY: " + xPlusY);

        zSet.addAll(x);
        zSet.retainAll(y);
        System.out.print("zSet: " + zSet);

        xMinusY.addAll(x);
        xMinusY.removeAll(y);
        System.out.print("\nxMinusY " + xMinusY);

        Set<Integer> Set = new TreeSet<>();
        for (Integer val : xPlusY){
            if (val <= p) {
                Set.add(val);
            }
        }
        xPlusYLimitedByP.addAll(Set);
        System.out.print("\nxPlusLimitedByP " + xPlusYLimitedByP);


    }

}
