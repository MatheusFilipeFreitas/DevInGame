package controller;

import model.Character;
import model.Save;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SaveController {

    List<Save> saveList = new ArrayList<>();

    int i = 1;

    public void createSave(Save save){
        saveList.add(save);
    }

    public void listSave(){
        for (Save s: saveList
             ) {
            System.out.println(" ");
            System.out.println(i + ") [ " + s.getTime() + " ] - Character: " + s.getName());
            System.out.println(" ");
            i++;
        }
    }

    public boolean viewSaveValid(int option){
        return saveList.get(option) != null;
    }

    public void updateSave(LocalDateTime time, String name, Character character){
        saveList.set(saveList.indexOf(time), new Save(LocalDateTime.now(), name, character));
    }

    public Save getSaveByIndex(int index){
        return saveList.get(index);
    }


}
