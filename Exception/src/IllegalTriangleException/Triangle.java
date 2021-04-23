package IllegalTriangleException;

import java.util.Scanner;

public class Triangle {
    private double s1;
    private double s2;
    private double s3;

    public Triangle() {
        s1 = s2 = s3 = 1.0;
    }

    public Triangle(double s1, double s2, double s3) throws IllegalTriangleException {
        if (s1 + s2 <= s3 || s1 + s3 <= s2 || s2 + s3 <= s1)
            throw new IllegalTriangleException(s1, s2, s3);
            this.s1 = s1;
            this.s2 = s2;
            this.s3 = s3;
        }

    public double getS1() {
        return s1;
    }

    public double getS2() {
        return s2;
    }

    public double getS3() {
        return s3;
    }
    public String toString(){
        return "Triangle: side 1: " + s1 + " side 2: " + s2 + " side 3: " + s3;
    }
}

