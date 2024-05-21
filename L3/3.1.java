/*Добавить к гаражу возможность удаления из него машины, а к классу Auto добавить поле с гос.номером*/

import java.util.ArrayList;

public class GarageCar {
    private ArrayList < Auto > masCar = new ArrayList <Auto> ();

    public void addCar(Auto m) {
        masCar.add(m);
    }

    public void removeCar(Auto m) {
        masCar.remove(m);
    }

    public GarageCar() {}

    public GarageCar(ArrayList < Auto > n) {
        masCar = n;
    }

    public Boolean findCar(Auto m) {
        return masCar.contains(m);
    }

    public void printGarage() {
        System.out.println("В гараже: ");
        for (Auto a: masCar) {
            System.out.println("\t" + a.toString());
        }
    }
}


public class Auto {
    private String firm;
    private int maxSpeed;
    private String regNumber; //гос. номер

    public Auto() {
        firm = "Без названия";
        maxSpeed = 0;
        regNumber = "Без гос. номера";
    }

    public Auto(String firma, int speed, String number) {
        firm = firma;
        maxSpeed = speed;
        regNumber = number;
    }

    public void setFirm(String firma) {
        firm = firma;
    }

    public void setMaxSpeed(int speed) {
        maxSpeed = speed;
    }

    public void setRegNumber(String number) {
        regNumber = number;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getFirm() {
        return firm;
    }

    public String getRegNumber() {
        return regNumber;
    }
}