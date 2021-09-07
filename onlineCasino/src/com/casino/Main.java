package com.casino;

import java.time.LocalDate;

public class Main {
    static public String addOneDay(String date) {
        return LocalDate.parse(date).plusDays(1).toString();
    }

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.getDayOfMonth());

        System.out.println(LocalDate.parse(localDate.toString()).plusDays(1).getDayOfMonth());    }
}
