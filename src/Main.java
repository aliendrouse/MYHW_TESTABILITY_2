public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double heighMeters = 1.87;
        int weightKg = 98;

        int bmiIndex = service.calculate(heighMeters, weightKg);
        System.out.println("Для роста " + heighMeters + " м и веса " + weightKg + " кг:");
        System.out.println("BMI-индекс: " + bmiIndex);
    }
}