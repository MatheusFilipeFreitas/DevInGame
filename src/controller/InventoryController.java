package controller;

import model.Inventory;

import java.util.ArrayList;
import java.util.List;

public class InventoryController {

    List<Inventory> inventoryList = new ArrayList<>();

    public boolean addItem(Inventory inventory){
        return inventoryList.add(inventory);
    }
}
