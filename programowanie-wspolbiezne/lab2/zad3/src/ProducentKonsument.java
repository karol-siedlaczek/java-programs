public class ProducentKonsument{
    public static void main (String[] args) throws InterruptedException{
        final Main main = new Main();

        Thread Producent = new Thread(new Runnable(){
            @Override
            public void run(){
                try{
                    main.produkuj();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        Thread Konsument = new Thread(new Runnable(){
            @Override
            public void run(){
                try{
                    main.konsumuj();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        Producent.start();
        Konsument.start();
        Producent.join();
        Konsument.join();
    }
}