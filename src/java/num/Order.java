/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package num;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author VothanaCHY
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Order {
    private int fruitId;
    private String Name;
    private double Price;
    private String Image;
    private String Description;
    private int Quantity;
    private int orderID;
    private double Total;
}