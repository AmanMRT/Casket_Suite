/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package micpro;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashok
 */
public class splash {
    public static void main(String args[])
    {
    splash1 sp=new splash1();
    sp.setVisible(true);
    MD2 mds=new MD2();
    
        int i;
        for(i=0;i<101;i++)
        {
            try {
                Thread.sleep(40);
                 }
            catch(Exception e){}
            sp.lab.setText(Integer.toString(i)+" %");
            sp.bar.setValue(i);
            if(i==100)
            {
            sp.setVisible(false);
            mds.setVisible(true);
            }
        }
        
        
    }    
}
