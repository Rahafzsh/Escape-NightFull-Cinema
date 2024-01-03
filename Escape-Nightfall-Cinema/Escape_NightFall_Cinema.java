//Rahaf Zamil AL-Shammari (Leader)
//Muneera Yousef AlSaeed
//Fay AbdAlRhman AL-Shammari
//Maria Ali AlGhamdi 
//Majd Othman AlTukhis 
//Zainab Hussain 
package escape_nightfall_cinema;

import java.util.*;

public class Escape_NightFall_Cinema {

  static Scanner input=new Scanner(System.in);
  static ArrayList<Admin> AdminsList = new ArrayList<Admin>();
  static ArrayList<customer> CustomerList = new ArrayList<customer>();
  static ArrayList<Room> MoviesList=new ArrayList<Room>();
  static ArrayList<Food> FoodsList= new ArrayList<Food>();

public static void CustomerMain(int index){
   int menueChoice;
    do{ Customer_message();
           menueChoice=userInput();
           input.nextLine();
          switch(menueChoice)
          {
              case 1://Start of update personal information 
                  int choice2;
                    String numberFind;
                 System.out.print(">>Enter your phone number to update Account Information: ");
                 numberFind=input.next();
                if (CustomerList.get(index).getPhone().equals(numberFind)){
                 do{
                 System.out.println("#Enter the field you want to update: \n"
                         + "  1- Name \n   2- Age \n   3-Number \n   4- Email \n   5- Password \n 6- Exit" );
                     System.out.print(">>");
                 choice2=userInput();
                 input.nextLine();
                 switch(choice2){
                     case 1:
                        System.out.print(">>Enter updated Name: ");
                        CustomerList.get(index).name=input.nextLine();
                      break;
                      
                     case 2:
                        System.out.print(">>Enter updated Age: ");
                        CustomerList.get(index).setAge(input.nextInt());
                      break;
                      
                     case 3:
                        System.out.print(">>Enter updated Phone Number: ");
                        CustomerList.get(index).setPhone(input.next());
                      break; 
                      
                     case 4:
                        System.out.print(">>Enter updated Email: ");
                        CustomerList.get(index).setEmail(input.next());
                      break; 
                      
                     case 5:
                        System.out.print(">>Enter updated Password: ");
                        CustomerList.get(index).setPassword(input.next());
                      break; 
                      case 6:break;//exit                      
                     default: 
                    
                     System.out.print("Invalid entry! You must choose from the menu above.");
                      break;
                    } 
                }while(choice2!=6||choice2<=0||choice2>6);
                 System.out.println("Your Account Information has been updated successfully! \n"); 
                }
                else
               System.out.println("Your Account Information can't be updated due to incorrect entry of Phone Number. \n"); 
              
                break; //end of update personal information     
              case 2:
                  for (Room m: MoviesList){
                      System.out.println(m); System.out.println("*******************************");
                  }
            	break;

              case 3:
                  FoodMenu();
                  break;//view food

              case 4:cartMenue(index);break;//view cart

              case 5: //exit
               break;

              default:System.out.println("Invalid entry! Must choose from menu provided. ");

          }
    }while(menueChoice!=5);

}
public static void Customer_message(){

    System.out.println("***********WELCOME TO CUSTOMER CHOICE***********");

    System.out.println("1- Update Account Information ");

    System.out.println("2- View Movies ");

    System.out.println("3- View Food Items");

    System.out.println("4- Add to My Cart ");

    System.out.println("5- Sign Out ");

}

public static void FoodMenu(){
    int choice;
    
    for (choice= 0; choice < FoodsList.size(); choice++) {
        System.out.println(FoodsList.get(choice));   
    }
    System.out.println("Note: some varibles can be customized");
}
public static void editHot(int index,int indexOfSnack){
    System.out.println("How would you like the strength of your beverage? ");
    System.out.println("1-Strong");
    System.out.println("2-Medium");
    System.out.println("3-Weak");
    int choice=userInput();
    if(choice==1)
    ((Hot)CustomerList.get(index).myCart.snackCart.get(indexOfSnack)).setStrengthOfBeverage(Hot.strength.strong);
    else if(choice==2)
    ((Hot)CustomerList.get(index).myCart.snackCart.get(indexOfSnack)).setStrengthOfBeverage(Hot.strength.medium);
    else if(choice==3)
   ((Hot)CustomerList.get(index).myCart.snackCart.get(indexOfSnack)).setStrengthOfBeverage(Hot.strength.weak);
    else
        System.out.println("wrong Entery, default option was added");
    System.out.println("How would you like the sugar in your beverage? ");
    System.out.println("1-None");
    System.out.println("2-Medium");
    System.out.println("3-Sweet");
    choice=userInput();
    if(choice==1)
    ((Hot)CustomerList.get(index).myCart.snackCart.get(indexOfSnack)).setSugarLevel(Hot.sugar.none);
    else if(choice==2)
    ((Hot)CustomerList.get(index).myCart.snackCart.get(indexOfSnack)).setSugarLevel(Hot.sugar.medium);
    else if(choice==3)
   ((Hot)CustomerList.get(index).myCart.snackCart.get(indexOfSnack)).setSugarLevel(Hot.sugar.sweet);
    else
        System.out.println("wrong Entery, default option was added");
}
public static void editCold(int index,int indexOfSnack){
System.out.println("How would you like the ice in your beverage?");
    System.out.println("1-without ice");
    System.out.println("2-Normal");
    System.out.println("3-More ice");
    int choice=userInput();
    if(choice==1)
    ((Cold)CustomerList.get(index).myCart.snackCart.get(indexOfSnack)).setIceLevel(Cold.ice.no);
    else if(choice==2)
    ((Cold)CustomerList.get(index).myCart.snackCart.get(indexOfSnack)).setIceLevel(Cold.ice.average);
    else if(choice==3)
   ((Cold)CustomerList.get(index).myCart.snackCart.get(indexOfSnack)).setIceLevel(Cold.ice.more);
    else
        System.out.println("wrong Entery, default option was added");
}
public static void editPopCorn(int index,int indexOfSnack){
System.out.println("How would you like the flavor of your PopCorn?");
    System.out.println("1-Cheese");
    System.out.println("2-Caramel");
    System.out.println("3-Salt");
    int choice=userInput();
    if(choice==1)
    ((PopCorn)CustomerList.get(index).myCart.snackCart.get(indexOfSnack)).setFlavor(PopCorn.PopcornFlavors.Cheese);
    else if(choice==2)
    ((PopCorn)CustomerList.get(index).myCart.snackCart.get(indexOfSnack)).setFlavor(PopCorn.PopcornFlavors.Caramel);
    else if(choice==3)
   ((PopCorn)CustomerList.get(index).myCart.snackCart.get(indexOfSnack)).setFlavor(PopCorn.PopcornFlavors.Salted);
    else
        System.out.println("wrong Entery, default option was added");
}
public static void editNacheos(int index,int indexOfSnack){
    System.out.println("Would you like additinal toppings top your nachoes?");
    System.out.println("1-No");
    System.out.println("2-Yes, Jalapeno");
    System.out.println("3-Yes, Salsa");
    int choice=userInput();
    if(choice==1)
    ((Nacheos)CustomerList.get(index).myCart.snackCart.get( indexOfSnack)).setAddtopping(Nacheos.AdditionalToppings.None);
    else if(choice==2)
    ((Nacheos)CustomerList.get(index).myCart.snackCart.get( indexOfSnack)).setAddtopping(Nacheos.AdditionalToppings.Jalapeno);
    else if(choice==3)
   ((Nacheos)CustomerList.get(index).myCart.snackCart.get( indexOfSnack)).setAddtopping(Nacheos.AdditionalToppings.Salsa);
    else
        System.out.println("wrong Entery, default option was added");
}
public static void AddFood(int index){
    boolean found=false;
    int amountOfSnacks;
            
    FoodMenu();
    System.out.println("Which Snack would you like to pick?");
    input.nextLine();
    String name=input.nextLine();
    System.out.println("How many do you want to add?");
    amountOfSnacks=userInput();
            
    for(Food i:FoodsList){
      if(i.snackName.equalsIgnoreCase(name)){ 
        found=true;
         if(i.AvailableOfSnack)
            {  if(i.getAmountOfFood()>=amountOfSnacks)
                {i.setAmountOfFood(i.getAmountOfFood()-amountOfSnacks);
                 if(i instanceof Hot){
                    Food h=new Hot(((Hot) i).snackName,(i.getFoodPrice()),((Hot) i).AvailableOfSnack,i.getCalories(),((Hot) i).sizeOfFood,i.getAmountOfFood(),((Hot) i).strengthOfBeverage,((Hot) i).sugarLevel,((Hot) i).ml);
                    CustomerList.get(index).myCart.addFood(h, amountOfSnacks);
                    editHot(index,CustomerList.get(index).myCart.snackCart.size()-1);
                 }
                else if(i instanceof Cold){
                   Food c=new Cold(i.snackName,i.getFoodPrice(), i.AvailableOfSnack,i.getCalories(), i.sizeOfFood,i.getAmountOfFood(),((Cold) i).iceLevel,((Cold) i).ml); 
                   CustomerList.get(index).myCart.addFood(c, amountOfSnacks);
                    editCold(index,CustomerList.get(index).myCart.snackCart.size()-1);}
                else if(i instanceof PopCorn){
                    Food c=new PopCorn(i.snackName,i.getFoodPrice(),((PopCorn) i).AvailableOfSnack,i.getCalories(),((PopCorn) i).sizeOfFood,((PopCorn) i).weight,i.getAmountOfFood(),((PopCorn) i).flavor);
                   CustomerList.get(index).myCart.addFood(c, amountOfSnacks);
                    editPopCorn(index,CustomerList.get(index).myCart.snackCart.size()-1);
                }
                else if(i instanceof Nacheos){
                    Food c=new Nacheos(i.snackName,i.getFoodPrice(),i.AvailableOfSnack,i.getCalories(),i.sizeOfFood,((Nacheos) i).weight,i.getAmountOfFood(),((Nacheos) i).getAddtopping());
                   CustomerList.get(index).myCart.addFood(c, amountOfSnacks);
                    editNacheos(index,CustomerList.get(index).myCart.snackCart.size()-1);}
                }
                else
                      System.out.println("Amount of "+ i.snackName + " is less than amount you wanted");}
        else System.out.println("sorry, your selected snack is out of stock");
                }
            }
    if(!found)System.out.println("wrong entery, the snack you entered doesn't exist");
            }

public static  void  SignUp( ){
customer c=new customer(); 
    String name=null;
    boolean condition, correctAge;
    String phone_number=null;
    String Email=null;
    boolean distinctphone;
    boolean checkphone;
    int age=0;
   
    String password=null;
    do{
        correctAge=false;
        distinctphone=true;
        checkphone=false;
    System.out.print(">>Name : ");
    name=input.nextLine();
    System.out.print(">>Phone Number : ");
    phone_number=input.next();
    for(int i=0;i<CustomerList.size();i++)
    {
    if((CustomerList.get(i).getPhone().equals(phone_number))){
    	distinctphone=false;
    break;}
    
    	}if (phone_number.length()<=10)
         checkphone=true;
    System.out.print(">>Age : ");
    age=userInput();
    if(age>0)correctAge=true;
    System.out.print(">>Email : ");
    Email=input.next();
    System.out.print(">>Password :");
    password=input.next();
    input.nextLine();
    condition=c.checkValid(Email, password);
    if(condition &&correctAge&&distinctphone&&checkphone){
    CustomerList.add(new customer (name,age,phone_number,Email,password));
    }
    if(correctAge==false)System.out.println("Invalid age");
    if(distinctphone==false)System.out.println("Sorry, this Phone Number has been used, try another one.");
    if(checkphone==false)System.out.println("invalid phone Number make sure its A 10 digit Phone Number.");
    
}while(!condition || !correctAge||!distinctphone||!checkphone);
}

public static int SignIn(){

    System.out.print(">>Enter your Phone Number:");

    String phone=input.next();

    System.out.print(">>Enter your Password:");

       String pass=input.next();

    char choice;

    for(int i=0;i<CustomerList.size();i++){

       if(CustomerList.get(i).getPhone().compareTo(phone)==0)
        if(CustomerList.get(i).getPassword().compareTo(pass)==0)
         return i;

        else{

        System.out.println("Would you like to re-enter your Password? (yes or no): ");

        choice=input.next().charAt(0);

        if(choice=='n'||choice=='N')

            return -1;

        else if(choice=='y'||choice=='Y')

        {System.out.println("Re-enter your password:");

         pass=input.next();

          if(CustomerList.get(i).getPassword().compareTo(pass)==0)

              return i;
          else return -1;

        }}}

      System.out.println("Sorry your Phone Number isn't registered. Make sure to sign up. ");

       return -2;}//if return -2 then call signup if -1 so wrong pass if 0 or more then logged in

