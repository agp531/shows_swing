/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Shows;


/**
 *
 * @author allan
 */
public class ShowTableModel extends AbstractTableModel{
    public static final int COL_CODIGO = 0;
    public static final int COL_ARTISTA = 1;
    public static final int COL_CACHE = 2;
    public static final int COL_DATA = 3;
    public static final int COL_VALOR_INGRESSO = 4;
    public static final int COL_LOCAL = 5;
    
    
    public ArrayList<Shows> listaShows;
    
    public ShowTableModel(ArrayList<Shows> alShow){
        this.listaShows = alShow;
    }
    
    @Override
    public Object getValueAt(int linha, int coluna){
        Shows s = listaShows.get(linha);
        Object conteudo = "";
        if(coluna == COL_CODIGO){conteudo = s.getCodigo();}
        if(coluna == COL_ARTISTA){conteudo = s.getArtista();}
        if(coluna == COL_CACHE){conteudo = s.getCache();}
        if(coluna == COL_DATA){conteudo = s.getData();}
        if(coluna == COL_VALOR_INGRESSO){conteudo = s.getValorIngresso();}
        if(coluna == COL_LOCAL){conteudo = s.getLocal();}
        
        return conteudo;   
    }
    
    @Override
    public int getColumnCount(){
        return 6;
    }
    
    @Override
    public int getRowCount(){
        return listaShows.size();
    }
    
    @Override
    public String getColumnName(int coluna){
        String nome = "";
        if(coluna == COL_CODIGO){nome = "Código";}
        if(coluna == COL_ARTISTA){nome = "Artista";}
        if(coluna == COL_CACHE){nome = "Cache";}
        if(coluna == COL_DATA){nome = "Data";}
        if(coluna == COL_VALOR_INGRESSO){nome = "Valor Ingresso";}
        if(coluna == COL_LOCAL){nome = "Local";}
        return nome;   
    }
}
