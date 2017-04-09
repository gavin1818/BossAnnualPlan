class Consumer implements Runnable
{

	private Person person;
	private String consumerName;

	public Consumer(String consumerName, Person person)
	{
		this.consumerName = consumerName;
		this.person = person;
	}

	@Override
	public void run()
	{
		try
		{
			person.consume();
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}

	}

}