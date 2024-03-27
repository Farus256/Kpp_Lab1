package kpp_lab1;

public class Line {
    private RationalFraction slope;
    private RationalFraction intercept;

    public Line(RationalFraction slope, RationalFraction intercept) {
        this.slope = slope;
        this.intercept = intercept;
    }

    public RationalFraction getSlope() {
        return slope;
    }

    public RationalFraction getIntercept() {
        return intercept;
    }

    public RationalFraction[] getIntersections() {
        RationalFraction xIntercept = new RationalFraction(-intercept.getNumerator() * slope.getDenominator(), intercept.getDenominator() * slope.getNumerator());
        RationalFraction yIntercept = intercept;
        return new RationalFraction[]{xIntercept, yIntercept};
    }

    public RationalFraction getIntersection(Line other) {
        RationalFraction newNumerator = other.getIntercept().subtract(this.getIntercept());
        RationalFraction newDenominator = this.getSlope().subtract(other.getSlope());
        return new RationalFraction(newNumerator.getNumerator(), newDenominator.getNumerator());
    }

    public static boolean areParallel(Line line1, Line line2) {
        return line1.getSlope().getNumerator() * line2.getSlope().getDenominator() == line2.getSlope().getNumerator() * line1.getSlope().getDenominator();
    }
}
