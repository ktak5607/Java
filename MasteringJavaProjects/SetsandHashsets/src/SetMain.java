import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {

    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();
        for(int i = 1; i <= 100; i ++){
            squares.add(i*i);
            cubes.add(i*i*i);
        }
        System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes");
        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("union contains " + union.size() + " elements");
        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection contains " + intersection.size() + " elements");
        for(int i : intersection){
            System.out.println(i + " is the square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));
        }

        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet();
        String[] natureWords = "all nature is but art yet undefined".split(" ");
        nature.addAll(Arrays.asList(natureWords));
        String [] divineWords = "to err is human, to forgive divine".split(" ");
        divine.addAll(Arrays.asList(divineWords));

    }
}
