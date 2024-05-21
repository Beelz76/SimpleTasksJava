/*Базовый класс – компьютер. Производные – ноутбук и смартфон. Создать класс РемонтСервис, который может содержать оба вида объектов. Предусмотреть метод подсчета отдельно ремонтируемых ноутбуков и смартфонов (использовать оператор instanceof)*/

//Computer.java
public class Computer {
    private String brand;
    private String model;
    private int price;

    public Computer() {
        brand = "Неизвестно";
        model = "Неизвестно";
        price = 0;
    }

    public Computer(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public String display() {
        return brand + " | " + model + " | " + price;
    }
}

//Laptop.java
public class Laptop extends Computer {
    private double screenSize;
    private String resolution;

    public Laptop() {
        super();
        this.screenSize = 0;
        this.resolution = "Неизвестно";
    }

    public Laptop(String brand, String model, int price, double screenSize, String resolution) {
        super(brand, model, price);
        this.screenSize = screenSize;
        this.resolution = resolution;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public String getResolution() {
        return resolution;
    }

    public String display() {
        return getBrand() + " | " + getModel() + " | " + getPrice() + " | " + screenSize + " | " +
            resolution;
    }
}

//Smartphone.java
public class Smartphone extends Computer {
    private int memory;
    private String color;

    public Smartphone() {
        super();
        this.color = "Неизвестно";
        this.memory = 0;
    }

    public Smartphone(String brand, String model, int price, int memory, String color) {
        super(brand, model, price);
        this.memory = memory;
        this.color = color;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMemory() {
        return memory;
    }

    public String getColor() {
        return color;
    }

    public String display() {
        return getBrand() + " | " + getModel() + " | " + getPrice() + " | " + memory + "GB | " +
            color;
    }
}

//RepairService.java
import java.util.ArrayList;
public class RepairService {
    private ArrayList < Computer > computers = new ArrayList < Computer > ();

    public RepairService() {}

    public RepairService(ArrayList < Computer > computers) {
        this.computers = computers;
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void removeComputer(Computer computer) {
        computers.remove(computer);
    }

    public int numberOfLaptops() {
        int count = 0;
        for (Computer computer: computers) {
            if (computer instanceof Laptop) {
                count++;
            }
        }
        return count;
    }

    public int numberOfSmartphones() {
        int count = 0;
        for (Computer computer: computers) {
            if (computer instanceof Smartphone) {
                count++;
            }
        }
        return count;
    }

    public void display() {
        for (Computer computer: computers) {
            System.out.println(computer.display());
        }
    }
}

//Main.java
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