   public static boolean SignInAdmin()
   {
	   System.out.print(">>Enter your ID number:");

	    String id=input.next();

	    System.out.print(">>Enter your password:");

	       String pass=input.next();

	    char choice;

	    for(int i=0;i<AdminsList.size();i++)
	       {
	       if(AdminsList.get(i).getid().compareTo(id)==0)
	        if(AdminsList.get(i).getPassword().compareTo(pass)==0)
	         return true;

	        else{
	        System.out.println("Would you like to re-enter your Password?(yes or no)");
	        choice=input.next().charAt(0);
	        if(choice=='n'||choice=='N')
	            break;

	        else if(choice=='y'||choice=='Y')
	        {System.out.print(">>Re-enter your Password:");
	         pass=input.next();
	          if(AdminsList.get(i).getPassword().compareTo(pass)==0)
	        	 { System.out.println("Hello, Welcome Back "+ " "+ AdminsList.get(i).name);
	          return true;}
	        }
	        }
	       }
	           System.out.println("Sorry your ID number isn't registered. Make sure to register as a Customer ");
	    
            return false;
	       }


   public static void cartMenue(){

    System.out.println("1- Add Ticket");

    System.out.println("2- Add Food");

    System.out.println("3- Delete Element");

    System.out.println("4- Display Cart");

    System.out.println("5- Check Out");

    System.out.println("6- Exit from Cart Menu");}

