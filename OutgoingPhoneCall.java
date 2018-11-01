/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonecallarray;

/**
 *
 * @author tn0786647
 */
public class OutgoingPhoneCall extends PhoneCall
{
    double timeOfCall;
    
    public OutgoingPhoneCall(String phNumber, double timeOfCall)
    {
        super(phNumber);
        this.timeOfCall = timeOfCall;
        
    }
    
    @Override
    public double getPrice()
    {
        return timeOfCall * 0.04;
    }
    
    @Override
    public String getPhNumber()
    {
        return super.phNumber;
    }
    @Override
    public void display()
    {
        System.out.println("Price of call: " + getPrice() + ", Phone number: " + phNumber + " rate per minute: 0.04, " + " number of minutes: " + timeOfCall + ".");
    } // end of display
    
}
