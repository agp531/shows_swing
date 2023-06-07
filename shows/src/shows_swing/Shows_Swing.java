/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shows_swing;

import java.util.ArrayList;
import model.DaoShow;
import model.Shows;
import view.ShowView;

/**
 *
 * @author allan
 */
public class Shows_Swing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DaoShow daoShow = new DaoShow();
        ArrayList<Shows> shows = daoShow.buscarTodos();
        for(Shows s : shows){
            System.out.println(s.getArtista()
                    + " - " + s.getData());
        }
        
        new ShowView().setVisible(true);
    }
    
}
