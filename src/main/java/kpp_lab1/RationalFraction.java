package kpp_lab1;

public class RationalFraction {
    private int m;
    private int n;

    public RationalFraction(int m, int n) {
        this.m = m;
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return m + "/" + n;
    }

    public void reduce() {
        int gcd = gcd(m, n);
        m /= gcd;
        n /= gcd;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}

