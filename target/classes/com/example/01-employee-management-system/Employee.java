public class Employee {

    private String name;
    private Double salary;

    //Constructor Overloading
    public Employee(){
        
    }
    //Constructor Overloading
    public Employee( String name){
        this.name = name;
    }
    //Constructor Overloading
    public Employee( String name, Double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public Double getSalary(){
        return salary;
    }

    public void setSalary(Double newSalary){
        this.salary = newSalary;
    }

    public void work(){
        System.out.println("Employee working...");
    }

    
}
