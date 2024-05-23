package ru.netology.services;

public class FreelancerService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                count++;
                money = money - expenses;
                money = money - (money / 3);
            } else {
                money = money + income;
                money = money - expenses;
            }
            System.out.println("Месяц " + (month + 1) + ": Денег = " + money);
        }

        return count;
    }
}
