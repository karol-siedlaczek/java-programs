public class Konsument extends Thread{
    Main main = new Main();

    public void run() {
        while(true){
            try{
                System.out.println("Konsument skonsumował: " + main.kolejka.take());
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
