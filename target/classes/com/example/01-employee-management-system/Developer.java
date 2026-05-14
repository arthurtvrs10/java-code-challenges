// Inheritance
public class Developer extends Employee {
    private String languageProgramming;

    public Developer(String name, Double salary, String languageProgramming){
        super(name, salary);
        this.languageProgramming = languageProgramming;
    }

    public String getLanguageProgramming(){
        return languageProgramming;
    }

    public void setLanguageProgramming(String languageProgramming){
        this.languageProgramming = languageProgramming;
    }

    // Polymorphism 
    @Override
    public void work(){
        System.out.println("I'm coding a SAAS");
    }
}
