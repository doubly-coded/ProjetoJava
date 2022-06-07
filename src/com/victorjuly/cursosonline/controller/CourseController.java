package com.victorjuly.cursosonline.controller;

import com.victorjuly.cursosonline.domain.IContainer;
import com.victorjuly.cursosonline.model.Course;
import java.util.Optional;
import java.util.function.Predicate;

public class CourseController extends Controller<Course> implements IContainer<Course> {
    public CourseController() {
        super(CourseController.class);
    }


    public double getPriceAverage() {
        // Pega a lista de cursos, transforma cada curso em um número (seu preço)
        // pega todos esses numeros, soma e divide pela quantidade de cursos
        return getContainer().stream().map(Course::getPrice).reduce(0D, Double::sum)/getContainer().size();
    }
}
