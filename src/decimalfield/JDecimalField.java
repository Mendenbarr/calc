/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimalfield;

/**
 *
 * @author 00220682
 */
public class JDecimalField extends JRegExpField {
    public JDecimalField(){
        super();
        setExp("-?(\\d*\\.?\\d*)");
    }
    
    public int getValue() throws NumberFormatException{
        return Integer.parseInt(getText());
    }
}
