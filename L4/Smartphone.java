/**
 * Класс описывает <b>смартфон</b>
 *
 * @author Vadim Petrov
 */
public class Smartphone extends Computer {
    /** Поле объем памяти смартфона */
    private int memory;

    /** Поле цвет смартфона */
    private String color;

    /**
     * Конструктор без параметров,
     * инициализирующий объект Smartphone со значениями по умолчанию.
     */
    public Smartphone() {
        super();
        this.color = "Неизвестно";
        this.memory = 0;
    }

    /**
     * Конструктор с параметрам,
     * инициализирующий объект Smartphone с заданными значениями.
     * @param brand бренд
     * @param model модель
     * @param price цена
     * @param memory объем памяти
     * @param color цвет
     */
    public Smartphone(String brand, String model, int price, int memory, String color) {
        super(brand, model, price);
        this.memory = memory;
        this.color = color;
    }

    /**
     * Устанавливает объем памяти смартфона.
     * @param memory объем памяти
     */
    public void setMemory(int memory) {
        this.memory = memory;
    }

    /**
     * Устанавливает цвет смартфона.
     * @param color цвет
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Возвращает объем памяти компьютера.
     * @return объем памяти
     */
    public int getMemory() {
        return memory;
    }

    /**
     * Возвращает цвет смартфона.
     * @return цвет
     */
    public String getColor() {
        return color;
    }

    /**
     * Возвращает строковое представление смартфона.
     * @return строковое представление смартфона
     */
    public String display() {
        return getBrand() + " | " + getModel() + " | " + getPrice() + " | " + memory + "GB | " + color;
    }
}
