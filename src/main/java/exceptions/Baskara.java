package exceptions;

public class Baskara {
    public static double[] calc(double a, double b, double c) throws DeltaNegativoException {
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            throw new DeltaNegativoException();
        }
        double raizDelta = Math.sqrt(delta);
        double x1 = (-b + raizDelta) / (2 * a);
        double x2 = (-b - raizDelta) / (2 * a);
        return new double[]{x1, x2};
    }
}
