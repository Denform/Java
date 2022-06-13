package Lab2;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Manufacturer manufacturer = new Manufacturer();
        Consumer consumer = new Consumer();
        Storage storage = new Storage(10); //10 размер склада
        System.out.println("Размер склада: " + storage.getLimit());

        //Поток производителя
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    manufacturer.produce(storage);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        //Поток потребителя
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    consumer.consume(storage);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start(); thread2.start();

        thread1.join(); thread2.join();

    }
}
