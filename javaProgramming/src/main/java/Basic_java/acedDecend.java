package Basic_java;

import java.util.Arrays;

public class acedDecend {
    public static void main(String[] args) {

        int[] abc = {1, 2, 19, 4, 4, 18};

        Arrays.sort(abc);
        String aa = Arrays.toString(abc);
        System.out.println(aa);

        for (int i=abc.length-1;i>=0;i--){
            System.out.print(abc[i]+" ");
        }


    }



}
