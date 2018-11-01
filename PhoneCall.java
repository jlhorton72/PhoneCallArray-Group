/*
 * Name:        James Horton
 * Date:        11/01/2018
 * File:        PhoneCall.java
 */
package phonecallarray;

/**
 *
 * @author jh0375800
 */
public class PhoneCall 
{
    protected String phNumber;
    protected double price;

    public String getPhNumber() {
        return phNumber;
    }

    public void setPhNumber(String phNumber) {
        this.phNumber = phNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public PhoneCall(String num)
    {
        this.phNumber = num;
        this.price = 0.0;
    } // end of 1 arg constructor
    
    public PhoneCall(String num, double price)
    {
        this.phNumber = num;
        this.price = price;
    } // end of constructor PhoneCall
    
    
    public void display()
    {
        System.out.println("Call number: " + phNumber);
        System.out.println("Rate is: " + price);
    } // end of display
    
} // end of PhoneCall