  public static void cartMenue(int index){

    int choice;

    boolean f=true,found=false;

    do{

    cartMenue();

    choice=userInput();

    switch(choice){

        case 1:

            for(Room i: MoviesList)
             System.out.println(i.movie.getMovieName());
            System.out.println("Enter one of the Movies Names:");
            input.nextLine();
            String name=input.nextLine();
            for(int i=0;i<MoviesList.size();i++)
            {   found=false;
                if(MoviesList.get(i).movie.getMovieName().equalsIgnoreCase(name))
                {found=true;
                if(MoviesList.get(i).movie.ageRestriction<=CustomerList.get(index).getAge())
                {if(MoviesList.get(i).seats.size()<10)
                {Seat c=MoviesList.get(i).reserveSeat();
                    CustomerList.get(index).myCart.seat.add(c);
                double price=MoviesList.get(i).movie.price;
                System.out.println("Your seat is reserved \nPrice: "+price+" SR");
                }
                else System.out.println("All tickets of Movie "+MoviesList.get(i).movie.getMovieName()+" are reserved");
                }
                else System.out.println("your age doesn't allow you to watch this movie");
                break;
                }
            }
            if(found==false)System.out.println("Wrong entry, the movie you entered doesn't exist!");

            break;

        case 2:
            AddFood(index);
            break;

        case 3:int ID=DeleteItem(index);
        if(ID>0)
        {for(int c=0;c<MoviesList.size();c++)
            for(int s=0;s<MoviesList.get(c).seats.size();s++)
                {
                if(ID==MoviesList.get(c).seats.get(s).ticketcode)
                {MoviesList.get(c).seats.remove(s);
                System.out.println("found ,deleted succesfully");}
                }
        }
        break;

        case 4:
            if(CustomerList.get(index).myCart.snackCart.isEmpty()&&CustomerList.get(index).myCart.seat.isEmpty())
                System.out.println("Your cart is empty!");
            else{
            CustomerList.get(index).myCart.display();
            System.out.println("Your total price is: "+CustomerList.get(index).myCart.totalPrice);}
            break;

        case 5:
            CustomerList.get(index).noOfCustomerTickets+=CustomerList.get(index).myCart.seat.size();
            System.out.println(">>Number of Tickets: "+CustomerList.get(index).myCart.seat.size());
            CustomerList.get(index).myCart.totalPrice=CustomerList.get(index).discount(CustomerList.get(index).noOfCustomerTickets,CustomerList.get(index).myCart.totalPrice );
            CustomerList.get(index).myCart.buy();
            System.out.println(">>Your Total Price is: "+CustomerList.get(index).myCart.totalPrice);
            break;
            
        case 6:f=false; break;

        default:System.out.println("Invalid entry!");

    }

    }while(f);

  }

