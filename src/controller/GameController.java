package controller;

import model.Character;
import model.Enemie;

import java.util.Objects;

public class GameController {

    InventoryController inventoryController = new InventoryController();

    /*
    EASY: Enemy -> 1 damage
    MEDIUM: Enemy -> 3 damage
    HARD: Enemy -> 5 damage
     */

    public String characterAtack(Character character, Enemie enemie, int mode){
        String weapon = inventoryController.getItemByCharacterAndType(character.getInventory());
        switch (mode){
            case 1:
                //EASY
                if(Objects.equals(weapon, "clap")){
                    if((enemie.getHp() - 3) > 0){
                        enemie.setHp(enemie.getHp() - 3);
                        return "[" + character.getName() + " (HP: " + character.getInventory().getHp() + ")] " + enemie.getName() + " HP: " + enemie.getHp() + " - 3";
                    }else{
                        enemie.setHp(0);
                        return "[" + character.getName() + " (HP: " + character.getInventory().getHp() + ")] Killed " + enemie.getName();
                    }
                }else if(Objects.equals(weapon, "sword")){
                    if((enemie.getHp() - 5) > 0){
                        enemie.setHp(enemie.getHp() - 5);
                        return "[" + character.getName() + "] " + enemie.getName() + " HP: " + enemie.getHp() + " - 5";
                    }else{
                        enemie.setHp(0);
                        return "[" + character.getName() + " (HP: " + character.getInventory().getHp() + ")] Killed " + enemie.getName();
                    }
                }else if (Objects.equals(weapon, "book")){
                    if((enemie.getHp() - 4) > 0){
                        enemie.setHp(enemie.getHp() - 4);
                        return "[" + character.getName() + " (HP: " + character.getInventory().getHp() + ")] " + enemie.getName() + " HP: " + enemie.getHp() + " - 4";
                    }else{
                        enemie.setHp(0);
                        return "[" + character.getName() + " (HP: " + character.getInventory().getHp() + ")] Killed " + enemie.getName();
                    }
                }else if(Objects.equals(weapon, "staff")){
                    if((enemie.getHp() - 6) > 0){
                        enemie.setHp(enemie.getHp() - 6);
                        return "[" + character.getName() + " (HP: " + character.getInventory().getHp() + ")] " + enemie.getName() + " HP: " + enemie.getHp() + " - 6";
                    }else{
                        enemie.setHp(0);
                        return "[" + character.getName() + " (HP: " + character.getInventory().getHp() + ")] Killed " + enemie.getName();
                    }
                }
                break;

            case 2:
                //MEDIUM
                if(Objects.equals(weapon, "clap")){
                    if((enemie.getHp() - 3) > 0){
                        enemie.setHp(enemie.getHp() - 3);
                        return "[" + character.getName() + " (HP: " + character.getInventory().getHp() + ")] " + enemie.getName() + " HP: " + enemie.getHp() + " - 3";
                    }else{
                        enemie.setHp(0);
                        return "[" + character.getName() + " (HP: " + character.getInventory().getHp() + ")] Killed " + enemie.getName();
                    }
                }else if(Objects.equals(weapon, "sword")){
                    if((enemie.getHp() - 5) > 0){
                        enemie.setHp(enemie.getHp() - 5);
                        return "[" + character.getName() + "] " + enemie.getName() + " HP: " + enemie.getHp() + " - 5";
                    }else{
                        enemie.setHp(0);
                        return "[" + character.getName() + " (HP: " + character.getInventory().getHp() + ")] Killed " + enemie.getName();
                    }
                }else if (Objects.equals(weapon, "book")){
                    if((enemie.getHp() - 4) > 0){
                        enemie.setHp(enemie.getHp() - 4);
                        return "[" + character.getName() + " (HP: " + character.getInventory().getHp() + ")] " + enemie.getName() + " HP: " + enemie.getHp() + " - 4";
                    }else{
                        enemie.setHp(0);
                        return "[" + character.getName() + " (HP: " + character.getInventory().getHp() + ")] Killed " + enemie.getName();
                    }
                }else if(Objects.equals(weapon, "staff")){
                    if((enemie.getHp() - 6) > 0){
                        enemie.setHp(enemie.getHp() - 6);
                        return "[" + character.getName() + " (HP: " + character.getInventory().getHp() + ")] " + enemie.getName() + " HP: " + enemie.getHp() + " - 6";
                    }else{
                        enemie.setHp(0);
                        return "[" + character.getName() + " (HP: " + character.getInventory().getHp() + ")] Killed " + enemie.getName();
                    }
                }
                break;

            case 3:
                //HARD
                if(Objects.equals(weapon, "clap")){
                    if((enemie.getHp() - 2) > 0){
                        enemie.setHp(enemie.getHp() - 2);
                        return "[" + character.getName() + " (HP: " + character.getInventory().getHp() + ")] " + enemie.getName() + " HP: " + enemie.getHp() + " - 2";
                    }else{
                        enemie.setHp(0);
                        return "[" + character.getName() + " (HP: " + character.getInventory().getHp() + ")] Killed " + enemie.getName();
                    }
                }else if(Objects.equals(weapon, "sword")){
                    if((enemie.getHp() - 4) > 0){
                        enemie.setHp(enemie.getHp() - 4);
                        return "[" + character.getName() + "] " + enemie.getName() + " HP: " + enemie.getHp() + " - 4";
                    }else{
                        enemie.setHp(0);
                        return "[" + character.getName() + " (HP: " + character.getInventory().getHp() + ")] Killed " + enemie.getName();
                    }
                }else if (Objects.equals(weapon, "book")){
                    if((enemie.getHp() - 3) > 0){
                        enemie.setHp(enemie.getHp() - 3);
                        return "[" + character.getName() + " (HP: " + character.getInventory().getHp() + ")] " + enemie.getName() + " HP: " + enemie.getHp() + " - 3";
                    }else{
                        enemie.setHp(0);
                        return "[" + character.getName() + " (HP: " + character.getInventory().getHp() + ")] Killed " + enemie.getName();
                    }
                }else if(Objects.equals(weapon, "staff")){
                    if((enemie.getHp() - 5) > 0){
                        enemie.setHp(enemie.getHp() - 5);
                        return "[" + character.getName() + " (HP: " + character.getInventory().getHp() + ")] " + enemie.getName() + " HP: " + enemie.getHp() + " - 5";
                    }else{
                        enemie.setHp(0);
                        return "[" + character.getName() + " (HP: " + character.getInventory().getHp() + ")] Killed " + enemie.getName();
                    }
                }
                break;
        }
        return null;
    }

    public String enemieAtack(Character character, Enemie enemie){

        

        return null;
    }


}
