package ru.netology.services;

// Импорт класса FreelancerService

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FreelancerServiceTest {
    @Test
    public void testCalcFreelancerMonthsBelowThreshold() {
        FreelancerService service = new FreelancerService();
        int income = 2000;
        int expenses = 1500;
        int threshold = 5000;
        assertEquals(1, service.calcFreelancerMonths(income, expenses, threshold));
    }

    @Test
    public void testCalcFreelancerMonthsExactThreshold() {
        FreelancerService service = new FreelancerService();
        int income = 4000;
        int expenses = 2000;
        int threshold = 2000;
        assertEquals(6, service.calcFreelancerMonths(income, expenses, threshold));
    }

    @Test
    public void testCalcFreelancerMonthsAboveThreshold() {
        FreelancerService service = new FreelancerService();
        int income = 4500;
        int expenses = 2000;
        int threshold = 3000;
        assertEquals(5, service.calcFreelancerMonths(income, expenses, threshold));
    }

    @Test
    public void testCalcFreelancerMonthsHighThreshold() {
        FreelancerService service = new FreelancerService();
        int income = 3000;
        int expenses = 1000;
        int threshold = 20000;
        assertEquals(1, service.calcFreelancerMonths(income, expenses, threshold));
    }
}
