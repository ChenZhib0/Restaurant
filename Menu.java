import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private String group;
    private String cuisine;
    private double money;
    private double money1;

    public Menu() {
    }

    public Menu(String group,String cuisine, double money,double money1) {
        this.cuisine = cuisine;
        this.money = money;
        this.money1 = money1;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }


    public double getMoney1() {
        return money1;
    }

    public void setMoney1(double money1) {
        this.money1 = money1;}





}
