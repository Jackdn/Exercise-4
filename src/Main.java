import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Main {
    public static void main(String[] args) {

        Map<String, Double> myMap1=new HashMap<>();
        ArrayList<String> cities = new ArrayList<>();
        Scanner input = new Scanner(System.in);



        System.out.println("Please give me a city name. Type \"end\" to stop");
        String city = input.nextLine();
        while(!(city.equals("end"))){
            cities.add(city);
            System.out.println("Please enter a new city name.");
            city= input.nextLine();
        }


        for(int i=0; i< cities.size(); i++){
            System.out.println("Please enter 5 temperatures for the next day in "+cities.get(i)+("."));
            double temp1 = parseDouble(input.nextLine());
            double temp2 = parseDouble(input.nextLine());
            double temp3 = parseDouble(input.nextLine());
            double temp4 = parseDouble(input.nextLine());
            double temp5 = parseDouble(input.nextLine());
            double temps = ((temp1 + temp2 + temp3 + temp4 + temp5) / 5);

            myMap1.put(cities.get(i), temps);
        }
        System.out.println(myMap1);
    }
}