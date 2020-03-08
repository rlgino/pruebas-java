package tasks;

/**
 * Forma nro 1 con un runneable y un sleep cada n cantidad de tiempo
 */
public class Task1 {

    //~ Constructors .................................................................................................................................

    private Task1() {}

    //~ Methods ......................................................................................................................................

    public static void main(String[] args) {
        final long     sec      = 3;
        final Runnable runnable = () -> {
            try {
                while (true) {
                    System.out.println("Hello world!");
                    Thread.sleep(sec * 1000);
                }
            } catch (final InterruptedException e) {
                System.out.println("Interrumped");
            } catch (final Exception ignored) {}
        };

        final Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("Hello world! 2");
        System.out.println("Hello world! 3");
        System.out.println("Hello world! 4");
    }
}
