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
abstract class PhoneCall 
{
    protected String phNumber;
    protected double price;

    abstract String getPhNumber();

    public void setPhNumber(String phNumber) {
        this.phNumber = phNumber;
    }

    abstract double getPrice();

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
    
    
    abstract void display();

    
} // end of PhoneCall
