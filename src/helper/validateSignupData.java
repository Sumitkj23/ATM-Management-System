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
    
    public static boolean Signup_form1Validate(UserAccount_entity obj)
    {
        boolean b = false;
        
        if(obj.getName().trim().length()<2)
            JOptionPane.showMessageDialog(null, "Plese Enter Your Name Having Atleast 2 Character");
        else if(obj.getfName().trim().length()<2)
            JOptionPane.showMessageDialog(null, "Plese Enter Your Father Name");
        else if(obj.getGender() == null)
            JOptionPane.showMessageDialog(null, "Plese Select Your Gender");
        else if(obj.getAddress().trim().length()<3)
            JOptionPane.showMessageDialog(null, "Plese Enter Your Address");
        else if(obj.getCity().trim().length()<2)
            JOptionPane.showMessageDialog(null, "Plese Enter City Name");
        else if(Integer.toString(obj.getPinCode()).trim().length() !=6)
            JOptionPane.showMessageDialog(null, "Plese Enter Valid Pin Code");
        else if(obj.getState().trim().length()<4)
            JOptionPane.showMessageDialog(null, "Plese Enter State Name");
        else
            b = true;
        
        return b;
    }
    
    public static boolean Signup_form2Validate(UserAccount_entity obj)
    {
        boolean b = false;
        
        if(obj.getAadhar().trim().length() != 12)
            JOptionPane.showMessageDialog(null, "Plese Enter Your 12 Digit Aadhar Number");
        else if(obj.getContact().trim().length() != 10)
            JOptionPane.showMessageDialog(null, "Plese Enter Your Contact Number");
        else if(obj.getSec_ans().isEmpty())
            JOptionPane.showMessageDialog(null, "Plese Enter The Answer Of Your Selected Question");
        else
            b = true;
        
        return b;
    }
    
}