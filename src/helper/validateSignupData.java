/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import javax.swing.JOptionPane;

/**
 *
 * @author Sumit Kumar
 */
public class validateSignupData {
    
    // validate 'Signup Form1', 'Account' package
    public static boolean Signup_form1Validate(UserAccount_entity obj)
    {
        boolean b = false;
        
        if(obj.getName().trim().length()<2)                                 // 'Name' having atleat 2 character
            JOptionPane.showMessageDialog(null, "Plese Enter Your Name Having Atleast 2 Character");
        else if(obj.getfName().trim().length()<2)                           // 'Father's Name' having atleat 2 character
            JOptionPane.showMessageDialog(null, "Plese Enter Your Father Name");
        else if(obj.getGender() == null)                                    // 'Gender' selected or not
            JOptionPane.showMessageDialog(null, "Plese Select Your Gender");
        else if(obj.getAddress().trim().length()<3)                         // 'Address' field having atleat 3 character
            JOptionPane.showMessageDialog(null, "Plese Enter Your Address");
        else if(obj.getCity().trim().length()<2)                            // 'City' field having atleat 2 character
            JOptionPane.showMessageDialog(null, "Plese Enter City Name");
        else if(Integer.toString(obj.getPinCode()).trim().length() !=6)     // 'Pin Number' must have 6-Digits
            JOptionPane.showMessageDialog(null, "Plese Enter Valid Pin Code");
        else if(obj.getState().trim().length()<4)                           // 'State' field having atleat 4 character
            JOptionPane.showMessageDialog(null, "Plese Enter State Name");
        else
            b = true;
        
        return b;
    }
    
    // validate 'Signup Form2', 'Account' package
    public static boolean Signup_form2Validate(UserAccount_entity obj)
    {
        boolean b = false;
        
        String Aadhar = obj.getAadhar().trim();             // holds 'Aadhar Number'
        String Contact = obj.getContact().trim();           // holds 'Contact Number'
        
        if(Aadhar.length() != 12)                           // 'Aadhar Number' must have 12-digits
            JOptionPane.showMessageDialog(null, "Plese Enter Your 12 Digit Aadhar Number");
        else if(Contact.length() != 10)                     // 'Contact Number' must have 10-digits
            JOptionPane.showMessageDialog(null, "Plese Enter Your Contact Number");
        else if(obj.getSec_ans().trim().isEmpty())          // 'Security Answer' field must not be empty
            JOptionPane.showMessageDialog(null, "Plese Enter The Answer Of Your Selected Question");
        else
        {
            try{
                Long.parseLong(Aadhar);                     // try to convert 'Aadhar Number' into digits
            }catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Plese Enter Valid 12-Digit Aadhar Number");
                return b;
            }
            
            try{
                Long.parseLong(Contact);                    // try to convert 'Contact Number' into digits
            }catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Plese Enter Valid 10-Digit Contact Number");
                return b;
            }
            
            if(Aadhar.charAt(0) == '0')                     // first digit of 'Aadhar Number' should not be '0'
                JOptionPane.showMessageDialog(null, "Plese Enter Valid 12-Digit Aadhar Number");
            else if(Contact.charAt(0) < 54)                 // first digit of 'Contact Number' should not be '<6'
                JOptionPane.showMessageDialog(null, "Plese Enter Valid 10-Digit Contact Number");
            else
                b = true;

        }
        
        return b;
    }
    
}
