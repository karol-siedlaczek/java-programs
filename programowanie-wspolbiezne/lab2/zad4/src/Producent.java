public class Producent extends Thread{
    Main main = new Main();

    public void run() {
        while (true) {
            int losowy = main.losuj.nextInt(1000);
            try {
                //System.out.println("Producent wyprodukował: " + main.kolejka.toString());
                System.out.println("Producent wyprodukowal: " + losowy);
                main.kolejka.put(losowy);
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
