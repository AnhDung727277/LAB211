/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8.Geographic;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import week8.Geographic.EastAsiaCountries;

public class ManageEastAsiaCountries {
    private List<EastAsiaCountries> countries = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer
            switch (choice) {
                case 1:
                    inputCountryInformation();
                    break;
                case 2:
                    displayCountries();
                    break;
                case 3:
                    searchCountryByName();
                    break;
                case 4:
                    sortCountriesByName();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 5);
    }

    private void displayMenu() {
        System.out.println("MENU");
        System.out.println("1. Input the information of 11 countries in East Asia");
        System.out.println("2. Display the information of countries you've just input");
        System.out.println("3. Search the information of country by user-entered name");
        System.out.println("4. Display the information of countries sorted by name in ascending order");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private void inputCountryInformation() {
        for (int i = 0; i < 11; i++) {
            System.out.print("Enter code of country: ");
            String code = scanner.nextLine();
            System.out.print("Enter name of country: ");
            String name = scanner.nextLine();
            System.out.print("Enter total area: ");
            float area = scanner.nextFloat();
            scanner.nextLine(); // Clear buffer
            System.out.print("Enter terrain of country: ");
            String terrain = scanner.nextLine();

            EastAsiaCountries country = new EastAsiaCountries(code, name, area, terrain);
            countries.add(country);
        }
    }

    private void displayCountries() {
        for (EastAsiaCountries country : countries) {
            country.display();
        }
    }

    private void searchCountryByName() {
        System.out.print("Enter the name you want to search for: ");
        String name = scanner.nextLine();
        for (EastAsiaCountries country : countries) {
            if (country.getCountryName().equalsIgnoreCase(name)) {
                country.display();
            }
        }
    }

    private void sortCountriesByName() {
        Collections.sort(countries, Comparator.comparing(EastAsiaCountries::getCountryName));
        displayCountries();
    }

    public static void main(String[] args) {
        ManageEastAsiaCountries manager = new ManageEastAsiaCountries();
        manager.start();
    }
}

