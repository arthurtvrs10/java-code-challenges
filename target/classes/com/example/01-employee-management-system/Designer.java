// Inheritance
public class Designer extends Employee{
    
    private String appEdicao;

    public Designer( String name, Double salary, String appEdicao){
        super(name, salary);
        this.appEdicao = appEdicao;
    }

    public void setAppEdicao(String appEdicao){
        this.appEdicao = appEdicao;
    }

    public String getAppEdicao(){
        return appEdicao;
    }

    // Polymorphism
    @Override
    public void work(){
        System.out.println("I'm editing a video");
    }
}
