/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guı;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class KeyHandler implements KeyListener {

    GUI gui;
    
    public KeyHandler(GUI gui){
        this.gui = gui;
    }
    
    
    
    
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        if(e.isControlDown() && e.getKeyCode()==KeyEvent.VK_Z){
            gui.edit.undo();
        }
        if(e.isControlDown() && e.getKeyCode()==KeyEvent.VK_Y){
            gui.edit.redo();
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
}