package thread2;

public class Thread2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Thread_run th = new Thread_run();
		Thread_runnable th2 = new Thread_runnable();
		th.start();
		th2.run();*/
		
		Thread2_run []a = new Thread2_run[10];
		Thread2_runnable []b = new Thread2_runnable[10];
		
		/*try {
			th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		for(int i = 0; i < a.length; i++)  a[i] = new Thread2_run();
		for(int i = 0; i < b.length; i++)  b[i] = new Thread2_runnable();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("スレッドから出力："+a[i]);
		}
		for(int i = 0; i < 10; i++) {
			System.out.println("mainから出力："+i);
		}
	}
}





