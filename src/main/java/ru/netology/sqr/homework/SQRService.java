package ru.netology.sqr.homework;

public class SQRService {

    public int calculateSqr(int lowerLimit, int upperLimit) {
        int count = 0;

        for (int i = 10; i <= 99; i++) {
            if (lowerLimit <= i * i && i * i <= upperLimit) {
                count++;
            }
        }
        return count;
    }
 }
