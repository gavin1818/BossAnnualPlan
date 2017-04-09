class Person
{
	private int foodNum = 0;
	private Object synObj = new Object();

	private final int MAX_NUM = 5;

	public void produce() throws InterruptedException
	{
		synchronized (synObj)
		{
			if (foodNum == 5)
			{
				System.out.println("box is full，size = " + foodNum);
				synObj.wait();
			}
			foodNum++;
			System.out.println("produce success foodNum = " + foodNum);
			synObj.notifyAll();
		}

	}

	public void consume() throws InterruptedException
	{
		synchronized (synObj)
		{
			if (foodNum == 0)
			{
				System.out.println("box is empty,size = " + foodNum);
				synObj.wait();
			}
			foodNum--;
			System.out.println("consume success foodNum = " + foodNum);
			synObj.notifyAll();
		}

	}
}