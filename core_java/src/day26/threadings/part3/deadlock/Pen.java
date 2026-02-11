package day26.threadings.part3.deadlock;

public class Pen {
	
	public synchronized void write(Notebook notebook) {
		System.out.print(Thread.currentThread().getName() +" got pen");
		
		System.out.print(Thread.currentThread().getName() + "Witing for notebook");
		notebook.use();
	}

}
