package AllProgram;
import java.util.*;
public class NestedSwitchTask2 {
	

		public static void main(String[] args) {
		  Scanner scan =new Scanner(System.in);
		  System.out.println("Enter your actress name:\nSamantha\nNayanthara\nAndrea");
		  String actress=scan.nextLine();
		  switch(actress)
		  {
		  case "Samantha":
		   System.out.println("what combination you like you with samantha");
		   System.out.println("1.Vijay"+"2.Vikram"+"3.Surya");
		   System.out.println("Enter your actor name:");
		   String actor=scan.nextLine();
		   switch(actor)
		   {
		   case "Vijay":
		    System.out.println("1.Theri "+"2.Mesal "+" 3.Kaththi");
		    break;
		   case "Vikram":
		    System.out.println("1. Paththu Endrathukulla");
		    break;
		   case "Surya":
		    System.out.println("1.Anjan"+"2. Twenty Four(24)");
		    break;
		    default:
		     System.out.println(" pls enter Vijay, Vikram, and Surya");
		     
		   }
		   break;
		  case "Nayanthara":
		   System.out.println("what combination you like you with Nayanthara");
		   System.out.println("1.Vijay "+"2.Vijaysethupathi "+" 3.Surya");
		   System.out.println("Enter your actor name:");
		   String actor1=scan.nextLine();
		   switch(actor1)
		   {
		   case "Vijay":
		    System.out.println("1.Bigil"+"2.Villu");
		    break;
		   case "Vijaysethupathi":
		    System.out.println("1.Imaikka Nodigal"+"2.Jawan"+"3.Kaththuvakkula Rendu Kaathal"+"4. Nanum Rowdythan");
		   break;
		   case "Surya":
		    System.out.println("1.Gajini"+"2. Mass Engira Maasilamani"+"3. Aadhavan");
		    break;
		    default:
		     System.out.println(" pls enter Vijay, Vijaysethupathi, or Surya");

		   
		   }
		   break;
		  case "Andrea":
		   System.out.println("what combination you like you with Andriya");
		   System.out.println("1.Vijay "+"2.Karthi"+" 3.Dhanush");
		   System.out.println("Enter your actor name:");
		   String actor2=scan.nextLine();
		   switch(actor2)
		   {
		   case "Vijay":
		    System.out.println("1.Master");
		    break;
		   case "Karthi":
		    System.out.println("1.Ayirathil oruvan");
		    break;
		   case "Dhanush":
		    System.out.println("1.Vadachennai");
		    break;
		    default:
		     System.out.println(" pls enter Vijay , Karthi and Dhanush");
		 
		 }
		   break;
		 }
		 }

		}

