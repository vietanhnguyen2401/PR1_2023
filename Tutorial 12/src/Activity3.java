import java.util.HashSet;
import java.util.Set;

public class Activity3 {

    public static Set<Integer> intersect(Set<Integer> A, Set<Integer> B) {
        Set<Integer> C = new HashSet<>();

        if (A.size() > B.size()) {
            Set<Integer> temp = A;
            A = B;
            B = temp;
        }

        for (int x : A) {
            if (B.contains(x)) {
                C.add(x);
            }
        }

        return C;
    }

    public static void main(String[] args) {
        // Example usage
        Set<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);

        Set<Integer> setB = new HashSet<>();
        setB.add(2);
        setB.add(3);
        setB.add(4);

        Set<Integer> resultSet = intersect(setA, setB);

        System.out.println("Set A: " + setA);
        System.out.println("Set B: " + setB);
        System.out.println("Intersection C: " + resultSet);
    }
}
