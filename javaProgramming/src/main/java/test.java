import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class test {

    public static void main(String[] args) {
        Integer[] asc ={2, 54, 3, 9, 2, 5};
Arrays.sort(asc);
 //  Arrays.sort(asc, Collections.reverseOrder());
        System.out.println("ascending: "+Arrays.toString(asc));

    }
}