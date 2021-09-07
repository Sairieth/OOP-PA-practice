package com.company.workers;

import com.company.Company;

public class Worker {
    private String name;
    private Company company;
    private Experience experience;
    private double dailyFee;
    private Role role;
    private int day = 1;
    private boolean onHoliday = false;

    public Worker(String name, Company company, Experience experience, double dailyFee, Role role) {
        this.name = name;
        this.company = company;
        this.experience = experience;
        this.dailyFee = dailyFee;
        this.role = role;
    }

    public Experience getExperience() {
        return experience;
    }

    public Role getRole() {
        return role;
    }

    protected boolean getsJob() {
        return company.getRandom().nextInt(101) <= role.getChanceOfJob();
    }

    public double CalculateShareToCompany() {
        if (getsJob()) {
            return dailyFee * experience.getPercentageToCompany();
        } else {
            return 0.0;
        }
    }
    public void manageTime() {
        if (onHoliday) {
            if (day == 7) {
                day = 1;
                onHoliday = false;
            } else {
                day++;
            }
        } else {
            if (day % 22 == 0) {
                onHoliday = true;
                day = 1;
            } else {
                day++;
            }
        }
    }
}
