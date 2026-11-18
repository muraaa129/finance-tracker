package financetracker;

import java.util.ArrayList;

public class Account {
    private String name;
    private double balance;
    private ArrayList<Operation> operations;

    public Account (String name) {
        this.name = name;
        balance = 0;
        operations = new ArrayList<>();
    }

    public String getName() { return name; }
    public double getBalance() { return balance; }
}