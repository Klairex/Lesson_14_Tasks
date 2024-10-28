package Task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> activities = new ArrayList<>();

        activities.add("Trezirea");
        activities.add("Rutina de dimineata");
        activities.add("Micul dejun");
        activities.add("Plecarea la serviciu");
        activities.add("Lucru");
        activities.add("Prinz");
        activities.add("Lucru");
        activities.add("Frecventarea cursurilor");
        activities.add("Revenirea acasa");
        activities.add("Cina");
        activities.add("Activitati de relaxare");
        activities.add("Planificarea zilei urmatoare");
        activities.add("Relaxare inainte de culcare");
        activities.add("Somn");

        List<String> uniqueActivities = removeDuplicates(activities);


        System.out.println("Activitaii unice :");
        for (String activity : uniqueActivities) {
            System.out.println(activity);
        }

    }

    public static List<String> removeDuplicates(List<String> activities) {
        List<String> uniqueActivities = new ArrayList<>() ;
        for (String activity : activities) {
            if (uniqueActivities.contains(activity)){}
            else {uniqueActivities.add(activity);}
        }


        return uniqueActivities;
    }
}
