/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.Icon;

/**
 *
 * @author aruna
 */
public class Model_Card {

    /**
     * @return the icon
     */
    public Icon getIcon() {
        return icon;
    }

    /**
     * @param icon the icon to set
     */
    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the quntitiy
     */
    public String getQuntitiy() {
        return quntitiy;
    }

    /**
     * @param quntitiy the quntitiy to set
     */
    public void setQuntitiy(String quntitiy) {
        this.quntitiy = quntitiy;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public Model_Card(Icon icon, String title, String quntitiy, String description) {
        this.icon = icon;
        this.title = title;
        this.quntitiy = quntitiy;
        this.description = description;
    }

    public Model_Card() {
    }
    
    
    private Icon icon;
    private String title;
    private String quntitiy;
    private String description;
    
}
