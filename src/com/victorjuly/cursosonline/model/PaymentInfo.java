package com.victorjuly.cursosonline.model;

public class PaymentInfo {
    public static enum Type {
        CREDIT_CARD, DEBIT_CARD;
    }
    
    private Type type;
    private String agency;
    private String accountNumber;
    private String cvc;
    private String expirantionDate;

    public PaymentInfo(Type type, String agency, String accountNumber, String cvc, String expirantionDate) {
        this.type = type;
        this.agency = agency;
        this.accountNumber = accountNumber;
        this.cvc = cvc;
        this.expirantionDate = expirantionDate;
    }

    public Type getType() {
        return type;
    }

    

    public String getAgency() {
        return agency;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCvc() {
        return cvc;
    }

    public String getExpirantionDate() {
        return expirantionDate;
    }
    
    
    
}
