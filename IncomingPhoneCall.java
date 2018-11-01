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
    public IncomingPhoneCall(String num, double rate)
    {
        super(num, rate);
    } // end of constructor
    
    @Override
    public void display()
    {
        super.display();
        System.out.println("Price of call: " + price);
    } // end of display
    
} // end of IncomingPhoneCall
