import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        String[] favouritelessonfarida = {"Java", "Soft Skill", "English"};
        String[] favouritelessonsadraddin = {"Music", "Algebra", "French"};
        MyClass person1 = new MyClass("Farida", "Begimbai kyzy", 20, favouritelessonfarida, "Laghman,Manty,Ganfan,Samsa");
        MyClass person2 = new MyClass("Sadraddin", "Ahmetov",25,favouritelessonsadraddin,"Pizza,Burgers, Sushi and Pasta");
        System.out.println("---------------------------------------------------");
        System.out.println("Person 1:");
        System.out.println("---------------------------------------------------");
        System.out.println("Аты: " + person1.name);
        System.out.println("Фамилиясы: " + person1.surname);
        System.out.println("Жашы: " + person1.age);
        System.out.println("Сабактары: " + Arrays.toString(person1.favouritelesson));
        System.out.println("Тамагы: " + person1.dishes);
        System.out.println("---------------------------------------------------");
        System.out.println("Person 2:");
        System.out.println("---------------------------------------------------");
        System.out.println("Аты: " + person2.name);
        System.out.println("Фамилиясы: " + person2.surname);
        System.out.println("Жашы: " + person2.age);
        System.out.println("Сабактары: " + Arrays.toString(person2.favouritelesson));
        System.out.println("Тамагы: " + person2.dishes);
    }
}

