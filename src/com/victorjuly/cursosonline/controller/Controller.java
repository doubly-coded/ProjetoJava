package com.victorjuly.cursosonline.controller;

import com.victorjuly.cursosonline.domain.IContainer;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;

/* Esse "T" é chamado de tipo genérico. Ele pode ser qualquer tipo, como por exemplo,
 * Course ou Costumer, ou seja, esse controller pode ser um controller de Course ou de Costumer,
 * tudo depende de como você instância ele. Se você instanciar ele como new Controller<Course>, ele
 * será um controller de curso. Se você instanciar como new Controller<Costumer>, ele será um controller
 * de cliente. Dentro dessas instâncias, imagine que essa letra "T" será substituida pelo tipo que voce definir
 * */
public abstract class Controller<T> implements IContainer<T> {

    private static Map<Class<? extends Controller<?>>, Controller<?>> controllerRegistry;

    public static <U extends Controller<?>> Controller<U> registerController(Class<U> clazz) {
        try {
            return (Controller<U>) clazz.newInstance();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /*
    * Vai retornar um controller dependendo da classe que você passar
    * Se voce passar a CostumerController.class, ele vai retornar o controller de clientes
    * que esta instanciado no sistema. Mesma coisa para o CourseController.
    * */
    public static <U extends Controller<?>> U get(Class<U> clazz) {
        return (U) controllerRegistry.get(clazz);
    }

    private Class<? extends Controller<T>> clazz;
    private List<T> container;

    public Controller(Class<? extends Controller<T>> clazz) {
        this.clazz = clazz;
        container = new ArrayList<>();
    }

    public Controller<T> getInstance() {
        return (Controller<T>) get(clazz);
    }

    @Override
    public Collection<T> getContainer() {
        return container;
    }

    /*
    * Você passa uma lista de condições que serão utilizadas para filtrar os elementos da lista.
    * É como se fosse um monte de if. Um predicate (predicado) nada mais é que uma condição, como,
    * por exemplo, a + b > 10
    *
    * Sendo assim, você pode passar uma condição usando uma expressão lambda, desse jeito:
    * course -> course.getPrice() > 10
    *
    * A variável "course" será substituida por cada elemento da lista que ele vai testar
    * */
    public List<T> find(Predicate<T>... conditions) {
        List<T> filtered = (List<T>) getContainer();
        for(Predicate<T> cond : conditions) {
            filtered = filtered.stream().filter(cond).collect(Collectors.toList());
        }
        return filtered;
    }

    public void store(T param) {
        container.add(param);
    }

    public void delete(T param) {
        container.remove(param);
    }
}
