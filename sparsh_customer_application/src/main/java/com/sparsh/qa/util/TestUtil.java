package com.sparsh.qa.util;

import java.util.ArrayList;
import java.util.List;

public class TestUtil {
    public static long PAGE_LOAD_TIMEOUT = 60;
    public static long IMPLICIT_WAIT = 10;

    public static void findMissedOptions(List<String> firstList, List<String> secondList, String type) {
        List<String> missedOption = new ArrayList<>();
        for (String option : firstList) {
            if (secondList.indexOf(option) == -1) {
                missedOption.add(option);
            }
        }
        if (missedOption.size() > 0) {
            System.out.println(type + "\n" + missedOption);
            }
        }

}
