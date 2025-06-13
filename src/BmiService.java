public class BmiService {
    public int calculate(double heighMeters, int weighKg) {

        double bmiIndex = weighKg / (heighMeters * heighMeters);
        return (int) bmiIndex;

    }
}
