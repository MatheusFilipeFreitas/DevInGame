package views;

import controller.InventoryController;
import controller.SaveController;
import function.MenusFunction;
import model.Character;
import model.Inventory;
import model.Save;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Scanner;

public class Menus {

    int UP_SPACE = 6;
    boolean loop = true;

    Scanner input = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);
    Scanner inputDouble = new Scanner(System.in);

    InventoryController inventoryController = new InventoryController();
    SaveController saveController = new SaveController();
    MenusFunction menusFunction = new MenusFunction();

    public void mainMenu(){

        do{

            menusFunction.space(UP_SPACE);
            System.out.println("|------------------------------------|");
            System.out.println("|           DEV IN GAME              |");
            System.out.println("|------------------------------------|");
            System.out.println("|          1) Start new game         |");
            System.out.println("|          2) Load game              |");
            System.out.println("|          3) Extra                  |");
            System.out.println("|          4) Exit                   |");
            System.out.println("|                                    |");
            System.out.println("|-----------------------------------=|");
            System.out.println("<Your option is:>");
            int mainMenuOption = input.nextInt();

            switch (mainMenuOption){
                case 1:
                    startGameMenu();
                    break;


                case 2:
                    saveListMenu();
                    break;


                case 3:
                    extraMenu();
                    break;


                default:
                    errorMenu("Invalid Option!");
                    break;

                case 4:
                    loop = exitMenu();
            }
        }while(loop);
    }

    public void startGameMenu(){

        Save saveGame;

        menusFunction.space(UP_SPACE);
        System.out.println("|------------------------------------|");
        System.out.println("|           DEV IN GAME              |");
        System.out.println("|------------------------------------|");
        System.out.println("| Choose your character name:        |");
        System.out.println("|                                    |");
        System.out.println("|------------------------------------|");
        System.out.println("<Your option is:>");
        String characterName = inputString.next();
        if(Objects.equals(characterName, "")){
            errorMenu("Invalid Name!");
        }
        menusFunction.space(UP_SPACE);
        System.out.println("|------------------------------------|");
        System.out.println("|           DEV IN GAME              |");
        System.out.println("|------------------------------------|");
        System.out.println("| Choose your character height:(1,72)|");
        System.out.println("|                                    |");
        System.out.println("|------------------------------------|");
        System.out.println("<Your option is:>");
        double characterHeight = inputDouble.nextDouble();
        if(characterHeight < 0){
            errorMenu("Invalid Height!");
        }
        menusFunction.space(UP_SPACE);
        System.out.println("|------------------------------------|");
        System.out.println("|           DEV IN GAME              |");
        System.out.println("|------------------------------------|");
        System.out.println("| Choose your character sex:         |");
        System.out.println("|                                    |");
        System.out.println("|      1)Male         2)Female       |");
        System.out.println("|------------------------------------|");
        System.out.println("<Your option is:>");
        int characterSex = inputDouble.nextInt();
        if(characterSex == 0 || characterSex > 2 || characterSex < 0){
            errorMenu("Invalid Height!");
        }
        menusFunction.space(UP_SPACE);
        System.out.println("|------------------------------------|");
        System.out.println("|           DEV IN GAME              |");
        System.out.println("|------------------------------------|");
        System.out.println("| Choose your game class:            |");
        System.out.println("|                                    |");
        System.out.println("|   1)Warrior           2)Mage       |");
        System.out.println("|                                    |");
        System.out.println("|------------------------------------|");
        System.out.println("<Your option is:>");
        int characterClass = input.nextInt();

        if(characterClass != 1 && characterClass != 2){
            errorMenu("Invalid Option!");
        }
        switch (characterClass){
            case 1:
                menusFunction.space(UP_SPACE);
                System.out.println("|------------------------------------|");
                System.out.println("|           DEV IN GAME              |");
                System.out.println("|------------------------------------|");
                System.out.println("| Choose your primary weapon:        |");
                System.out.println("|                                    |");
                System.out.println("| 1)Wooden club      2)Stone club    |");
                System.out.println("|                                    |");
                System.out.println("|------------------------------------|");
                System.out.println("<Your option is:>");
                int weaponCharacter = input.nextInt();
                if(weaponCharacter == 1 || weaponCharacter == 2){
                    Character character = new Character(characterName, characterHeight, characterSex, characterClass, 0);
                    gameLevel(character, weaponCharacter);
                }else{
                    errorMenu("Invalid Option!");
                }
                break;

            case 2:
                menusFunction.space(UP_SPACE);
                System.out.println("|------------------------------------|");
                System.out.println("|           DEV IN GAME              |");
                System.out.println("|------------------------------------|");
                System.out.println("| Choose your primary magic weapon:  |");
                System.out.println("|                                    |");
                System.out.println("| 1)Magic Stick      2)Magic Book    |");
                System.out.println("|                                    |");
                System.out.println("|------------------------------------|");
                System.out.println("<Your option is:>");
                int magicWeaponCharacter = input.nextInt();
                if(magicWeaponCharacter == 1 || magicWeaponCharacter == 2){
                    Character character = new Character(characterName, characterHeight, characterSex, characterClass, 0);
                    gameLevel(character, magicWeaponCharacter);
                }else{
                    errorMenu("Invalid Option!");
                }
                break;

            default:
                errorMenu("Invalid Option!");
                break;
        }
    }

    public void saveListMenu(){
        menusFunction.space(UP_SPACE);
        System.out.println("|------------------------------------|");
        System.out.println("|           DEV IN GAME              |");
        System.out.println("|------------------------------------|");

        saveController.listSave();
        System.out.println("<Your choose is:>");
        int saveListMenuOption = input.nextInt();

        try {
            saveController.viewSaveValid(saveListMenuOption);
        }catch (Exception e){
            errorMenu("Invalid Option!");
        }
    }

    public void extraMenu(){
        menusFunction.space(UP_SPACE);
        System.out.println("|------------------------------------|");
        System.out.println("|           DEV IN GAME              |");
        System.out.println("|------------------------------------|");
        System.out.println("| DEV: Matheus Filipe Freitas        |");
        System.out.println("| BUILDED: 27.03                     |");
        System.out.println("| VERSION: 1.0                       |");
        System.out.println("|------------------------------------|");
        menusFunction.timer();
    }

    public boolean exitMenu(){
        menusFunction.space(UP_SPACE);
        System.out.println("|------------------------------------|");
        System.out.println("|           DEV IN GAME              |");
        System.out.println("|------------------------------------|");
        System.out.println("|   Sair do jogo resultará em perda  |");
        System.out.println("|   TOTAL do progresso, assim como   |");
        System.out.println("|   de seus itens!                   |");
        System.out.println("|                                    |");
        System.out.println("|   TEM CERTEZA QUE DESEJA SAIR?     |");
        System.out.println("|      1) SIM            2)NÃO       |");
        System.out.println("|------------------------------------|");
        System.out.println("<Your option is:>");
        int exitMenuOption = input.nextInt();

        switch (exitMenuOption){

            default:
                errorMenu("Invalid Option!");
                break;

            case 1:
                return false;

            case 2:
                return true;
        }

        return false;
    }

    public void errorMenu(String errorCode){
        menusFunction.space(UP_SPACE);
        System.out.println("|------------------------------------|");
        System.out.println("|           DEV IN GAME              |");
        System.out.println("|------------------------------------|");
        System.out.println(" ERROR: " + errorCode);
        System.out.println("|                                    |");
        System.out.println("|------------------------------------|");
        menusFunction.timer();
    }

    //GAME:

    public void gameLevel(Character character, int startPack){

        Save saveGame = new Save(LocalDateTime.now(), character.getName(), character);
        saveController.createSave(saveGame);

        Inventory startItem;

        switch (character.getExperience()){

            case 0:
                if(character.getGameClass() == 1){
                    startItem = new Inventory(character, 1, "clap", 1, 20);
                }else{
                    startItem = new Inventory(character, 2, "book", 1, 20);
                }


                inventoryController.addItem(startItem);
                menusFunction.space(UP_SPACE);
                System.out.println("Item: " + startItem.getItemName() + "has been add to your inventory!");

                menusFunction.timer();

                menusFunction.space(UP_SPACE);
                System.out.println("Welcome to BATALHA FINAL!");
                System.out.println("Choose your difficult:");
                System.out.println("1. Easy");
                System.out.println("2. Medium");
                System.out.println("3. Hard");
                System.out.println("<Your option is:>");
                int optionDifficult = input.nextInt();

                if(optionDifficult == 1){
                    //Easy mode
                }else if(optionDifficult == 2){
                    //Medium mode
                }else if(optionDifficult == 3){
                    //Hard mode
                }else{
                    errorMenu("Invalid Option!");
                }
                break;
        }
    }

}

