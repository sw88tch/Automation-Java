// родительский класс
class Animal {
    protected String name = "I am Animal!";

    public void printMethod() {
        System.out.println("Napechatano iz klassa Animal:");
    }
}

// класс-наследник
class Dog extends Animal {
    private String name = "I am Dog!";

    // переопределение метода printMethod()
    @Override
    public void printMethod() {
        super.printMethod(); // вызов метода класса-родителя
        System.out.println(super.name); // доступ к полю класса-родителя
        System.out.println("Napechatano iz klassa Dog:");
        System.out.println(name);
    }

    public static void main(String[] args) {
        Dog s = new Dog();
        s.printMethod();
    }
} 