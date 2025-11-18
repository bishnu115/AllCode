package Array;

import java.util.Arrays;
import java.util.Collections;

public class test {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 6, 7};
boolean shot=true;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                shot=false;
               break;
            }



        }
        if (shot){
            System.out.println("ok");
        }
        else {
            System.out.println("not ok");
        }

    }
}