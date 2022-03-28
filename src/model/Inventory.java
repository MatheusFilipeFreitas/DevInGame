package model;

public class Inventory {

    private Character character;
    private int itemType;
    private String itemName;
    private int itemQuantity;

    public Inventory(Character character, int itemType, String itemName, int itemQuantity) {
        this.character = character;
        this.itemType = itemType;
        this.itemName = itemName;
        this.itemQuantity = itemQuantity;
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
}
