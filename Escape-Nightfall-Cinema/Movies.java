

package escape_nightfall_cinema;

import java.util.Scanner;
import java.util.*;


public class Movies { 
    private int movieID ;
    static int ID= 1000;
    private String movieName;
    public int ageRestriction;
    private String movieDuration;
    public String movieClassification;
    public double  price; 
    private double rating;
    private double showTiming;
    public final int NO_OF_SEATS=10;
    
    public Movies() 
    {   
       ID++;
  this.movieID=ID;
       this.movieName = null;
       this.ageRestriction = 0;
       this.movieDuration = null;
       this.movieClassification = null;
       this.price = 0.0; 
       this.rating = 0 ;
       this.showTiming= 0.0;
    }
  
    public Movies(String movieName,int ageRestriction,double price,String movieClassification,String movieDuration,double showTiming, double rating ){
        ID++;
       this.movieID=ID;
        this.movieName=movieName;
        if(ageRestriction >= 7 && ageRestriction < 100)
        {this.ageRestriction=ageRestriction;}
        else 
            System.out.println("Invalid age entry!");
        this.movieClassification=movieClassification;
        this.movieDuration=movieDuration;
        if(showTiming > 0 && showTiming <= 3)
        {this.showTiming=showTiming;}
        else 
            System.out.println("Invalid Show timing entry!");
        if (rating >= 0 && rating <= 10)
        { this.rating=rating;}
        else 
            System.out.println("Invalid rating entry!");
        
        if(price > 0)
        {this.price= price;}
        else 
            System.out.println("Invalid price entry!");
    }
    
    public String getMovieName() {
        return movieName;
    }
    
    public void setMovieName(String movieName)
    { 
        this.movieName = movieName;
    }
    
    public int getAllowedAge()
    {
        return ageRestriction ;
    }
    
    public void setAllowedAge(int ageRestriction)
    {
        if(ageRestriction >= 7 && ageRestriction < 100)
           this.ageRestriction = ageRestriction;
        
        else
        System.out.println("Invalid age"); 
    }
    
    public void setmovieID(int movieID)
    { 
        if(movieID > 1000)
        this.movieID = movieID;
        else
        {System.out.println("Invalid movie ID");}
    }
    
    public int getmovieID() {
        return movieID;
    }

    public void setMovieDuration( String movieDuration)
    {
         this.movieDuration = movieDuration;      
    }

    public String getMovieDuration()
    {
        return movieDuration;
    }
    public void setmovieClassification(String movieClassification)
    {
        this.movieClassification= movieClassification;
    }
    
    public String getmovieClassification()
    {
        return movieClassification;
    }
    public void setRating(double rating)
    {
        if (rating >= 0 && rating <= 10)
            this.rating = rating;
        else
        {System.out.println("Invalid entry of rating number");}
    }
    public double getRating()
    {
       return rating;
    }
    
    public void setShowTiming(double showTiming)
    {
    if(showTiming > 0 && showTiming <= 3)
    this.showTiming = showTiming;    
     
    else
    {System.out.println("Invalid entry of movie duration. Movie time should be from 1 hours to 3 hours"); }
    
   }
    public double getShowTiming( )
    {
        return showTiming;
    }
    
    public void setPrice(double price){
    if(price > 0)
    this.price =  price;    
    else
    {System.out.println("Invalid price"); }
    
   }

    @Override
     public String toString() {
        return "The information of the movie is " + " \n Movie ID = " + movieID + ", \n Movie Name=" + movieName + ", \n Age Restriction = " + ageRestriction + ", \n Movie Duration = " + movieDuration + ", \n movie Classification = " + movieClassification + ",\n Rating = " + rating + ", \n Show Timing=" + showTiming +", \n Price=" + price;
    }
     
        }
    


    
class Room  {
        Scanner input = new Scanner(System.in);
        
        Movies movie;
        public int roomNum;
        ArrayList<Seat> seats=new ArrayList<Seat>();

    public Room() {};

    public Room(int roomNum,String movieName,int ageRestriction,double price,String movieClassification,String movieDuration,double showTiming,                  double rating ) {
        movie=new Movies(movieName,ageRestriction,price,movieClassification,movieDuration,showTiming,rating);
        this.roomNum = roomNum;   
    }
    public Seat reserveSeat(){
    seats.add(new Seat(movie.price,movie.getMovieName()));
    return seats.get(seats.size()-1);
    }
    
    @Override
    public String toString(){
        
    return movie.toString()+ "Room Number is: "+roomNum+" Number of Seat : " +movie.NO_OF_SEATS;
        
    }
    
    
    
}

class Seat {
    static int ticketID=100;
    public int ticketcode;
    double price;
    String name;
   
    public Seat(double price,String name) {
        this.name=name;
        this.price=price;
        ticketcode=ticketID;
        ticketID++;
    }

    @Override
    public String toString()
    {
        return "Ticket Code: "+ticketcode+" Movie Name: "+name;
    }    
}