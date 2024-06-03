package Busreservation;

public class Bus {

	private int busNo;
	private int capacity;
	private boolean Ac;
	Bus(int busNo,boolean  Ac,int capacity)
	{
		this.busNo=busNo;
		this.Ac=Ac;
		this.capacity=capacity;
	}
	
	public int getBusNo()
	{
		return busNo;
	}
	public void setBusNo(int busNo) 
	{
		this.busNo = busNo;
	}
	public int getCapacity() 
	{
		return capacity;
	}
	public void setCapacity(int capacity)
	{
		this.capacity = capacity;
	}
	public boolean getAc() 
	{
		return Ac;
	}
	public void setAc(boolean Ac) {
		Ac = Ac;
	}

	
  public void display()
  {
	  System.out.println("busNo: "+busNo+" Ac is available: "+Ac+" bus capacity is: "+capacity);
  }
}
