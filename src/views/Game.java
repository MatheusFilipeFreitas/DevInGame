package views;

import controller.InventoryController;
import function.MenusFunction;
import model.Character;
import model.Inventory;

import java.util.Scanner;

public class Game {

    int UP_SPACE = 6;

    Scanner input = new Scanner(System.in);

    MenusFunction menusFunction = new MenusFunction();

    InventoryController inventoryController = new InventoryController();

    public void gameNewStart(Character character, int weaponOption, int weaponClass){

        Inventory startItem;

        if(weaponClass == 1){
            if(weaponOption == 1){
                startItem = new Inventory(character, 1, "woodenClap", 1);
            }else{
                startItem = new Inventory(character, 1, "stoneClap", 1);
            }
        }else{
            if(weaponOption == 1){
                startItem = new Inventory(character, 1, "weakMagicStick", 1);
            }else {
                startItem = new Inventory(character, 1, "weakMagicBook", 1);
            }
        }

        inventoryController.addItem(startItem);

        menusFunction.space(UP_SPACE);
        System.out.println("OLA");

    }
}


