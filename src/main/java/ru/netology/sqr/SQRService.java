package ru.netology.sqr;

public class SQRService {

    public int calcSquareRoot(int start, int finish) {
        int numSqrt = 0;
        for (int i = 10; i <=99; i++) {
            int sgr = i * i;
            if (sgr >= start && sgr <= finish) {
                numSqrt++;
            }
        }
        return numSqrt;
    }
}

