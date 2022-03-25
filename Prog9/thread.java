import java.util.*;
class newThread implements Runnable {
   long time;
   String name;
   Thread t;
   int count;
   newThread(String S, int tim, int n)
   {
       time=tim;
       name=S;
       count=n;
       t= new Thread(this,name);
       t.start();
   }
   public void run()
   {
       try{
           for(int i=0;i<count;i++)
           {
           
            System.out.println(name);
 Thread.sleep(time);
           }

       }
       catch(InterruptedException e)
       {
           System.out.println(name+" Interrupted");
       }
   }

}

class thread{
    public static void main(String args[])
    {
        new newThread("BMS College of Engineering",10000,2);
        new newThread("CSE", 2000,10);
    }
}