    public static void main(String[] args) {

    MoviesList.add(new Room(1,"Kung Fu Panda",7,30,"Comedy/Family","From 6 AM To 12 PM",2, 7.5 ));

    MoviesList.add(new Room(2,"THE EMPTY MAN",18,40 ,"Horror","From 8 PM To 2 AM",2, 8 ));

    MoviesList.add(new Room(3,"GREENLAND",15,35 ,"Action","From 2 PM To 9 PM",2, 10 ));

    MoviesList.add(new Room(4,"COME PLAY",15,35 ,"Drama/mystery","From 2 PM To 9 PM",2, 8 ));

    MoviesList.add(new Room(1,"COME AWAY",12,30 ,"Fantasy/ Drama","From 6 AM To 12 PM",2, 6.2 ));

    AdminsList.add (new Admin( "A","Ahmed Sami", "1234567890", "Ahmed@gmail.com", "Aa123456"));

    AdminsList.add(new Admin( "AAeq2","Fatima Abdullah", "0765432678", "Fatima@gmail.com", "Bb1234432"));

    FoodsList.add(new PopCorn("PopCorn", 20, true,90, Food.size.small, 200,10, PopCorn.PopcornFlavors.Salted));
    
    FoodsList.add(new Nacheos("Nacheos", 25, true, 150, Food.size.small, 150, 10,Nacheos.AdditionalToppings.None ));
    FoodsList.add(new Hot("tea",5,true,1,Hot.size.small,5,Hot.strength.medium,Hot.sugar.medium,250));
    FoodsList.add(new Hot("decaffeinated Coffee",10,true,5,Hot.size.small,5,Hot.strength.medium,Hot.sugar.none,250));
    FoodsList.add(new Hot("coffee",10,true,1,Hot.size.small,5,Hot.strength.medium,Hot.sugar.none,250));
    FoodsList.add(new Cold("Iced coffee",15,true,1,Cold.size.small,5,Cold.ice.average,200));
    FoodsList.add(new Cold("Iced latte",18,true,75,Cold.size.small,5,Cold.ice.average,200));
    FoodsList.add(new Cold("Iced tea",4,true,75,Cold.size.small,5,Cold.ice.average,200));
    FoodsList.add(new Cold("Soda",7,true,125,Cold.size.small,5,Cold.ice.average,200));
    CustomerList.add(new customer("Lolo",7,"1234554321","lolo111@gmail.com","Ll123456"));
    //end of declaration
         char choice;
         do {
         int index;
             System.out.println("****************WELCOME TO ESCAPE NIGHTFALL CINEMA****************");
         System.out.println("Are You an Admin Or a Customer? \n C. for customer \n A. for admin \n E. to exit the system");
             System.out.print(">>Enter your choice :");
       choice=input.next().charAt(0);

        if(choice =='C' || choice=='c')

          do{
              {System.out.println(">>Do you have an account? (please enter yes or no)");
          choice=input.next().charAt(0);
           input.nextLine();
          if(choice =='Y' || choice=='y')
           {
               index=SignIn();
            if(index==-2){
            input.nextLine();
            SignUp();
            index=CustomerList.size()-1;
           CustomerMain(index);}
            else if(index==-1)System.out.println("Goodbye!");
            else CustomerMain(index);
           break;}
          else if(choice =='N' || choice=='n')
           {
            SignUp();
           index=CustomerList.size()-1;
          
           CustomerMain(index);
           break;}
          
          else System.out.println("wrong entry, please enter Yes or No");
          
          }}while(choice!='y'||choice!='Y'||choice!='n'||choice!='N');

        else if( choice=='A' || choice=='a' )
           AdminMain();
        else if(choice=='e'||choice=='E')
        {System.out.println("Thank you for choosing Escape Nightfall Cinema. Hope you come again! ");
            break;}
        else 
            System.out.println("Invalid entry! ");
        
    } while (choice!='c'||choice!='C'||choice!='a'||choice!='A');
       
}


