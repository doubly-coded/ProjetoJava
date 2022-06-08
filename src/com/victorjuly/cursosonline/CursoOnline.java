package com.victorjuly.cursosonline;

import com.victorjuly.cursosonline.controller.Controller;
import com.victorjuly.cursosonline.controller.CostumerController;
import com.victorjuly.cursosonline.controller.CourseController;
import com.victorjuly.cursosonline.view.HomeView;

public class CursoOnline {
    public static void main(String[] args) {
        Controller.registerController(CostumerController.class);
        Controller.registerController(CourseController.class);
        new HomeView().setVisible(true);
    }
    
}
