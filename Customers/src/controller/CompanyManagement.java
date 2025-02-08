package controller;

import java.util.Comparator;
import model.Company;
import view.Menu;
import view.Validation;

import java.util.Date;
import model.Customer;

public class CompanyManagement extends Menu<String> {
    private static String[] options = {
            "List all customers",
            "Update network",
            "Customer search",
            "Sort",
            "Statistical homework",
            "Exit"
    };

    private Company company;

    public CompanyManagement(String title, String[] options, Company company) {
        super(title, options);
        this.company = company;
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1 -> this.company.listAllCustomer();
            case 2 -> updateNetwork();
            case 3 -> search();
            case 4 -> sort();
            case 5 -> statistical();
            case 6 -> stop();
        }
    }

    private void search() {
        String[] searchOptions = {
                "Find by ID",
                "Find by dob",
                "Return"
        };
        new Menu<String>("Customer searching", searchOptions) {
            @Override
            public void execute(int choice) {
                switch (choice){
                    case 1 -> {
                        String customerID = Validation.getString("Enter Customer ID: ", "[kK][hH][\\d]{2,3}");
                        company.listAllCustomer(company.search(p -> p.getCustomerID().equalsIgnoreCase(customerID)));
                    }
                    case 2 -> {
                        Date dob = Validation.getDate("Enter Customer dob: ");
                        company.listAllCustomer(company.search(p -> p.getDob().compareTo(dob) == 0));
                    }
                    case 3 -> this.stop();
                }
            }
        }.run();
    }

    private void sort() {
        String[] sortOption = {
                "Sort by ID",
                "Sort by name",
                "Sort by dob",
                "Return"
        };

        new Menu<String>("Customer sort", sortOption) {
            @Override
            public void execute(int choice) {
                Comparator<Customer> comparator;
                switch (choice) {
                    case 1 -> {
                        comparator = Comparator.comparing(Customer::getCustomerID);
                        company.sortList(comparator);
                    }
                    case 2 -> {
                        comparator = Comparator.comparing(Customer::getName);
                        company.sortList(comparator);
                    }
                    case 3 -> {
                        comparator = Comparator.comparing(Customer::getDob);
                        company.sortList(comparator);
                    }
                    case 4 -> stop();
                }
            }
        }.run();
    }
    
    public void updateNetwork(){
        company.forEach(p -> p.getHomeNetwork());
        company.listAllCustomer();
    }

    public void statistical() {
        this.company.statistical("Viettel");
        this.company.statistical("Vinaphone");
        this.company.statistical("Mobiphone");
    }

    public static void main(String[] args) {
        new CompanyManagement("Company Management", options, new Company()).run();
    }
}

    
}
