package ru;
public class FreelancerService {
    public int calcFreelancerMonths(int income, int expenses, int threshold) {
        int money = 0;
        int FreelancerMonths = 0;
        for (int i = 0; i < 12; i++) {
            if (money < threshold) {
                money += income; // money = money + income
                money -= expenses;
            } else {
                money -= expenses;
                money /= 3;
                FreelancerMonths++;
            }
        }
        return FreelancerMonths;
    }
}