/**
 * <b>Основной</b> класс для запуска программы
 *
 * @author Vadim Petrov
 */
public class Main {
    public static void main(String[] args) {
        Laptop firstLaptop = new Laptop("Lenovo", "GeekPro G5000", 110000, 15.6, "2560x1400");
        Laptop secondLaptop = new Laptop("Asus", "Vivobook Pro 15 M6500", 63000, 15.6, "1920x1080");
        Smartphone firstPhone = new Smartphone("Samsung", "Galaxy S20 FE", 29000, 128, "Синий");

        RepairService repairService = new RepairService();
        repairService.addComputer(firstLaptop);
        repairService.addComputer(secondLaptop);
        repairService.addComputer(firstPhone);

        repairService.display();

        System.out.println("Кол-во нотубуков: " + repairService.numberOfLaptops());
        System.out.println("Кол-во смартфонов: " + repairService.numberOfSmartphones());
    }
}

