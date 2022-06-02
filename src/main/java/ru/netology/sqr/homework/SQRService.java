package ru.netology.sqr.homework;

public class SQRService {

    public int calculateSqr(int firstNum, int lastNum, int lowerLimit, int upperLimit) {
        int count = 0;

        for (int i = firstNum; i <= lastNum; i++) {
            if (lowerLimit <= i * i && i * i <= upperLimit) {
                count++;
            }
        }
        return count;
    }
 }
