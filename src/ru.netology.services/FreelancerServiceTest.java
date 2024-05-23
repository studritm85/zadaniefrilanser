package ru.netology.services;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FreelanceServiceTest {

    @Test
    public void testCalculateExample1() {
        FreelancerService service = new FreelancerService();
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int expected = 3;

        int actual = service.calculate(income, expenses, threshold);

        assertEquals(expected, actual);
    }

    @Test
    public void testCalculateExample2() {
        FreelancerService service = new FreelancerService();
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        int expected = 2;

        int actual = service.calculate(income, expenses, threshold);

        assertEquals(expected, actual);
    }
}
