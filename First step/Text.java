/*
После выполнения метода main, значение переменной name у объекта text1 будет "name_updated",
а значение статической переменной staticName класса Text будет "name_updated".
Это происходит из-за того, что оператор += прибавляет к переменной новое значение, то есть строку "_updated".
Когда этот оператор выполняется для переменной name, это изменяет значение переменной name конкретного экземпляра text1.
А когда он выполняется для переменной staticName, это изменяет значение статической переменной staticName самого класса Text.
Когда создается объект text2, он получает начальные значения переменных name и staticName такие же,
как у класса Text по умолчанию. Поэтому значение переменной name у text2 будет "name",
а значение статической переменной staticName будет "name_updated".
 */
public class Text {

    private String name = "name";
    private static String staticName = "name";

    public static void main(String[] args) {
        Text text1 = new Text();
        text1.name += "_updated";
        text1.staticName += "_updated";

        Text text2 = new Text();

        System.out.println(text2.name);
        System.out.println(text2.staticName);
    }
}