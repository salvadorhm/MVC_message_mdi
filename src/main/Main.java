package main;

import models.*;
import views.*;
import controllers.*;

import javax.swing.JPanel;

public class Main {

    public static void main(String[] args) {
        
        JPanel views[] = new JPanel[2];
        
        ModelAbout modelAbout = new ModelAbout();
        ViewAbout viewAbout = new ViewAbout();
        ControllerAbout controllerAbout = new ControllerAbout(modelAbout, viewAbout);
        
        ModelMessage modelMessage = new ModelMessage();
        ViewMessage viewMessage = new ViewMessage();
        ControllerMessage controllerMessage = new ControllerMessage(modelMessage, viewMessage);
        
        views[0] = viewAbout;
        views[1] = viewMessage;
        
        ModelMain modelMain = new ModelMain();
        ViewMain viewMain = new ViewMain();
        ControllerMain controllerMain = new ControllerMain(modelMain, viewMain, views);
    }
}