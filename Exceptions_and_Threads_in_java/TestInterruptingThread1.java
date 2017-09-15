public class TestInterruptingThread1 extends Thread
{
    public void run()
    {
        try
        {
            Thread.sleep(1000);
            System.out.println("task");
        }
        catch(InterruptedException e)
        {
            throw new RuntimeException("Thread interrupted..." + e);
        }
        System.out.println("Thread is working...."); // Not reachable as the control is forwarded to main function. 

    }

    public static void main(String args[])
    {
        TestInterruptingThread1 t1 = new TestInterruptingThread1();
        t1.start();
        try
        {
            t1.interrupt();
        }
        catch(Exception e)
        {
            System.out.println("Exception handled " + e);
        }

    }
}

// Output:
/* Exception in thread "Thread-0" java.lang.RuntimeException: Thread interrupted...java.lang.InterruptedException: sleep interrupted
        at TestInterruptingThread1.run(TestInterruptingThread1.java:7) */