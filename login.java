package mentoring;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
public class login {
	
	private String firstName;
	private String lastName;
	private String eMail;
	private int mon;
	private static String uniqueId;     //static variable to increment the uniqueId variable value.
	private int id;
	public int i;

	public login() {
		//constructor
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first name");
		this.firstName=in.nextLine();                //this keyword-to refer the class instance variable.
		
		System.out.println("Enter last name");
		this.lastName=in.nextLine();
		
		
		System.out.println("Enter your Email");
		this.eMail=in.nextLine();
		
		System.out.println("Enter birthday date and month number");
		this.mon=in.nextInt();
		
		setId();
		System.out.println("User information-"+firstName+"  "+lastName+"  "+eMail+"  "+uniqueId);
		
	}
		private void setId()
		{
		  this.id=mon;   
		  id++;                                                                  
		  this.uniqueId=100+""+id;
		}
		public void file()
		{
			try
			{
				  FileWriter fw=new FileWriter("D:\\file java\\f1.txt",true);
				  BufferedWriter bw = new BufferedWriter(fw); 
				  bw.write("\n");
				  bw.write(firstName);                                       //File handling 
				  bw.write("  ");
				  bw.write(lastName);
				  bw.write("  ");
				  bw.write(eMail);
				  bw.write("  ");
				  bw.write(uniqueId);
				  bw.close();
			}catch(Exception e){System.out.println(e);}     
		
		}
		public void set_Info()                         //method info
		{
		Scanner in = new Scanner(System.in);
		System.out.println("\n"
		                   +"do you want to know the information about the courses and streams");
		System.out.println("if yes press 1" 
				+ "or else press any other number to proceed ahead");                        //Data Encapsulation
		this.i=in.nextInt();
		}
        public int get_Info()
       {
	    return i;}
 }
