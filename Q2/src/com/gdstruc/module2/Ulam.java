package com.gdstruc.module2;

import java.util.Objects;

public class Ulam {

    private int menuItemNumber;
    private String name;
    private int canMake;

    public int getmenuItemNumber() {
        return menuItemNumber;
    }

    public void setmenuItemNumber(int menuItemNumber) {
        this.menuItemNumber = menuItemNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCanMake() {
        return canMake;
    }

    public void setCanMake(int canMake) {
        this.canMake = canMake;
    }

    public Ulam(int menuItemNumber, String name, int canMake) {
        this.menuItemNumber = menuItemNumber;
        this.name = name;
        this.canMake = canMake;
    }

    @Override
    public String toString() {
        return "Ulam{" +
                "Menu Item Number=" + menuItemNumber +
                ", Name='" + name + '\'' +
                ", Can Make=" + canMake +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com.gdstruc.module2.Ulam ulam = (com.gdstruc.module2.Ulam) o;
        return menuItemNumber == ulam.menuItemNumber && canMake == ulam.canMake && name.equals(ulam.name);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(menuItemNumber, name, canMake);
    }
}
