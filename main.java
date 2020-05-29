package mentoring;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class main {

	public static void main(String[] args) {
		//object creation
		int ant=0;
		login obj=new login(); 
		obj.file(); 
		obj.set_Info();
		Scanner in = new Scanner(System.in);
		int t=obj.get_Info();
		if(t==1)
		{
		course d=new streams();
		d.draw();
		//run time polymorphism-parent class reference variable is used to refer child class object.
		//an overridden method is called through the reference variable of a superclass.
		do
		{
			 System.out.println("Choose the stream -information "
					 + "\n"
					 + "1- Science"
					 + "\n"
					 + "2- Commerce"
					 + "\n"
					 + "3- Arts"
					 + "\n"
					 +  "4- Professional courses");
			
			 System.out.println("choose option");
				int k=in.nextInt();	
			 switch(k) {
			 case 1:	streams c=new science();
		                c.draw();
		                break;
			 case 2:	streams b=new commerce();
		                b.draw();
		                break;
			 case 3:   streams a=new arts();
		               a.draw();
		               break;
			 case 4:   streams s=new extras();
		               s.draw();
		               break;
		     default:  System.out.print("Wrong option");       
			           break;}
			       
			 System.out.println("\n"
					+"Do you want to know information of more streams- if yes press 1");
			 ant=in.nextInt();}
			while(ant==1);
	    }
        guidance r=new guidance();
	    r.start();
		}
	}

