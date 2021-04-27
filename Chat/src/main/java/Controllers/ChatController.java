
package Controllers;

import com.mycompany.chat.FrmChatApp;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ChatController {
    FrmChatApp frmca = new FrmChatApp();

    public ChatController(FrmChatApp frmca) {
        this.frmca = frmca;   
        initComponent();
    }

    public ChatController() {
       
    }
  
    
    private void  initComponent(){
        frmca.getBtnExit().addActionListener((e) -> {
            btnExitActionListener(e);
        });
    
}

     private void btnExitActionListener(ActionEvent e){
          int opc = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea salir de la app?", "Confirmacion de salida"
                 , JOptionPane.YES_NO_OPTION);
           
        if(opc == JOptionPane.YES_OPTION){
            System.exit(0);
        }       
    }
}