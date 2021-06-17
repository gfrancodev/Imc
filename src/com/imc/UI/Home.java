package com.imc.UI;
import java.awt.event.*;


public class Home {
    public void execute(){
        UI view = new UI();
        view.addWindowListener(new WindowListener() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
    
            @Override
            public void windowOpened(WindowEvent e) {
                // TODO Auto-generated method stub
                
            }
    
            @Override
            public void windowClosed(WindowEvent e) {
                // TODO Auto-generated method stub
                
            }
    
            @Override
            public void windowIconified(WindowEvent e) {
                // TODO Auto-generated method stub
                
            }
    
            @Override
            public void windowDeiconified(WindowEvent e) {
                // TODO Auto-generated method stub
                
            }
    
            @Override
            public void windowActivated(WindowEvent e) {
                // TODO Auto-generated method stub
                
            }
    
            @Override
            public void windowDeactivated(WindowEvent e) {
                // TODO Auto-generated method stub
                
            }
        });
    
        view.pack();
        view.setVisible(true);
    }
}