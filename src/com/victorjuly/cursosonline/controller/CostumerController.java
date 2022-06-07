package com.victorjuly.cursosonline.controller;

import com.victorjuly.cursosonline.domain.IContainer;
import com.victorjuly.cursosonline.model.Costumer;

public class CostumerController extends Controller<Costumer> implements IContainer<Costumer> {

    public CostumerController() {
        super(CostumerController.class);
    }

}