package Array;

public class ThirdLargestSimple {
    public static void main(String[] args) {


    int[] abc = {2, 0,47, 7, 8};
    int max = abc[0];
    int secondMax = abc[0];
    int thirdMax= abc[0];
        for (int i = 0; i < abc.length; i++) {
        if (abc[i] > max) {
            max = abc[i];

        }
    }
        System.out.println(max);

        for (int i = 0; i < abc.length; i++) {

        if (abc[i] != max && abc[i] > secondMax) {
            secondMax = abc[i];
        }

    }
        System.out.println(secondMax);


        for (int i = 0; i < abc.length; i++) {
        if (abc[i] != max && abc[i] != secondMax && abc[i] > thirdMax) {
            thirdMax = abc[i];
        }

    }
        System.out.println(thirdMax);

}
}
