package ru.netology.sqr;

import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();

        int start = 300;
        int finish = 3000;
        int numSqrt = service.calcSquareRoot(start, finish);
        System.out.println("Количество квадратных корней " + numSqrt);
    }
}