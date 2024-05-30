import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Variant2Dz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int upt;
        LinkedList<Integer> numRand = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            upt = sc.nextInt();
            boolean op = upt % 2 == 0;
            if (op) {
                numRand.addFirst(upt);
            } else {
                numRand.addLast(upt);

            }

        }


        Collections.sort(numRand.subList(0,5));
        Collections.sort(numRand.subList(5,10));
        System.out.println(numRand);

    }
}