package Lab2;

public class Consumer {
    public void consume(Storage storage) throws InterruptedException {
        while (true) {
            synchronized (storage.getLock()) {
                //Обработка ситуации, когда склад пуст
                while (storage.getQueue().size() == 0) {
                    storage.getLock().wait();
                }
                Products products = storage.getQueue().poll();
                System.out.println(products + " взят со склада");
                System.out.println("Количество продуктов на складе: " + storage.getQueue().size());
                storage.getLock().notify();
            }

            //Для наполнения склада
            Thread.sleep(1000);
        }
    }
}