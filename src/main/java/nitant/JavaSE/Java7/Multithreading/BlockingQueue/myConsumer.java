package nitant.JavaSE.Java7.Multithreading.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

import static nitant.JavaSE.Java7.Multithreading.concurrentPackage.mainMethod.EOF;

public class myConsumer implements Runnable {
	private String color;
    private ArrayBlockingQueue<String> buffer;
    public myConsumer(ArrayBlockingQueue<String> buffer , String color){
        this .buffer = buffer;
        this .color= color;
    }
    public void run(){
    	while (true) {
            synchronized (buffer) {
			try {   
    		        if (buffer.isEmpty()) {
                			 continue;
                     }
                     if (buffer.peek().equals(EOF)) {
                         System.out.println(color + "Exiting.... ");
                         break;
                     } else {
                              System.out.println(color + "Removed " + buffer.take());
                     }
        }catch(InterruptedException e){
        	System.out.println("Interrupted");
        }
       }
      }     
    }       
}