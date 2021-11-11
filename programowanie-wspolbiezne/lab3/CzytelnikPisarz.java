public class CzytelnikPisarz{
    public static void main (String[] args) throws InterruptedException{
        final Main main = new Main();

        Thread Pisarz1 = new Thread(new Runnable(){
            @Override
            public void run(){
                try{
                    System.out.println("pisarz1: ");
                    main.pisz();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        Thread Pisarz2 = new Thread(new Runnable(){
            @Override
            public void run(){
                try{
                    System.out.println("pisarz2: ");
                    main.pisz();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        Thread Pisarz3 = new Thread(new Runnable(){
            @Override
            public void run(){
                try{
                    System.out.println("pisarz3: ");
                    main.pisz();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        Thread Pisarz4 = new Thread(new Runnable(){
            @Override
            public void run(){
                try{
                    System.out.println("pisarz4: ");
                    main.pisz();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        Thread Pisarz5 = new Thread(new Runnable(){
            @Override
            public void run(){
                try{
                    System.out.println("pisarz5: ");
                    main.pisz();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        Thread Pisarz6 = new Thread(new Runnable(){
            @Override
            public void run(){
                try{
                    System.out.println("pisarz6: ");
                    main.pisz();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        Thread Czytelnik1 = new Thread(new Runnable(){
            @Override
            public void run(){
                try{
                    main.czytaj();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        Thread Czytelnik2 = new Thread(new Runnable(){
            @Override
            public void run(){
                try{
                    main.czytaj();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        Thread Czytelnik3 = new Thread(new Runnable(){
            @Override
            public void run(){
                try{
                    main.czytaj();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        Thread Czytelnik4 = new Thread(new Runnable(){
            @Override
            public void run(){
                try{
                    main.czytaj();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        Thread Czytelnik5 = new Thread(new Runnable(){
            @Override
            public void run(){
                try{
                    main.czytaj();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        Thread Czytelnik6 = new Thread(new Runnable(){
            @Override
            public void run(){
                try{
                    main.czytaj();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        Thread Czytelnik7 = new Thread(new Runnable(){
            @Override
            public void run(){
                try{
                    main.czytaj();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        Thread Czytelnik8 = new Thread(new Runnable(){
            @Override
            public void run(){
                try{
                    main.czytaj();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        Thread Czytelnik9 = new Thread(new Runnable(){
            @Override
            public void run(){
                try{
                    main.czytaj();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        Thread Czytelnik10 = new Thread(new Runnable(){
            @Override
            public void run(){
                try{
                    main.czytaj();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        Thread Czytelnik11 = new Thread(new Runnable(){
            @Override
            public void run(){
                try{
                    main.czytaj();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        Thread Czytelnik12 = new Thread(new Runnable(){
            @Override
            public void run(){
                try{
                    main.czytaj();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        Pisarz1.start();
        Pisarz2.start();
        Pisarz3.start();
        Pisarz4.start();
        Pisarz5.start();
        Pisarz6.start();

        Czytelnik1.start();
        Czytelnik2.start();
        Czytelnik3.start();
        Czytelnik4.start();
        Czytelnik5.start();
        Czytelnik6.start();
        Czytelnik7.start();
        Czytelnik8.start();
        Czytelnik9.start();
        Czytelnik10.start();
        Czytelnik11.start();
        Czytelnik12.start();

        Pisarz1.join();
        Pisarz2.join();
        Pisarz3.join();
        Pisarz4.join();
        Pisarz5.join();
        Pisarz6.join();

        Czytelnik1.join();
        Czytelnik2.join();
        Czytelnik3.join();
        Czytelnik4.join();
        Czytelnik5.join();
        Czytelnik6.join();
        Czytelnik7.join();
        Czytelnik8.join();
        Czytelnik9.join();
        Czytelnik10.join();
        Czytelnik11.join();
        Czytelnik12.join();
    }
}