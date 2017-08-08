package cn.pingweb;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(""+Thread.currentThread().isDaemon());
        System.out.println( "Hello World!" );
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("run");
                }
            }
        }).start();
        System.out.println("main");
        //System.exit(0);
    }
}
