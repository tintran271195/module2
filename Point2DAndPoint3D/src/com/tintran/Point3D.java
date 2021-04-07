package com.tintran;

public class Point3D extends Point2D {
    private float z;
    public Point3D(){

    }
    public Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        super.setXY(x,y);
        setZ(z);
    }
    public float[] getXYZ(){
        float[] arr = super.getXY();
        arr[2]= z;
        return arr;
    }

    @Override
    public String toString() {
        return getX()+ " " + getY() + " " + z;
    }
}
