
import java.io.IOException;

public class WaitAndNotify
{
	public static void main(String[] args) throws IOException
	{
		Person person = new Person();
		new Thread(new Consumer("Consumer1", person)).start();
		new Thread(new Consumer("Consumer2", person)).start();
		new Thread(new Consumer("Consumer3", person)).start();

		new Thread(new Producer("Producer1", person)).start();
		new Thread(new Producer("Producer2", person)).start();
		new Thread(new Producer("Producer3", person)).start();

	}
}