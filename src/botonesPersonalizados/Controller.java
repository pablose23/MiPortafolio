/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package botonesPersonalizados;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

/**
 *
 * @author centr
 */
public class Controller implements MouseListener{
    
    private final Principal view;
    
    public final void events(){
        view.jButtonIcon.addMouseListener(this);
        view.jButtonPrimary.addMouseListener(this);
        view.jButtonSuccess.addMouseListener(this);
    }

    public Controller(Principal view) {
        this.view = view;
        events();
    }

    @Override
    public void mouseClicked(MouseEvent me) {
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        Object evt = me.getSource();
        
        if(evt.equals(view.jButtonIcon)){
            changeBackground(view.containerBtnIcon, new Color(44, 62, 80));
        }else if(evt.equals(view.jButtonPrimary)){
            changeBackground(view.containerBtnPrimary, new Color(0, 88, 251));
        }else if(evt.equals(view.jButtonSuccess)){
            changeBackground(view.containerBtnSuccess, new Color(40, 139, 66));
        }
    }

    @Override
    public void mouseExited(MouseEvent me) {
        Object evt = me.getSource();
        
        if(evt.equals(view.jButtonIcon)){
            changeBackground(view.containerBtnIcon, new Color(51, 51, 51));
        }else if(evt.equals(view.jButtonPrimary)){
            changeBackground(view.containerBtnPrimary, new Color(0, 123, 255));
        }else if(evt.equals(view.jButtonSuccess)){
            changeBackground(view.containerBtnSuccess, new Color(40, 167, 69));
        }
    }
    
    private  void changeBackground(JPanel panel, Color color){
        panel.setBackground(color);
    }
}
