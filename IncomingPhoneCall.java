/*
 * Name:        James Horton
 * Date:        11/01/2018
 * File:        IncomingPhoneCall.java
 */
package phonecallarray;

/**
 *
 * @author jh0375800
 */
public class IncomingPhoneCall extends PhoneCall 
{
       
    public IncomingPhoneCall(String num)
    {
        super(num);
        this.price = 0.02;
    } // end of constructor
    
    @Override
    public double getPrice()
    {
        return price;
    } // end of getPrice
    
    @Override
    public String getPhNumber()
    {
        return phNumber;
    }
    
    @Override
    public void display()
    {
        System.out.println("Call number: " + phNumber);
        System.out.println("Rate is: " + price);
        System.out.println("Price of call: " + price);
    } // end of display
    
} // end of IncomingPhoneCall
