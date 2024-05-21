/**
 * Класс описывает <b>ноутбук</b>
 *
 * @author Vadim Petrov
 */
public class Laptop extends Computer {
    /** Поле размер экрана ноутбука */
    private double screenSize;

    /** Поле разрешение экрана ноутбука */
    private String resolution;

    /**
     * Конструктор без параметров,
     * инициализирующий объект Laptop со значениями по умолчанию.
     */
    public Laptop() {
        super();
        this.screenSize = 0;
        this.resolution = "Неизвестно";
    }

    /**
     * Конструктор с параметрами,
     * инициализирующий объект Laptop с заданными значениями.
     * @param brand бренд
     * @param model модель
     * @param price цена
     * @param screenSize размер экрана
     * @param resolution разрешение экрана
     */
    public Laptop(String brand, String model, int price, double screenSize, String resolution) {
        super(brand, model, price);
        this.screenSize = screenSize;
        this.resolution = resolution;
    }

    /**
     * Устанавливает размер экрана ноутбука.
     * @param screenSize размер экрана
     */
    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    /**
     * Устанавливает разрешение экрана ноутбука.
     * @param resolution разрешение экрана
     */
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    /**
     * Возвращает размер экрана ноутбука.
     * @return размер экрана
     */
    public double getScreenSize() {
        return screenSize;
    }

    /**
     * Возвращает разрешение экрана ноутбука.
     * @return разрешение экрана
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * Возвращает строкове представлние ноутбука.
     * @return строковое представление ноутбука
     */
    public String display() {
        return getBrand() + " | " + getModel() + " | " + getPrice() + " | " + screenSize + " | " + resolution;
    }
}