    public static void Admin_message(){
	    System.out.println("***********WELCOME TO ADMIN CHOICE***********");
	    System.out.println("1- Add Movie ");
	    System.out.println("2- Update Movie ");
	    System.out.println("3- Delete Movie ");
	    System.out.println("4- Delete Customer Account ");
	    System.out.println("5- Update Personal Information "); 
	    System.out.println("6- Update Food Items ");
	    System.out.println("7- Show Movies List");
	    System.out.println("8- Sign Out");

	}
public static void AdminMain()
    {
    boolean t=false;
   if(SignInAdmin()==true)
     {int choice1;
       do { 
        Admin_message();
        	
        Admin a = new Admin ();
        System.out.print(">>Enter your choice number: ");
        choice1=userInput(); 
        input.nextLine();
        int movieId =0;
        String movieName;
        int ageRestriction;
        String movieDuration;
        String movieClassification;
        double  price ; 
        double rating  ;
        double showTiming;
        String phonenumber=null;
        int roomNumber;
       int choice2;
          		    
        switch (choice1)
            {
            case 1:
            		     
            System.out.print(">>Enter Movie name: ");
	    movieName=input.nextLine();
            System.out.print(">>Enter Age Restriction: ");
            ageRestriction=userInput();
            input.nextLine();
            System.out.print(">>Enter Movie Duration (Enter from 1 PM To 12 AM) ");
            movieDuration=input.nextLine();
            System.out.print(">>Enter Movie Classifiction: ");
            movieClassification=input.nextLine();
            System.out.print(">>Enter Movie Price: ");
            price=userdouble( );
               
            System.out.print(">>Enter Movie Rating:");
            rating=userdouble( );
            input.nextLine();
            System.out.print(">>Enter Movie Show Timing: (from 1 to 3 hours)");
            showTiming=userdouble( );
            System.out.print(">>Enter Movie Room number: ");
            roomNumber=userInput();
             if(ageRestriction<100 && ageRestriction>=7 && price>0 && rating>0 && rating<=10 && showTiming>=1 && showTiming<=3){
                a.addMovie(MoviesList,roomNumber, movieName, ageRestriction, price, movieClassification, movieDuration, showTiming, rating);
            	System.out.println("Movie has been added successfully! \n");
                }
             else
                System.out.println("Invalid entry. Try adding movie again.");
            		      
            break;
            case 2: 
            int moviepickd;
            			
            System.out.println(">>Enter The Movie ID you want to update:");
            moviepickd=userInput();
            int i=0;
            input.nextLine();
            t=false;
            for (int index=0 ;index< MoviesList.size();index++)			
             if (MoviesList.get(index).movie.getmovieID()==moviepickd) {
              t=true;
              i=index;}
             if(t==true){
             do {
            				
            	System.out.println("Choose the field you want to update: \n 1- To Update Movie ID \n 2- To Update Movie Name \n 3- To Update Age restriction \n 4- To Update Movie clasification \n 5- To Update Movie price \n 6- To Update Movie Rating \n 7- To Update movie Duration \n 8- To Update Movie Show Timing \n 9-Exit\n "	);
            	System.out.print("your choice\n\n >>");
                choice2=userInput();
            	input.nextLine();
            	 switch (choice2) {
                case 1:
            	   System.out.print(">>Enter the Movie ID you want to update: ");
            		        
            	   MoviesList.get(i).movie.setmovieID(userInput());
            	  break;
            	case 2:
            	  System.out.print(">>Enter updated Movie Name: ");
            	  MoviesList.get(i).movie.setMovieName(input.nextLine());
            	break;
            	case 3:
            	 System.out.print(">>Enter updated Age Restriction: ");
            	 MoviesList.get(i).movie.setAllowedAge(userInput());
            	break;
            	
            	case 4:
            	  System.out.print(">>Enter updated Movie Classification:");
            	  MoviesList.get(i).movie.setmovieClassification(input.nextLine());
            	break;
            	case 5 :
            	 System.out.print(">>Enter updated Movie price:");
            	 MoviesList.get(i).movie.setPrice(userdouble( ));
            	break;
            	case 6:
            	 System.out.print(">>Enter updated Movie Rating:");
            	 MoviesList.get(i).movie.setRating(userdouble( ));
            	break;
                case 7:
            	 System.out.print(">> Enter updated Movie Duration: ");
                 System.out.print("(the time should be entered from 1 AM to 12 PM)");
                 MoviesList.get(i).movie.setMovieDuration(input.nextLine());
            	break;
            	case 8 :
            	 System.out.print(">>Enter updated Movie Show Timing:");
            	 MoviesList.get(i).movie.setShowTiming(userdouble( ));
            	break;
                case 9:break;
            	default:System.out.println("invalid entry. You must choose number from the given list.\n"); }
            			 
               } while (choice2!=9||choice2<0||choice2>9);
            System.out.println("Movie has been updated successfully \n");
            	}
            				
            	else 
            	 System.out.println("Your account information can't be updated due to incorrect entry of Movie ID. \n");
            				
            			
            break;
            case 3:
            			
            	System.out.print(">>Enter the Movie ID you want to delete");
            	movieId=userInput();
            	a.deleteMovie(MoviesList,movieId) ;
            	System.out.println("Movie deleted successfully \n"); 
            			
            break;
            			
            case 4 :
            	boolean found=false;
            	System.out.print(">>Enter the customer's Phone Number: ");
            	phonenumber=input.next();
                    for(int counter=0;counter<CustomerList.size();counter++)
                        if(CustomerList.get(counter).getPhone().equals(phonenumber))
                            {a.deleteCustmer(CustomerList,phonenumber);
            	             System.out.println("Customer has been deleted successfully \n"); 
            		     System.out.println(CustomerList);
                             found=true;
                             break;}
                if(!found)System.out.println("there is no customer with "+phonenumber+" phone number");
            break;
            case 5 :
                String ID;
            	System.out.print(">>Enter Your ID number: ");
            	ID=input.next();
                int index=0;
            	for (int index2=0;index2<AdminsList.size();index2++)
            	    if (AdminsList.get(index2).getid().equals(ID))
            		{ t=true;
            		index=index2;}
            	if (t==true) {
            	 do{
            	    System.out.println("************UPDATE OPTIONS************ \n"+ "  1- Name \n     2-Number \n   3- Email \n   4- Password \n 5- Exit\n" );
                    System.out.print(">>Enter your choice number :");
            	    choice2=userInput();
            	    input.nextLine();
            	    switch(choice2){
            		case 1:
            	         System.out.print(">>Enter updated Name: ");
            	         AdminsList.get(index).name=input.nextLine();
            		break;
            			                      
            		case 2:
            		 System.out.print(">>Enter updated Phone Number: ");
            		 AdminsList.get(index).setPhone(input.next());
            		break; 
            			                      
            		case 3:
            		 System.out.print(">>Enter updated Email: ");
            		 AdminsList.get(index).setEmail(input.next());
            		break; 
            			                      
            		case 4:
            		 System.out.print(">>Enter updated Password: ");
            		 AdminsList.get(index).setPassword(input.next());
            		break; 
                        case 5:break;
            			                                            
            		default: 
            		 System.out.print("Invalid entry. You must choose from the menu above.");
            	}      
            			                 
            }while(choice2!=5||choice2<0&&choice2>5);
         System.out.println("Your account information has been updated successfully! \n");   			                   
         System.out.println(AdminsList.get(index));
         }
         else 
         System.out.println("Your account information can't be updated due to incorrect entry of phone number. \n");
            			 
        break;
            			
        case 6:editFood();break;
            			  			
        case 7:System.out.println(MoviesList);break;
            			
        case 8:break;
            		
        default : System.out.println("Incorrect number!");
        }	
            }   while (choice1!=8);
            	
        }
       
    }
   

    
    public static void editFood(){
        int choice,priceOrCal;char f;
        boolean found=false;
        FoodMenu();
        System.out.println("Enter name of snack to update it:");
        String food=input.nextLine();
        for(Food i:FoodsList)
        if(i.snackName.equalsIgnoreCase(food))
        {found=true;
         System.out.println("Enter number of operation:");
         System.out.println("1-Avilability of snack");
         System.out.println("2-Snack price");
         System.out.println("3-Snack calories");
        choice=userInput();
        input.nextLine();
        switch(choice){
            case 1:
            System.out.println("is "+i.snackName+" available?");
            f=input.next().charAt(0);
            if(f=='y'||f=='Y')
            {i.AvailableOfSnack=true;
            i.setAmountOfFood(10);
            }
            else if(f=='n'||f=='N')
            {i.AvailableOfSnack=false;
            i.setAmountOfFood(0);}
            else
            System.out.println("Invalid entry! Sorry but nothing has been changed");   
                break;
            case 2:
            System.out.println("What is the new price of "+i.snackName+" ?");
            priceOrCal=userInput();
            i.setFoodPrice(priceOrCal);
                break;
            case 3:
            System.out.println("What is the new calories of "+i.snackName+" ?");
            priceOrCal=userInput();
            i.setCalories(priceOrCal);
                break;
            default:System.out.println("Invalid entry!");
        }
        }
    if(!found)System.out.println("Sorry, wrong entry");
        }
    public static int userInput( ){
      boolean isNumber; 
      int num = 0;
   do {
   
   if (input.hasNextInt()){
       num=input.nextInt();
    isNumber=true;
   }
      
   
   else {
       isNumber=false;
       System.out.println("\n\t \t INVALID ENTRY");
       input.next();
   }
           
       
   }
       while(!isNumber);
   
   return num;}
     public static double userdouble( ){
      boolean isNumber; 
      double num = 0;
   do {
   
   if (input.hasNextDouble()){
       num=input.nextDouble();
    isNumber=true;
   }
      
   
   else {
       isNumber=false;
       System.out.println("\n\t \t INVALID ENTRY");
       input.next();
   }
           
       
   }
       while(!isNumber);
   
   return num;}
     //a is for index 4 c list
     //i if 4 food list
     //q for quantity
     public static int DeleteItem(int a){
         int i,choice,q;
         int ID=0;
         System.out.println("Would you like to delete from ticket or snacks?(1 for snacks, 2 for ticket)");
         choice=userInput();
         if (choice==1&&CustomerList.get(a).myCart.snackCart.isEmpty()==false) {
              for ( i = 0; i < CustomerList.get(a).myCart.snackCart.size(); i++) {
          System.out.println("Index = "+ i+ CustomerList.get(a).myCart.snackCart.get(i));}
              do{
           System.out.println("Enter index of snack you want to delete :");
      i=userInput();  
              }while(i<0||i>CustomerList.get(a).myCart.snackCart.size());
             System.out.println(">>Enter quantity :");
             q=userInput();
             String nameofchoosedsnack=CustomerList.get(a).myCart.snackCart.get(i).snackName;
             if(q==CustomerList.get(a).myCart.snackCart.get(i).getAmountOfFood()){
     // FoodsList.get(i).setAmountOfFood(choice);
                 CustomerList.get(a).myCart.snackCart.remove(i);
                 for(Food f: FoodsList){
       if(f.snackName.equals(nameofchoosedsnack))
           f.setAmountOfFood(f.getAmountOfFood()+q);}
             }
             else if(q<CustomerList.get(a).myCart.snackCart.get(i).getAmountOfFood()&&q>0){
               CustomerList.get(a).myCart.snackCart.get(i).setAmountOfFood(CustomerList.get(a).myCart.snackCart.get(i).getAmountOfFood()-q);  
             for(Food f: FoodsList){
       if(f.snackName.equals(nameofchoosedsnack))
           f.setAmountOfFood(f.getAmountOfFood()+q);}
             }
             else
                 System.out.println("Sorry, the quantity you entered is greater than what you have");
         }
         else if(choice==2&&CustomerList.get(a).myCart.seat.isEmpty()==false)
         {for ( i = 0; i < CustomerList.get(a).myCart.seat.size(); i++) {
            System.out.println("Index = "+ i+ CustomerList.get(a).myCart.seat.get(i));
        }
        System.out.println("Enter index of ticket you want to delete :");
        i=input.nextInt();
        ID=CustomerList.get(a).myCart.seat.get(i).ticketcode;
        CustomerList.get(a).myCart.seat.remove(i);
        System.out.println("ID="+ID);
        System.out.println("After deleting :");
        for (int j = 0; j < CustomerList.get(a).myCart.seat.size(); j++) {
            System.out.println(CustomerList.get(a).myCart.seat.get(j));}
        }
        else if(CustomerList.get(a).myCart.seat.isEmpty()==true ){
             System.out.println("You didn't add A Ticket in your cart ");}
        else if (CustomerList.get(a).myCart.snackCart.isEmpty()==true )
             System.out.println("You didn't add A Snack in your cart ");
        else if(choice!=1 && choice!=2 ) {ID=-2;System.out.println("Wrong entry!");}
        
    CustomerList.get(a).myCart.calculate_totalPrice();
     
     
     
     return ID;
     }
    
    
}