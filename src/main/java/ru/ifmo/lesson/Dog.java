package ru.ifmo.lesson;

// комментарий
/* комментарий */

/**
 * Документация (парсится javadoc плагином).
 * Документировать можно классы, свойства, конструкторы, методы
 * Можно использовать текст, html теги, javadoc теги (начинаются с @)
 * Документирование начинается с описания класса, метода и тд в свободной форме,
 * далее описания типов данных параметров, свойств, возвращаемых значений и тд
 * через javadoc теги.
 *
 * Основные javadoc теги:
 * 1. @author указание на автора (только для классов)
 * 2. @version версия класса (только для классов)
 * 3. @since с какой версии языка доступен код (для классов, конструкторов, свойств, методов)
 * 4. @see ссылка - создает ссылку на класс, конструктор, метод, свойство, доступные
 * в приложении (для классов, конструкторов, свойств, методов)
 *      Варианты ссылок (в текущем классе):
 *      @see #имяПоля
 *      @see #ИмяКонструктора(принимаемые параметры)
 *      @see #имяМетода(принимаемые параметры)
 *
 *     Варианты ссылок (в другом классе):
 *     @see ИмяКласса
 *     @see ИмяКласса#имяПоля
 *     @see ИмяКласса#ИмяКонструктора(принимаемые параметры)
 *     @see ИмяКласса#имяМетода(принимаемые параметры)
 *
 *  5. @param имяПараметра - описание параметра (для конструкторов и методов)
 *  6. @return описание возвращаемого значения (для методов)
 *  7. @@throws ТипИсключения описание исключения, которое выбрасывает метод или
 *  конструктор (для конструкторов и методов)
 *
 *  Подробнее смотрите на oracle https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html
 * */
public class Dog {
    private String name;
    private int age;
    private String owner;

    /**
     * Описание
     *
     * @since (свойства, конструкторы, методы) 1.6
     * @see #Dog(String name, String owner)
     *
     * */
    // @see создает ссылку на класс (Class),
    // свойство (#fieldName / Class#fieldName),
    // метод (#methodName / Class#methodName)
    public Dog() {}

    /**
     * @param name - ... (можно использовать с конструкторами и методами)
     * @param owner - ...
    * */
    public Dog(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    /**
     * Описание
     * @return - описываем результат работы метода
     * */
    public String getName() {
        return name;
    }

    /**
     * Описание
     * @param name - ...
     * @throws IllegalAccessException - ...
     * */
    public void setName(String name) throws IllegalAccessException {
        if (name.length() < 3) {
            throw new IllegalAccessException();
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
