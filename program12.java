class ThreadDemo extends Thread { 
public void run() { 
try{ 
//Moving thread to Timed Waiting state 
Thread.sleep(150); 
} catch (InterruptedException e) { 
e.printStackTrace(); 
} 
System.out.println("State after completion "+Thread.currentThread().getState()); 
}
public static void main(String[] args) throws InterruptedException { 
ThreadDemo t1 = new ThreadDemo(); 
System.out.println("State when created "+t1.getState()); 
t1.start(); 
System.out.println("State when started "+t1.getState()); 
//waiting for thread to die 
t1.join(); 
System.out.println("State after thread ended its task "+t1.getState()); 
}
}