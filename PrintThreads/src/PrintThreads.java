public class PrintThreads{
	public static void main(String[] args) {
		Object a = new Object();     
        Object b = new Object();     
        Object c = new Object();     
        MyThreadPrinter2 pa = new MyThreadPrinter2("A", c, a);     
        MyThreadPrinter2 pb = new MyThreadPrinter2("B", a, b);     
        MyThreadPrinter2 pc = new MyThreadPrinter2("C", b, c);     
             
             
        new Thread(pa).start();  
        Thread.sleep(100); 
        new Thread(pb).start();  
        Thread.sleep(100);    
        new Thread(pc).start();     
        Thread.sleep(100);    
	}
	public class Printer implements Runnable{
		private name;
		Object prev;
		Object self;
		public Printer(String name, Object prev, Object self){
			this.name = name;
			this.prev = prev;
			this.self = self;
		}

		@Override
		public void run(){
			int count = 10;
			while(count>0){
				synchronized(prev){
					synchronized(self){
						System.out.println(name);
						count--;
						self.notify();//notify others, release the lock(control) from self.
					}
					try{
						prev.wait();//prev release the lock, wait for notify.
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				}
			}
			// if(current.thread is the thread){
			// 	this.print();
			// 	notifyAll();
			// }else{
			// 	Thread..wait();
			// }
			// }
			// public synchronized void print(){
			// 	System.out.println(this.name);
			// }

	}
}

//1.如何判断当前thread拥有权力？2.thread code写在class里 还是main里，3 synchronized用在哪？
