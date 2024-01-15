package Activity3;
public class FactorGenerator {
    private int numberToFactor;
    private int factor;

    public FactorGenerator(int numberToFactor) {
        this.numberToFactor = numberToFactor;
        this.factor = 2; // Start with the first prime factor, 2.
    }

    public boolean hasMoreFactors() {
        return numberToFactor > 1;
    }

    public int nextFactor() {
        if (!hasMoreFactors()) {
            return -1; // No more factors to find
        }

        while (numberToFactor % factor != 0) {
            factor++; // Find the next prime factor
        }

        numberToFactor /= factor; // Reduce the number
        return factor;
    }
}

