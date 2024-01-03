///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package escape_nightfall_cinema;
//import java.util.Scanner;
//
//class Snacks {
//   public String snackName;
//   private int snackPrice;
//    boolean AvailableOfSnack;
//    private int Calories;
//    Snacks(){
//    
//    }
//
//    public Snacks(String snackName, int snackPrice, boolean AvailableOfSnack, int Calories) {
//        Scanner input=new Scanner(System.in);
//              
//            if (snackPrice>0) {
//                 this.snackPrice = snackPrice;
//            } else {
//                 this.snackPrice = Math.abs(snackPrice) ;
//            }
//            if (Calories>0) {
//                this.Calories = Calories;
//            } else {
//                this.Calories = Math.abs(Calories);
//            }
//        System.out.println("Colories and Snackprice assign successfully");
//        this.snackName = snackName;
//       
//        this.AvailableOfSnack = AvailableOfSnack;
//        
//    }
//
//    public int getSnackPrice() {
//        return snackPrice;
//    }
//
//    public void setSnackPrice(int snackPrice) {
//        this.snackPrice = snackPrice;
//    }
//
//    public int getCalories() {
//        return Calories;
//    }
//
//    public void setCalories(int Calories) {
//        this.Calories = Calories;
//    }
//    
//    
//    
//}
//class Drinks extends Snacks{
//public enum size{small, medium, large};
//size sizeOfDrinks;
//public Drinks()
//{}
//public Drinks(String snackName, int snackPrice, boolean AvailableOfSnack, int Calories,size sizeOfDrinks)
//{super(snackName,snackPrice,AvailableOfSnack,Calories);
//this.sizeOfDrinks=sizeOfDrinks;
//}
//    public size getSizeOfDrinks() {
//        return sizeOfDrinks;
//    }
//
//    public void setSizeOfDrinks(size sizeOfDrinks) {
//        this.sizeOfDrinks = sizeOfDrinks;
//    }
//}
//
//
//
//
//class Food extends Snacks{ private int weight;
//private int amountOfFood;
//String[] foodOption= new String[20];
//public Food(){}] foodO
//
//    public Food(int weight, int amountOfFood) {
//        this.weight = weight;
//        this.amountOfFood = amountOfFood;
//    }
//
//    public int getWeight() {
//        return this.weight;
//    }
//
//    public void setWeight(int weight) {
//        this.weight = weight;
//    }
//
//    public int getAmountOfFood() {
//        return this.amountOfFood;
//    }
//
//    public void setAmountOfFood(int amountOfFood) {
//        this.amountOfFood = amountOfFood;
//    }
//    
//
//}