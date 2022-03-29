package controller;

import model.Character;
import model.Inventory;

import java.util.ArrayList;
import java.util.List;

public class InventoryController {

    List<Inventory> inventoryList = new ArrayList<>();

    public boolean addItem(Inventory inventory){
        return inventoryList.add(inventory);
    }

    public String  getItemByCharacterAndType(Inventory inventory){
        if(inventory.getItemType() == 1 || inventory.getItemType() == 2){
            return inventory.getItemName();
        }
        return null;
    }
}
