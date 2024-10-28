package Task1;

import java.util.ArrayList;
import java.util.List;

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

        // Print the list of daily activities
        System.out.println("Activitatile zilei:");
        for (String activity : activities) {
            System.out.println(activity);
        }
    }
}
