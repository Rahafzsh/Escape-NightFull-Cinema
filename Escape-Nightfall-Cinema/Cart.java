/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escape_nightfall_cinema;
import java.util.*;

public class Cart {
   public ArrayList<Food> snackCart;
   public ArrayList<Seat> seat;
   public double totalPrice;
    public Cart(){
    snackCart=new ArrayList<>();
    seat=new ArrayList<>(); 
    totalPrice=0;
    }
    
    public void buy(){
    snackCart.clear();
    seat.clear();
    }
    
    public void calculate_totalPrice()
    {
        totalPrice=0;
    for(Seat i:seat)
    {totalPrice=totalPrice+i.price;}
    
    for(Food i:snackCart)
    {totalPrice=totalPrice+i.getFoodPrice()*i.getAmountOfFood();
    }
    
    }
    public void display(){
    calculate_totalPrice();
    if(!snackCart.isEmpty())
    {System.out.println("Your snacks are:");
    for(Food i:snackCart)
    {System.out.println((snackCart.indexOf(i)+1)+"-"+i.toString());}}
    else System.out.println("You don't have any snacks");
    if(!seat.isEmpty())
    {System.out.println("Your tickets are:");
    for(Seat i:seat)
    {System.out.println((seat.indexOf(i)+1)+"-"+i);}}
    else System.out.println("You don't have any tickets");
    }
  

    
    public void addFood(Food o, int noOfSnack){
        
       if(snackCart.contains(o))
         {int i=snackCart.indexOf(o);
         int newAmount=snackCart.get(i).getAmountOfFood();
          snackCart.get(i).setAmountOfFood(newAmount+noOfSnack);
         }
        else     
        {  
        snackCart.add(o);
        snackCart.get(snackCart.size()-1).setAmountOfFood(noOfSnack);
        }
       
    }

  
   
    
}