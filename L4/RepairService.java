import java.util.ArrayList;

/**
 * Класс описывает <b>сервис ремонта</b>
 *
 * @author Vadim Petrov
 */
public class RepairService {
    /** Поле список комьютеров */
    private ArrayList<Computer> computers = new ArrayList<Computer>();

    /**
     * Конструктор без параметров,
     * инициализирующий объект RepairService со значениями по умолчанию.
     */
    public RepairService() {}

    /**
     * Конструктор с параметрами,
     * инициализирующий объект RepairService с заданными значениями.
     * @param computers компьютеры
     */
    public RepairService(ArrayList<Computer> computers) {
        this.computers = computers;
    }

    /**
     * Добавляет объект в список.
     * @param computer компьютер
     */
    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    /**
     * Удаляет объект из списка.
     * @param computer компьютер
     */
    public void removeComputer(Computer computer) {
        computers.remove(computer);
    }

    /**
     * Возвращает количество ноутбуков в списке.
     * @return количество ноутбуков
     */
    public int numberOfLaptops() {
        int count = 0;

        for (Computer computer: computers) {
            if (computer instanceof Laptop) {
                count ++;
            }
        }

        return count;
    }

    /**
     * Возвращает количество смартфонов в списке.
     * @return количество смартфонов
     */
    public int numberOfSmartphones() {
        int count = 0;

        for (Computer computer: computers) {
            if (computer instanceof Smartphone) {
                count ++;
            }
        }

        return count;
    }

    /**
     * Выводит информацию о всех объектах в списке.
     */
    public void display() {
        for (Computer computer: computers) {
            System.out.println(computer.display());
        }
    }
}
