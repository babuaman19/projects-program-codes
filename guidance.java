package mentoring;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
public class guidance extends Thread{                  //Thread class
	public void run() {
		System.out.println("For further assistance and guidance,a counsellor will be appointed for you");
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your mobile number");
		String j=in.nextLine();
		System.out.println("Choose locality in Bangalore");
		System.out.println("1.HSR Layout "
				+ "2.Kormangala "
				+ "3.Mahadevpura "
				+ "4.Basavangudi"
				+ " 5.Indira Nagar"
				+ " 6.Kengeri");
		System.out.print("choose option");
		int k=in.nextInt();	
		switch(k)
		{

		case 1:String s="Aman Dubey";
               String l="9876450932";
               System.out.println("Mr" +s+" is appointed as a mentor for you");
               System.out.println("The counsellor will get in touch with you within 24 hrs");
               System.out.println("contact info-"+l);
               try
   			{
   				  FileWriter fw=new FileWriter("D:\\file java\\f1.txt",true);                      //file handling
   				  BufferedWriter bw = new BufferedWriter(fw);                                      //appending the file
   			      bw.write("  ");
   				  bw.write(j);
   				  bw.write("  ");
   				  bw.write(s);                                                       //try and catch block for handling exception
   				  bw.close();
			}catch(Exception e){System.out.println(e);}    
             break;
		case 2:String s1="Kirti Sharma";
	           String l1="8076454932";
	           System.out.println("Mrs " +s1+" is appointed as a mentor for you");
	           System.out.println("The counsellor will get in touch with you within 24 hrs");
	           System.out.println("contact info-"+l1);
	           try
	   			{
	   				  FileWriter fw=new FileWriter("D:\\file java\\f1.txt",true);
	   				BufferedWriter bw = new BufferedWriter(fw); 
	   			      bw.write("  ");
	   				  bw.write(j);
	   				  bw.write("  ");
	   				  bw.write(s1);
	   				  bw.close();
				}catch(Exception e){System.out.println(e);} 
	             break;
		case 3:String s2="Rohith Singh";
               String l2="9878950932";
               System.out.println("Mr "+s2+" is appointed as a mentor for you");
               System.out.println("The counsellor will get in touch with you within 24 hrs");
               System.out.println("contact info-"+l2);
               try
	   			{
	   				  FileWriter fw=new FileWriter("D:\\file java\\f1.txt",true);
	   				BufferedWriter bw = new BufferedWriter(fw); 
	   			      bw.write("  ");
	   				  bw.write(j);
	   				  bw.write("  ");
	   				  bw.write(s2);
	   				  bw.close();
				}catch(Exception e){System.out.println(e);} 
	             break;

               
		case 4:String s3="Tanmay Tiwari";
               String l3="9976450932";
              System.out.println("Mr "+s3+" is appointed as a mentor for you");
              System.out.println("The counsellor will get in touch with you within 24 hrs");
              System.out.println("contact info-"+l3);
              try
	   			{
	   				  FileWriter fw=new FileWriter("D:\\file java\\f1.txt",true);
	   				BufferedWriter bw = new BufferedWriter(fw); 
	   			      bw.write("  ");
	   				  bw.write(j);
	   				  bw.write("  ");
	   				  bw.write(s3);
	   				  bw.close();
				}catch(Exception e){System.out.println(e);} 
	             break;

             
		case 5:String s4="Varsha Jha";
               String l4="9878900932";
               System.out.println("Mrs "+s4+" is appointed as a mentor for you");
               System.out.println("The counsellor will get in touch with you within 24 hrs");
               System.out.println("contact info-"+l4);
               try
	   			{
	   				  FileWriter fw=new FileWriter("D:\\file java\\f1.txt",true);
	   				BufferedWriter bw = new BufferedWriter(fw); 
	   			      bw.write("  ");
	   				  bw.write(j);
	   				  bw.write("  ");
	   				  bw.write(s4);
	   				  bw.close();
				}catch(Exception e){System.out.println(e);} 
	             break;

             
		case 6:String s5="Viren Pankaj";
               String l5="8876450939";
               System.out.println("Mr "+s5+" is appointed as a mentor for you");
               System.out.println("The counsellor will get in touch with you within 24 hrs");
               System.out.println("contact info-"+l5);
               try
	   			{
	   				  FileWriter fw=new FileWriter("D:\\file java\\f1.txt",true);
	   				BufferedWriter bw = new BufferedWriter(fw); 
	   			      bw.write("  ");
	   				  bw.write(j);
	   				  bw.write("  ");
	   				  bw.write(s5);
	   				  bw.close();
				}catch(Exception e){System.out.println(e);} 
	             break;

               
		}
	}
}
