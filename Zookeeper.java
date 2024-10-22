public class ZooKeeper{
	
	private String name;
	private String title;
	private double playRate;
	private boolean degree;
	
	public ZooKeeper() {	
	}
	
	//setter
	public void setName(String name){
		this.name = name;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public void setPlayRate(double playRate){
		this.playRate = playRate;
	}
	//getters 
	public String getName(){
		return name;
	}
	public String getTitle(){
		return title;
	}
	public double getPlayRate(){
		return playRate;
	}
	public boolean hasDegree(){
		return degree;
	}
	
	 public static void main(String[]args){	
  	ZooKeeper keeper = new ZooKeeper();
  		
  	keeper.setName("Ms.ZooKeeper Ellaine");
  	keeper.setTitle("Paradise Zoo");
  	keeper.setPlayRate(100.00);
  	
  	System.out.println("Name: " + keeper.getName());
  	System.out.println("Title: " + keeper.getTitle());
  	System.out.println("Payrate: " + keeper.getPlayRate());

	 }
}