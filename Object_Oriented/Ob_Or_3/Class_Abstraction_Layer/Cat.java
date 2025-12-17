package Object_Oriented.Ob_Or_3.Class_Abstraction_Layer;

public class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("야옹2");
    }

    public void scratch() {
        System.out.println("스크래치!");
    }
}
