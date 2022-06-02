import ru.netology.sqr.homework.SQRService;

public class Main {

    public static void main(String[] args) {

        int lowerLimit = 200;
        int upperLimit = 300;

        SQRService service = new SQRService();
        System.out.println("Количество квадратов в заданном диапазоне: " + service.calculateSqr(firstNum, lastNum, lowerLimit, upperLimit));
    }
}
