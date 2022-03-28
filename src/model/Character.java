package model;

public class Character {

    private String name;
    private double height;
    private int gameClass; //1) Warrior; 2) Mage;
    private Inventory inventory;
    private int experience;

    public Character(String name, double height, int gameClass, int experience) {
        this.name = name;
        this.height = height;
        this.gameClass = gameClass;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getGameClass() {
        return gameClass;
    }

    public void setGameClass(int gameClass) {
        this.gameClass = gameClass;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
