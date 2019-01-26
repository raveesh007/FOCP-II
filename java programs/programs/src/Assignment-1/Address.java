
class Address
{ 
   String line1;
   String line2;
   String city;
   String state;
   int pinCode;
   Address(String line1,String line2,String city,String state,int pinCode)
    {
        this.line1= line1;
        this.line2=line2;
        this.city=city;
        this.state=state;
   }
   public void setL1(String line1) 
   {   
      this.line1= line1;
   }
   public String getL1()
   {
   	return line1;
   }
    public void setL2(String line2) 
   {   
      this.line2= line2;
   }
   public String getL2()
   {
   	return line2;
   }
    public void setC(String city) 
   {   
      this.city= city;
   }
   public String getC()
   {
   	return city;
   }
    public void setS(String state) 
   {   
      this.state=state;
   }
   public String getS()
   {
   	return state;
   }
    public void setPN(int pinCode) 
   {   
      this.pinCode=pinCode;
   }
   public int getPN()
   {
   	return pinCode;
   }
    public void displayAddress ()
     {
        System.out.println("The address of the student is \n" + "Address line 1 = \n"+ line1 + "Address line 2 =\n"+ line2 + " City is =\n"+
           city + " State is = \n" + state + " Pin Code = \n"+ pinCode); 
    }
 

}