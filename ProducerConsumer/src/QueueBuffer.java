public class QueueBuffer{
	private Queue<DataModule> queue;
	private int size;
	private int nums;
	public QueueBuffer(int size) throws IllegalArgumentException{
		try{
			this.size=size;
		}catch(IllegalArgumentException e){
			System.out.println("size is illegal");
		}
		queue = new LinkedList();
		nums=0;
	}
	public synchronized add(){
		if(nums<size){
			queue.add(DataModule d);
			nums++;
		}else throw new LimitExceededException();	
	}
	public synchronized retrive(){
		if(nums>0){
			
		}
	}

}