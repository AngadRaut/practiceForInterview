package org.example.coupling;

interface Food {
    public void display();
}
class Italian{
    Food s;
    public Italian(Food food){
        this.s = food;
    }
    public void display(){
        System.out.println("Italian");
        s.display();
    }
}
class Chinese implements Food{

    @Override
    public void display() {
        System.out.println("chinese");
    }
}
class Mexican implements Food{

    @Override
    public void display() {
        System.out.println("Mexican");
    }
}
public class LooseCoupling2 {
    public static void main(String[] args) {
        Food food = new Chinese();
        Food food1 = new Mexican();
        Italian italian = new Italian(food);
        italian.display();  // italian and chinese

        Italian italian1 = new Italian(food1);
        italian1.display();
    }
}
