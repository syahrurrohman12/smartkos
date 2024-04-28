
package com.model;

import javax.swing.Icon;


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
     * @return the values
     */
    public String getValues() {
        return values;
    }

    /**
     * @param values the values to set
     */
    public void setValues(String values) {
        this.values = values;
    }

    /**
     * @return the describtion
     */
    public String getDescribtion() {
        return describtion;
    }

    /**
     * @param describtion the describtion to set
     */
    public void setDescribtion(String describtion) {
        this.describtion = describtion;
    }

    public Model_Card(Icon icon, String title, String values, String describtion) {
        this.icon = icon;
        this.title = title;
        this.values = values;
        this.describtion = describtion;
    }

    public Model_Card() {
    }
    
    private Icon icon;
    private String title;
    private String values;
    private String describtion;
}
