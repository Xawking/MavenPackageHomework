package org.example;

import ru.netology.javaqa.javaqamvn.services.CalcService;

public class Main {
    public static void main(String[] args) {
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        CalcService service = new CalcService();
        int vacation = service.calculate(income, expenses, threshold);
        System.out.println(vacation);



    }
}