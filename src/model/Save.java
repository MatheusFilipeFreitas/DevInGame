package model;

import java.time.LocalDateTime;

public class Save {

    private LocalDateTime time;
    private String name;

    public Save(LocalDateTime time, String name) {
        this.time = time;
        this.name = name;
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
}
