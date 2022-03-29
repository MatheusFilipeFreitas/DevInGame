package model;

public class Inventory {

    /*
    Weapons:
        melee id: 1 {clap (2),sword (4)}
        magic id: 2 {book (3),staff (5)}
    Armor:
        head id: 3 {iron,gold}
        chest id: 4 {iron,gold}
        leg id: 5 {iron,gold}
        bots id: 6 {iron,gold}
     */

    private Character character;
    private int itemType;
    private String itemName;
    private int itemQuantity;
    private int hp;

    public Inventory(Character character, int itemType, String itemName, int itemQuantity, int hp) {
        this.character = character;
        this.itemType = itemType;
        this.itemName = itemName;
        this.itemQuantity = itemQuantity;
        this.hp = hp;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public int getItemType() {
        return itemType;
    }

    public void setItemType(int itemType) {
        this.itemType = itemType;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
