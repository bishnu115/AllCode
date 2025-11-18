package Array;

public class countDuplicate {
    public static void main(String[] args) {
        int[] aa = {4, 5, 6, 6, -7};

        for (int i = 0; i < aa.length; i++) {
            int count = 1; // start ith 1 for the current element

            // Count duplicates ahead
            for (int j = i + 1; j < aa.length; j++) {
                if (aa[i] == aa[j]) {
                    count++;
                }
            }

            // Print only if first occurrence
            boolean alreadyPrinted = false;
            for (int j = 0; j < i; j++) {
                if (aa[i] == aa[j]) {
                    alreadyPrinted = true;
                    break;
                }
            }
            if (!alreadyPrinted) {
                System.out.println(aa[i] + " occurs " + count + " times");
                // }
            }
        }
    }}
