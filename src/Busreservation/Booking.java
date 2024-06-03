package Busreservation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Booking 
{
    String passengername;
	int busNo;
	Date date;
	
	Booking()
	{
	  	Scanner sc=new Scanner(System.in);
	  	System.out.println("enter name:");
	  	passengername=sc.next();
	  	System.out.println("enter busNo");
	  	busNo=sc.nextInt();
	  	System.out.println("enter dd-mm-yyyy");
	  	String d=sc.next();
	  	
	  	SimpleDateFormat s=new SimpleDateFormat("dd-MM-yyyy");//default method 
	  	try 
	  	{
			date=s.parse(d);//this for convert string to date format
		}
	  	catch (ParseException e)
	  	{
			e.printStackTrace();
		}
	}
	  	public boolean isAvailable(ArrayList<Booking> book ,ArrayList<Bus> buses)
	  	{
	  		int capacity=0;
	  		for(Bus bus:buses)
	  		{
	  			if(bus.getBusNo()==busNo)
	  			{
	  				capacity=bus.getCapacity();	  		
	  				}
	  		}
	  		int booked=0;
	  		for(Booking o:book)
	  		{
	  			if(o.busNo==busNo&&o.date.equals(date))
	  			{
	  				booked++;
	  			}
	  		}
			return booked<capacity?true:false;
		
	}
		
}
