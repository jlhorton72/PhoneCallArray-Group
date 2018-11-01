/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonecallarray;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author lm0865474
 */
public class PhoneCallArray 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ArrayList<PhoneCall> call = new ArrayList<PhoneCall>();
        
        String flag ="";
        Scanner key = new Scanner(System.in);
        while(!"Q".equals(flag)){
            
            System.out.println("Was the call incoming? (Y or N or Q to quit): ");
            String inp = key.next();
            if ("Y".equals(inp)){
                System.out.println("Enter Phone Number: ");
                String num = key.next();
                IncomingPhoneCall inc = new IncomingPhoneCall(num);
                call.add(inc);
                  
            }
            if("N".equals(inp)){
                System.out.println("Enter Phone Number: ");
                String num = key.next();
                System.out.println("How Long was the Call: ");
                String leng = key.next();
                Double conv = Double.parseDouble(leng);
                OutgoingPhoneCall ouc = new OutgoingPhoneCall(num,conv);
                call.add(ouc);
            }
          
            
        }
       
        
        
    } // end of main
    
} // end of class PhoneCallArray
