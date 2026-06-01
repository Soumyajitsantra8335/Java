class Mythread extends Thread {
    public void run(){
        try{
            for (int i=1; i<=3; i++){
                System.out.println(getName() + " running");
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}

public class treads2 {
    public static void main(String[] args) throws Exception {
        Mythread t1 = new Mythread();
        t1.setName("Soumo-1");
        t1.setPriority(8);

        System.out.println("Current thread:- "+Thread.currentThread().getName());
        System.out.println("Name :- "+ t1.getName());
        System.out.println("Priority :- "+ t1.getPriority());
        System.out.println("Alive Before start :- "+ t1.isAlive());
        t1.start();
        System.out.println("Alive after start:- "+t1.isAlive());
        t1.join();
        System.out.println("threads finished");
        
        
    }
}