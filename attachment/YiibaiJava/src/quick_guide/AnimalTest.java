package quick_guide;
/*
 * Java允许从其他类扩展类。类扩展另一个类称为子类。 子类必须有继承父类中的字段和方法的能力。
 */
public class AnimalTest {

    public static void main(String[] args) {

        // Declaring a Cat object.
        Cat cat = new Cat();

        // Check 'cat' instance of Animal.
        // The result is clearly true.
        boolean isAnimal = cat instanceof Animal;
        System.out.println("cat instanceof Animal?"+ isAnimal);

        // ==> Meo
        // Call the method say() of the Cat.
        cat.say();


        // Declare an object Animal
        // Initialize the object through the Constructor of the Cat.
        Animal cat2 = new Cat();

        // ==> Meo
        // Call to say() of Cat (Not Animal)
        cat2.say();

        // Create the object Animal
        // Through the Constructor of the class Ant.        
        Animal ant = new Ant();

        // Ant has no say() method.
        // It call to say() method that inherited from the parent class (Animal)        
        ant.say();
    }
}
