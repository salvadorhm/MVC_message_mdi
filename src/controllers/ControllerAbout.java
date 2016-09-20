package controllers;

import models.ModelAbout;
import views.ViewAbout;

public class ControllerAbout {
    
    ModelAbout modelAbout;
    ViewAbout viewAbout;
    
    public ControllerAbout(ModelAbout modelAbout, ViewAbout viewAbout){
        this.modelAbout = modelAbout;
        this.viewAbout = viewAbout;
    }
}
