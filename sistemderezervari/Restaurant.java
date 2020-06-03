package com.sda.sistemderezervari;

import java.util.ArrayList;
import java.util.List;

public class Restaurant{
    private List<Table> tables = new ArrayList<>();

    private String name;
    private String description;

    public List<Table> getTables() {
        return tables;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumarMasa(Table table) {
        int number = 0;
        for (int i = 0; i < tables.size(); i++) {
            number = tables.indexOf(table);
        }
        return number;
    }
}
