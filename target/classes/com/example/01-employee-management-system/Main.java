public class Main{
    public static void main(String[] args){
        // Explicit Polymorphism
        Employee developer = new Developer("Harry Potter", 1500.00, "Java");
        Employee designer = new Designer("Hermione", 15050.00, "Photoshop");

        // Thread Implementation
        Thread thread = new Thread(() -> {

            System.out.println("Starting threads processing...");
            // try/catch Usage
            try{
                designer.work();
                developer.work();
                Thread.sleep(2000); // It needs the interruptedException 
                
            } catch (InterruptedException e){
                System.out.println("Erro na Thread " + e.getMessage());
            }

            System.out.println("Threads processed successfully.");
        });

        thread.start();
        System.out.println("Main finished");
        

    }

}
