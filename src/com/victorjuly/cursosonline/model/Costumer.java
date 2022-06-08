package com.victorjuly.cursosonline.model;

public class Costumer {
    
    public static enum KnowledgeLevel {
       BASICO("Conhecimento básico"),
       INTERMEDIARIO("Conhecimento intermediário"),
       AVANCADO("Conhecimento avançado");
       
       private String label;
       private KnowledgeLevel(String label){
           this.label = label;
       }
       
       public String getLabel() {
           return label;
       }
    }
    
    public static enum Occupation {
        STUDENT("Estudante"), 
        FREELANCER("Freelancer"), 
        PROFESSOR("Docente"), 
        FULL_TIMER("Trabalhador assalariado");
        
        private String label;
        
        private Occupation(String label) {
            this.label = label;
        }
        
        public String getLabel() {
            return label;
        }
    }
    
    private int id;
    private String name;
    private int age;
    private KnowledgeLevel level;
    private Occupation occupation;
    private PaymentInfo paymentInfo;

    private static int currentId = 0;
    
    public Costumer(String name, int age, KnowledgeLevel level, Occupation occupation, PaymentInfo paymentInfo) {
        this.id = currentId;
        this.name = name;
        this.age = age;
        this.level = level;
        this.occupation = occupation;
        this.paymentInfo = paymentInfo;
        currentId++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public KnowledgeLevel getLevel() {
        return level;
    }

    public Occupation getOccupation() {
        return occupation;
    }

    public PaymentInfo getPaymentInfo() {
        return paymentInfo;
    }
   
    
}
