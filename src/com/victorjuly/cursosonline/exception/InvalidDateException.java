package com.victorjuly.cursosonline.exception;

public class InvalidDateException extends RuntimeException {
    
    public InvalidDateException() {
        super("Formato de data inválido. Utilize MM/yyyy com um mês entre 1 e 12 e um ano entre 2022 e 3000");
    }
    
}
