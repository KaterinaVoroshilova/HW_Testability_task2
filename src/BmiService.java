public class BmiService {
    public int calculate(double h, double w) {
        double square = h * h;
        double index = w / square;
        return (int) index;
    }
}
