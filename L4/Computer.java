/**
 * Класс описывает <b>компьютер</b>
 *
 * @author Vadim Petrov
 */
public class Computer {
    /** Поле бренд компьютера */
    private String brand;

    /** Поле модель компьютера */
    private String model;

    /** Поле цена компьютера */
    private int price;

    /**
     * Конструктор без параметров,
     * инициализирующий объект Computer со значениями по умолчанию.
     */
    public Computer() {
        brand = "Неизвестно";
        model = "Неизвестно";
        price = 0;
    }

    /**
     * Конструктор с параметрами,
     * инициализирующий объект Computer с заданными значениями.
     * @param brand бренд
     * @param model модель
     * @param price цена
     */
    public Computer(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    /**
     * Устанавливает бренд компьютера.
     * @param brand бренд
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Устанавливает модель компьютера.
     * @param model модель
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Устанавливает цену компьютера.
     * @param price цена
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Возвращает бренд компьютера.
     * @return бренд
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Возвращает модель компьютера.
     * @return модель
     */
    public String getModel() {
        return model;
    }

    /**
     * Возвращает цену компьютера.
     * @return цена
     */
    public int getPrice() {
        return price;
    }

    /**
     * Возвращает строковое представление компьютера.
     * @return строковое предсталвение компьютера
     */
    public String display() {
        return brand + " | " + model + " | " + price;
    }
}
