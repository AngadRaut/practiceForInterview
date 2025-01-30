package org.example.coupling;

public class LooseCoupling {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(1,2,3);
        System.out.println(cylinder.getVolume());
    }
}
class Cylinder{
    public int Volume;
    Cylinder(int length,int width,int height){
        this.Volume = length* width*height;
    }
    public int getVolume(){
        return Volume;
    }
}