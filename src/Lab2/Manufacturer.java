package Lab2;

public class Manufacturer {
    private int i = 0;

    public void produce(Storage storage) throws InterruptedException {
        while (true) {
            synchronized (storage.getLock()) {
                // Обработка ситуации, когда склад заполнен
                while (storage.getQueue().size() == storage.getLimit()) {
                    storage.getLock().wait();
                }
                Products products = new Products(i);
                storage.getQueue().offer(products);
                System.out.println("Произведен: " + products);
                i++;
                storage.getLock().notify();
            }
            //Для опустошения склада
            //Thread.sleep(2000);
        }
    }
}