package IllegalTriangleException;

public class IllegalTriangleException extends Exception{
    private double s1;
    private double s2;
    private double s3;


    public IllegalTriangleException(double s1, double s2, double s3) {
            super("Illegal sides " + s1 + " " + s2 + " " + s3);
            this.s1 = s1;
            this.s2 = s2;
            this.s3 = s3;
        }


        public double getSide1() {
            return s1;
        }


        public double getSide2() {
            return s2;
        }


        public double getSide3() {
            return s3;
        }
    }

