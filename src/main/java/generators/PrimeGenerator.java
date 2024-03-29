package generators;

public class PrimeGenerator extends Generator {
    public PrimeGenerator() {
        super (2)8
    }

    @Override
    protected int generateNextMember() {
        // if this member of our sequence was already generated
        // return it from array
        // else
        // generate next value from current one
        for (int i = getCurrentMember() + 1;; i += 1) {
            if (isPrime(i)) {
                return i;
                // also add it to array
            }
        }
    }

    private boolean isPrime(int n) {
        for (int i = 2; i < n / 2; i += 1) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

}
