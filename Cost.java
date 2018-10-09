/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package micpro;


import static java.sql.DriverManager.println;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Cost {

    public static float Cost1(String length, String breadth, String height, String unit, String quantity, String wall, String flute, String spb, String printed, String box) {
       // System.out.print(wall);
        float l = Float.parseFloat(length);
        float b = Float.parseFloat(breadth);
        float h = Float.parseFloat(height);
        float qty = Float.parseFloat(quantity);
        
        float single_face_cost = 0.2f;
        float single_wall_3_cost = 0.3f;
        float single_wall_5_cost = 0.5f;
        float single_wall_7_cost = 0.7f;

        float flute_B_cost = 0.2f;
        float flute_C_cost = 0.3f;
        float flute_E_cost = 0.4f;
        float flute_BC_cost = 0.5f;

        float stitch_cost = 0.2f;
        float paste_cost = 0.3f;
        float both_cost = 0.4f;

        float Regular_Slotted_Container_cost = 0.5f;
        float Half_Slotted_Container_cost = 0.6f;
        float Overlap_Slotted_Container_cost = 0.7f;
        float Full_Slotted_Container_cost = 0.8f;
        float Snap_Lock_cost = 0.9f;

        float Full_Telescope_Design_cost = 0.3f;
        float Design_Style_Container_cost = 0.4f;
        float Double_Style_Container_cost = 0.5f;

        float One_Piece_Folder_cost = 0.2f;
        float Five_Panel_Folder_cost = 0.5f;
        float OPF_with_Dust_Flap_cost = 0.7f;

        float left = 0.3f;
        float right = 0.3f;
        float front = 0.3f;
        float back = 0.3f;
        float top = 0.3f;

        float allowance = 2;
        float per_square_rate = 20;

        if (unit.equalsIgnoreCase("mm")) {
            l *= 0.10;
            b *= 0.10;
            h *= 0.10;
            
        } else if (unit.equalsIgnoreCase("inch")) {
            l *= 2.54;
            b *= 2.54;
            h *= 2.54;
        }

        float sub_cost = 0.0f;

        switch(wall) {
            case " Single Face": {
                allowance += single_face_cost;
               // System.out.print(allowance);
                break;
            }
            case " Single Wall": {
                allowance += single_wall_3_cost;
                break;
            }
            case " Double Wall": {
                allowance += single_wall_5_cost;
                break;
            }
            case " Triple Wall": {
                allowance += single_wall_7_cost;
                break;
            }
        }

        switch (flute) {
            case " B": {
                allowance += flute_B_cost;
                //System.out.print(allowance);
                break;
            }
            case " C": {
                allowance += flute_C_cost;
                break;
            }
            case " E": {
                allowance += flute_E_cost;
                break;
            }
            case " BC": {
                allowance += flute_BC_cost;
                break;
            }
        }

        switch (spb) {
            case " Stiching": {
                allowance += stitch_cost;
                break;
            }
            case " Pasting": {
                allowance += paste_cost;
                break;
            }
            case " Both": {
                allowance += both_cost;
                break;
            }
        }
        
        switch (box) {
            case "Regular Slotted Container": {
                allowance += Regular_Slotted_Container_cost;
            //    System.out.print(allowance);
                break;
            }
            case "Half Slotted Container": {
                allowance += Half_Slotted_Container_cost;
                break;
            }
            case "Overlap Slotted Container": {
                allowance += Overlap_Slotted_Container_cost;
                break;
            }
            case "Full Slotted Container": {
                allowance += Full_Slotted_Container_cost;
                break;
            }
            case "Snap Lock": {
                allowance += Snap_Lock_cost;
                break;
            }

            case "Full Telescope Design": {
                allowance += Full_Telescope_Design_cost;
                break;
            }
            case "Design Style Container": {
                allowance += Design_Style_Container_cost;
                break;
            }
            case "Double Style Container": {
                allowance += Double_Style_Container_cost;
                break;
            }

            case "One Piece Folder": {
                allowance += One_Piece_Folder_cost;
                break;
            }
            case "Five Panel Folder": {
                allowance += Five_Panel_Folder_cost;
                break;
            }
            case "OPF with Dust Flap": {
                allowance += OPF_with_Dust_Flap_cost;
                break;
            }

        }
        sub_cost = (float)(((l * b + allowance) * (b * h + allowance) * 2 / 1000) * per_square_rate*qty); //double me nahi hora cast
        sub_cost *= qty;
return sub_cost;

    }

}
