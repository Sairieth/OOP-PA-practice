package com.company;

import com.company.workers.Experience;
import com.company.workers.Role;
import com.company.workers.Worker;

public class Main {

    public static void main(String[] args) {
        Company company= new Company();
        company.addWorker(new Worker("Bob",company, Experience.BEGINNER,30000.0, Role.ELECTRICIAN));
        company.addWorker(new Worker("Max",company, Experience.ADVANCED,40000.0, Role.GAS_FITTER));
        company.addWorker(new Worker("Sunny",company, Experience.EXPERT,50000.0, Role.PLUMBER));
        for (int i = 0; i < 90; i++) {
            company.calculateProfit();
            company.selectWorkerForOfficeDuty();
            company.manageDays();
        }
        System.out.println(company.getProfit());
    }
}
