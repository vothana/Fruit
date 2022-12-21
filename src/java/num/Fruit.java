/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package num;

import java.sql.Blob;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author VothanaCHY
 */
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Fruit {
    private int id;
    private String Name;
    private double Price;
    private String Description;
    private String DateIn;
    private int Day;
    private String Image;

    public Fruit(String Name, double Price, String Description, String DateIn, int Day, String Image) {
        this.Name = Name;
        this.Price = Price;
        this.Description = Description;
        this.DateIn = DateIn;
        this.Day = Day;
        this.Image = Image;
    }
}

