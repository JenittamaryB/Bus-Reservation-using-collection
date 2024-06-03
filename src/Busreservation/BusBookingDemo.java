package Busreservation;

import java.util.ArrayList;
import java.util.Scanner;

public class BusBookingDemo 
{
	public static void main(String[] args) {
	 ArrayList <Bus> buses=new ArrayList<Bus>();
	 buses.add(new Bus(1,true,2));
	 buses.add(new Bus(2,false,30));
	 buses.add(new Bus(3,true,44));
	 
	 for(Bus s:buses)
	 {
		 s.display();
	 }
	 
	 ArrayList <Booking> book=new ArrayList<Booking>();
	 
    	 int n=50;
    	 int user=1;
    	 Scanner sc=new Scanner(System.in);
    	 //for(int i=1;i<=n;i++)
    	 //{
    	 while(user==1)
    	 {
    		 System.out.println("enter 1 for continue and 2 for exit..");
    		  user=sc.nextInt();
    		 if(user==1)
    		 {
    			 Booking b=new Booking();
    			 if(b.isAvailable(book,buses))
    			 {
    				 book.add(b);
    				 System.out.println("your booking is confirm...");
    			 }
    			 else {
    				 System.out.println("sry.. bus is full..");
    			 }
    		 }
    		 if(user==2)
    		 {
    			 System.out.println("Thankyou Have a greatday...");
    		 }
    	 }
      //}
    	 
    	 
     }
}
