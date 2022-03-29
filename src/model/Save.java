package model;

import java.time.LocalDateTime;

public class Save {

    private LocalDateTime time;
    private String name;
    private Character character;

    public Save(LocalDateTime time, String name, Character character) {
        this.time = time;
        this.name = name;
        this.character = character;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }
}
