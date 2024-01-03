
package escape_nightfall_cinema;
import java.util.Scanner;
public abstract class  Food {
   public String snackName;
   private double snackPrice;
    public boolean AvailableOfSnack;
    private int Calories;
    public enum size{small, medium, large};
    size sizeOfFood;
    private int amountOfFood;
    Food(){
        snackName=null;
        snackPrice=0;
        AvailableOfSnack=false;
        Calories=0;
        sizeOfFood=size.small;
        amountOfFood=0;
    
    }

    public Food(String snackName, double snackPrice, boolean AvailableOfSnack, int Calories,size sizeOfFood,int amount) {
        this.snackName = snackName;
      this.AvailableOfSnack = AvailableOfSnack;
      this.sizeOfFood=sizeOfFood;
              if(snackPrice<0)
                throw new IllegalArgumentException("Sorry, Price cannot be negative.");
              this.snackPrice = snackPrice;
               if (Calories<0)
                   throw new IllegalArgumentException("Sorry, Calories cannot be negative.");
               this.Calories = Calories;
               if (amount<0) 
                    throw new IllegalArgumentException("Sorry, Quantity cannot be negative.");
               else
                   this.amountOfFood = amount;
        
    }
    public double getFoodPrice() {
        return snackPrice;
    }

    public void setFoodPrice(double snackPrice) {

        if(snackPrice>0)
       this.snackPrice = snackPrice;
      else
       System.out.println("Sorry price can't be negative");
       
    }

    public int getCalories() {
        return Calories;
    }

    public void setCalories(int Calories) {
        
      if(Calories>0)
        this.Calories = Calories;
        else
        System.out.println("Sorry calories can't be negative");
       
    }

    public void setAmountOfFood(int amount) {
        if(amount==0)
        {AvailableOfSnack=false; 
         this.amountOfFood = amount;}
        else if(amount>0) 
             this.amountOfFood = amount;
        else
            System.out.println("Sorry Quantity cannot be negative");
    }

    public int getAmountOfFood() {
        return amountOfFood;
    }
    

    @Override
    public String toString() {
        return  "Snack Name= " + snackName + ", Price= " + snackPrice + ", Calories= " + Calories + "\n"+"Availibility ="+AvailableOfSnack+ " Size Of Drinks= " +sizeOfFood+"\nQuantity= "+amountOfFood;
    } 
    
}

class Drinks extends Food{
int ml;

public Drinks(String snackName, double snackPrice, boolean AvailableOfSnack, int Calories,size sizeOfDrinks,int amount,int ml)
{super(snackName,snackPrice,AvailableOfSnack,Calories,sizeOfDrinks,amount);
if(ml<0)
throw new IllegalArgumentException("Sorry, ML cannot be negative");   
else this.ml=ml;
}

public Drinks()
{super();
ml=0;}
 

    @Override
    public String toString() {
        return super.toString()+" ml=" + ml;
    }
  
}

class Hot extends Drinks
{
protected enum strength{strong,medium,weak};
protected enum sugar{none,medium,sweet};
strength strengthOfBeverage;
sugar sugarLevel;
public Hot(String snackName, double snackPrice, boolean AvailableOfSnack, int Calories,size sizeOfDrinks,int amount,strength s,sugar g,int ml){
super(snackName,snackPrice,AvailableOfSnack,Calories,sizeOfDrinks,amount,ml);
strengthOfBeverage=s;
sugarLevel=g;
}
public Hot()
{super();strengthOfBeverage=strength.weak;sugarLevel=sugar.none;}

    public strength getStrengthOfBeverage() {
        return strengthOfBeverage;
    }

    public void setStrengthOfBeverage(strength strengthOfBeverage) {
        this.strengthOfBeverage = strengthOfBeverage;
    }

    public sugar getSugarLevel() {
        return sugarLevel;
    }

    public void setSugarLevel(sugar sugarLevel) {
        this.sugarLevel = sugarLevel;
    }

    @Override
    public String toString() {
        return super.toString()+ "Strength Of Beverage could be " +strengthOfBeverage + "\nSugar Level could be" + sugar.sweet+" or "+sugar.medium+" or "+sugar.none +'\n';
    }
    
}



class Cold extends Drinks{
    protected enum ice{no,average,more};
    ice iceLevel;
    public Cold(String snackName, double snackPrice, boolean AvailableOfSnack, int Calories,size sizeOfDrinks,int amount,ice i,int ml)
    {super(snackName,snackPrice,AvailableOfSnack,Calories,sizeOfDrinks,amount,ml);
    iceLevel=i;
    }
     public Cold()
     {super();iceLevel=ice.average;}

    public ice getIceLevel() {
        return iceLevel;
    }

    public void setIceLevel(ice iceLevel) {
        this.iceLevel = iceLevel;
    }

    @Override
    public String toString() {
        return super.toString()+ " Ice Level = " +iceLevel+"\n" ;
    }

}



class Snacks extends Food{
    double weight;

public Snacks(){
    super();
this.weight=0;

}

    public Snacks(String snackName, double snackPrice, boolean AvailableOfSnack, int Calories,size sizeOfDrinks,double weight, int amountOfFood) { 
       super(snackName, snackPrice, AvailableOfSnack, Calories,sizeOfDrinks,amountOfFood);
       if(weight<0)
        throw new IllegalArgumentException("Sorry, Weight of snack cannot be negative");   
       else this.weight = weight;

    }
    

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() +" Weight= " + weight;
    }
    

}
class PopCorn extends Snacks{
    public enum PopcornFlavors{Cheese,Caramel,Salted }
    PopcornFlavors flavor;

    public PopCorn() {
        this.flavor=PopcornFlavors.Salted;
    }

    public PopCorn (String snackName, double snackPrice, boolean AvailableOfSnack, int Calories,size sizeOfDrinks,double weight, int amountOfFood,PopcornFlavors flavor) {
        super(snackName, snackPrice, AvailableOfSnack, Calories,sizeOfDrinks, weight,  amountOfFood);
        this.flavor = flavor;
    }


    public PopcornFlavors getFlavor() {
        return flavor;
    }

    public void setFlavor(PopcornFlavors flavor) {
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return super.toString()+" Flavor= " + flavor+"\n";
    }
    
    

}
class Nacheos extends Snacks{
public enum AdditionalToppings{None,Jalapeno, Salsa }
AdditionalToppings addtopping;

    public Nacheos() {
        super();this.addtopping=AdditionalToppings.None;
    }


    public Nacheos(String snackName, double snackPrice, boolean AvailableOfSnack, int Calories,size sizeOfDrinks,double weight, int amountOfFood,AdditionalToppings addtopping) {
       super(snackName, snackPrice, AvailableOfSnack, Calories,sizeOfDrinks, weight,  amountOfFood);
        this.addtopping = addtopping;
    }

    

    public AdditionalToppings getAddtopping() {
        return addtopping;
    }

    public void setAddtopping(AdditionalToppings addtopping) {
        this.addtopping = addtopping;
    }

    @Override
    public String toString() {
        return super.toString()+ "Toppings= "+ addtopping +"\n";
    }

}