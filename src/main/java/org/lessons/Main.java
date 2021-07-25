package org.lessons;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String args[]) {

        List<Car> carList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println();
            for (int i = 1; i <= Menu.values().length; i++) {
                System.out.println(i + " - " + Menu.get(i));
            }
            System.out.println();
            System.out.print("Please select action: ");
            int selectedPosition = input.nextInt();
            if (selectedPosition == 1) {
                System.out.print("Please input Brand: ");
                String brand = input.next();
                System.out.print("Please input Model: ");
                String model = input.next();
                System.out.print("Please input Year of the car production: ");
                String year = input.next();
                Car newCar = new Car();
                newCar.brand = brand;
                newCar.model = model;
                newCar.year = year;
                carList.add(newCar);
                System.out.println("New car was added.");
            }
            if (selectedPosition == 2) {
                System.out.println("Enter index to delete row: ");
                int selectIndex = input.nextInt();
                carList.remove(selectIndex);
                System.out.println("Row " + selectIndex + " deleted.");

            }
            if (selectedPosition == 3) {
                System.out.println("List of cars:");
                System.out.println("index | brand | model | year");
                for (int i = 0; i < carList.size(); i++) {
                    Car car = carList.get(i);
                    System.out.println(i + " | " + car.brand + " | " + car.model + " | " + car.year);
                }
            }
            if (selectedPosition == 4) {
                carList = carList.stream()
                        .sorted(Comparator.comparing(o -> o.brand))
                        .collect(Collectors.toList());
                System.out.println("List of cars was sorted by brand.");
            }
            if (selectedPosition == 5) {
                break;
            }
        }
    }

}
