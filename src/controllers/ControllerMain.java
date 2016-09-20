package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import models.ModelMain;
import views.ViewMain;

public class ControllerMain {
    ModelMain modelMain;
    ViewMain viewMain;
    
    JPanel views[];

    public ControllerMain(ModelMain modelMain, ViewMain viewMain, JPanel views[]) {
        this.modelMain = modelMain;
        this.viewMain = viewMain;
        this.views= views;
        
        this.viewMain.jmiAbout.addActionListener(actionListener);
        this.viewMain.jmiMessage.addActionListener(actionListener);
        
        initView();
    }
    
    ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == viewMain.jmiAbout)
                jmiAboutActionPerformed();
            else if(e.getSource() == viewMain.jmiMessage)
                jmiMessageActionPerformed();
        }
    };
    
    private void initView(){
        viewMain.setTitle("MDI");
        viewMain.setLocationRelativeTo(null);
        viewMain.setVisible(true);
    }
    
    private void jmiAboutActionPerformed(){
        viewMain.setContentPane(views[0]);//JPanel ViewAbout
        viewMain.revalidate();
        viewMain.repaint();
    }
    
    private void jmiMessageActionPerformed(){
        viewMain.setContentPane(views[1]);//JPanel ViewMessage
        viewMain.revalidate();
        viewMain.repaint();
    }
}
