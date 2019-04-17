/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablecombo;

import javafx.scene.control.ComboBox;

/**
 *
 * @author bett
 */
public class TableBean {
    String name;
    
    ComboBox<String> gender;

    public TableBean(String name, ComboBox<String> gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ComboBox<String> getGender() {
        return gender;
    }

    public void setGender(ComboBox<String> gender) {
        this.gender = gender;
    }
    
}
