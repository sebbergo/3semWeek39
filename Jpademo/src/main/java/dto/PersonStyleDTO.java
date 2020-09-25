/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author sebas
 */
public class PersonStyleDTO {
    
    private String name;
    private int year;
    private String style;

    public PersonStyleDTO(String name, int year, String style) {
        this.name = name;
        this.year = year;
        this.style = style;
    }
    
    public PersonStyleDTO(){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
    
}
