package Task3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Map<String,String> dictionar = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0;i<10;i++){
        System.out.println("Introduceti cuvintul in engleza : ");
        String englez = scanner.nextLine();
        System.out.println("Introduceti traducerea cuvintului "+englez+ " in romana : ");
        String roman = scanner.nextLine();
        dictionar.put(englez,roman);}

        for(Map.Entry<String,String>entry : dictionar.entrySet()){
            System.out.println(entry.getKey()+ " - " + entry.getValue());
        }

    }
}
