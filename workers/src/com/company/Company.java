package com.company;

import com.company.workers.Role;
import com.company.workers.Worker;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Company {
    private Set<Worker> workers = new HashSet<>();
    private double profit;
    private Worker onOfficeDuty;
    private Random random = new Random();
    private int day = 1;

    public void calculateProfit() {
        for (Worker worker : workers) {
            if (!worker.equals(onOfficeDuty)){
                profit += worker.CalculateShareToCompany();
                buyNewTools(worker);
            }
        }
    }
public void addWorker(Worker worker){
        workers.add(worker);
}
    public void manageDays() {
        if (day < 30) {
            day++;
        } else {
            day = 1;
        }
    }

    public Random getRandom() {
        return random;
    }

    public void buyNewTools(Worker worker) {
        if (day == 30) {
            if (worker.getRole().equals(Role.ELECTRICIAN) || worker.getRole().equals(Role.PLUMBER)) {
                profit -= worker.getExperience().getToolCost();
            }
        }
    }

    public double getProfit() {
        return profit;
    }

    public void selectWorkerForOfficeDuty() {
        Worker[] workersList = workers.toArray(new Worker[workers.size()]);
        onOfficeDuty = workersList[random.nextInt(workers.size())];
    }
}
