public class Human {
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        Human human = new Human("Thomas", 39);
        human.sayHello();
    }
    void sayHello() {
        System.out.println("Привет, меня зовут " + this.name + ", мне " + this.age + " лет.");
    }
}
