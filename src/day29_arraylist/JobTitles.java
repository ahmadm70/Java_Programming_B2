package day29_arraylist;

import java.util.*;

public class JobTitles {
    public static void main(String[] args) {
        ArrayList<String> allJobs = new ArrayList<>();
        allJobs.addAll(Arrays.asList("SDET", "Developer", "QA", "PO", "DevOps", "QE", "BA", "SM", "PM", "SH", "SME"));
        System.out.println(allJobs);
        ArrayList<String> jobs = new ArrayList<>(allJobs);
        jobs.removeAll(Arrays.asList("SM", "BA", "SME"));
        System.out.println(jobs);
        ArrayList<String> jobs2 = new ArrayList<>(allJobs);
        jobs2.retainAll(Arrays.asList("SDET", "QA", "Developer", "DevOps"));        //keeps specific collection in the list
        System.out.println(jobs2);
        ArrayList<String> jobs3 = new ArrayList<>(allJobs);
        System.out.println(jobs3.containsAll(Arrays.asList("SDET", "PM", "SME")));
    }
}