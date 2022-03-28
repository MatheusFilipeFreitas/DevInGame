package controller;

import model.Character;

import java.util.ArrayList;
import java.util.List;

public class CharacterController {

    List<Character> characterList = new ArrayList<>();

    public void createCharacter(Character character){
        characterList.add(character);
    }
}
