/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escape_nightfall_cinema;
import java.util.*;

public class users{

public String name;
private String phone_Number;
private String email, password;

    public users(){
        this.name = null;
        this.phone_Number = null;
        this.email = null;
        this.password = null;
    }
public users(String userName, String userNumber, String userEmail, String userPass){

    this.name=userName;
    this.phone_Number=userNumber;
    this.email=userEmail;
    this.password=userPass;
         
}
       
       public void setPhone(String phone){
            if (phone.length()==10)
               this.phone_Number=phone;
             else
                 System.out.println("Invalid phone number entry!");                      
       }
 
 public void setEmail(String em){
           boolean dotFlag=false, atFlag=false;
           char ch;
           for (int i = 0; i < em.length(); i++) {
               ch=em.charAt(i);
            if (ch == '@') {
                atFlag = true;
            }
            if (ch == '.') {
                dotFlag = true;
            }
            }
          
            if (dotFlag && atFlag)
                this.email=em;
            
        else {System.out.println("Invalid Email entry! must include (@ and . )");
                }
       }
       
       public void setPassword(String pass){
           boolean lowerCaseFlag=false,capitalFlag=false,numberFlag=false;
           char ch;
           for (int i = 0; i < pass.length(); i++) {
            ch = pass.charAt(i);
            if (Character.isDigit(ch)) {
                numberFlag = true;
            }
            if (Character.isUpperCase(ch)) {
                capitalFlag = true;
            }
            if (Character.isLowerCase(ch)) {
                lowerCaseFlag = true;
            }
           }
             if(lowerCaseFlag && capitalFlag &&numberFlag)
                 this.password=pass;
            
                 else 
                 System.out.println("Invalid password  entry! must include (capital letter-small-letter-number)");
             }
       public String getPhone(){
           return phone_Number;}
       
       public String getEmail(){
           return email;}
       
       public String getPassword(){
           return password;}

// Function for checking validity of password and email. it will only be valid when both include all their seperate requirements.       
    public boolean checkValid(String email, String password) {
        char ch;
        boolean capitalFlag = false;
        boolean lowerCaseFlag = false;
        boolean numberFlag = false;
        boolean atFlag = false;
        boolean dotFlag = false;
       
       
       // boolean check=false;
 
          //checking if email(contains @, .)
          
           for (int i = 0; i < email.length(); i++) {
        
               ch=email.charAt(i);
            if (ch == '@') {
                atFlag = true;
            }
            if (ch == '.') {
                dotFlag = true;
            }
            
            }
           
          // checking if pass (contains digit,uppercase, lowercase)
        
        for (int i = 0; i < password.length(); i++) {
            ch = password.charAt(i);
            if (Character.isDigit(ch)) {
                numberFlag = true;
            }
            if (Character.isUpperCase(ch)) {
                capitalFlag = true;
            }
            if (Character.isLowerCase(ch)) {
                lowerCaseFlag = true;
            }
            }
            
          //checking if number (contains 8 digits)
          
         
    
      if (numberFlag && capitalFlag && lowerCaseFlag && atFlag && dotFlag ) {
   
                return true;
      }
      else{
        System.out.print("Password, Email. Are not Valid\n Make sure to "
                + "include: \n At least one of each (capital letter,  small letter,"
                + " a digit.) in Password. \nA( @ , . ) in Email. \n " );    
      return false;}
      //return check;
    }
    
}         

class customer extends users{
   
    public int noOfCustomerTickets=0;
    private int age;
    Cart myCart;

    public customer(){}
    public customer(String userName, int userAge, String userNumber, String userEmail, String userPass) {
     super(userName, userNumber, userEmail, userPass);
        this.age=userAge;
        myCart=new Cart();
        }
    
	@Override
	
	public  String toString ()
	{
		return "Customer Name: " + name + "\n Age " + getAge() + "\n Phone number " + getPhone() + "\n Email" +getEmail(); 
	}
        
// discount function: if tickets bought are more than 3, a 10% discount will be applied. 
    public double discount(int noOfTickets, double total){
    if(noOfTickets>3){
        double afterDiscount;
        System.out.println("Discount of 10% is applied because total of tickets exceeds 3 \ntotal after discount of 10%: ");
        afterDiscount=(total*.90);
        return afterDiscount;    
     }
    else System.out.println("No discount is applied because total of tickets doesn't exceed 3 \n total stays, ");
     return total;}

public void setAge(int a){
  if(a>0)
   this.age=a;
  else 
  System.out.println("Invalid entry! \nAge must be a positive number"); 

    }
public int getAge(){
    return age;}
}


class  Admin extends users {
	private String ID;
	
	public Admin(){}
	
	public Admin (String id, String name, String phonenumber , String Email , String Password)	
	{
		super(name, phonenumber, Email, Password);
		this.ID=id;	
	}
        
	public String getid()
	{
		return ID;
	}

	@Override
	
	public  String toString ()
	{
		return "Admin ID " + getid() + "\n Admin name  " + name + " \n Phone number " + getPhone() + "\n Email" +getEmail(); 
	}
    public boolean deleteMovie(ArrayList <Room> a,int  mID)
	{
		int i;
		for (i=0;i<a.size();i++) 
		if (a.get(i).movie.getmovieID()==mID)
		{
			a.remove(i);
			return true;	
		}

	return false;
}
   

	public void addMovie(ArrayList <Room> a,int roomnum,String movieName,int ageRestriction,double price,String movieClassification,String movieDuration,double  showTiming, double rating ) {
		
		a.add( new Room( roomnum,movieName, ageRestriction, price, movieClassification, movieDuration,showTiming,  rating ));
	}
	
    public boolean deleteCustmer(ArrayList<customer> a,String phonenumber)
	{
		int i;
		for (i=0;i<a.size();i++) 
		if (a.get(i).getPhone().equals(phonenumber)) 
		{
		a.remove(i);	
			return true;	
		}
	return false;
 }

}


