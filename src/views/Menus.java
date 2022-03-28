package views;

import controller.CharacterController;
import controller.InventoryController;
import controller.SaveController;
import function.MenusFunction;
import model.Character;
import java.util.Objects;
import java.util.Scanner;

public class Menus {

    int UP_SPACE = 6;
    boolean loop = true;

    Scanner input = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);
    Scanner inputDouble = new Scanner(System.in);

    Game game = new Game();
    SaveController saveController = new SaveController();
    InventoryController inventoryController = new InventoryController();
    CharacterController characterController = new CharacterController();
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
        System.out.println("| Choose your game class:            |");
        System.out.println("|                                    |");
        System.out.println("| 1) Warrior          2)Mage         |");
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
                System.out.println("| 1) Wooden club     2)Stone club    |");
                System.out.println("|                                    |");
                System.out.println("|------------------------------------|");
                System.out.println("<Your option is:>");
                int weaponCharacter = input.nextInt();
                if(weaponCharacter == 1){
                   Character character = new Character(characterName, characterHeight, characterClass, 0);
                    characterController.createCharacter(character);
                    game.gameNewStart(character, weaponCharacter, characterClass);
                }else if(weaponCharacter == 2){
                    Character character = new Character(characterName, characterHeight, characterClass, 0);
                    characterController.createCharacter(character);
                    game.gameNewStart(character, weaponCharacter, characterClass);
                }else{
                    errorMenu("Invalid Option!");
                }
                break;
        }
    }

    public void saveListMenu(){
        menusFunction.space(UP_SPACE);
        System.out.println("|------------------------------------|");
        System.out.println("|           DEV IN GAME              |");
        System.out.println("|------------------------------------|");
        /*
        Save save = new Save(LocalDateTime.now(), "Teste 1");
        Save save1 = new Save(LocalDateTime.now(), "Teste 2");
        Save save2 = new Save(LocalDateTime.now(), "Teste 3");
        saveController.createSave(save);
        saveController.createSave(save1);
        saveController.createSave(save2);
         */
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


}

