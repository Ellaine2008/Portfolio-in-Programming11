public class ZooAnimal {
         private String name;
  private String type;
  private int age;
  private boolean hungry;
 
     
  public ZooAnimal() {
    
    this.hungry = true;
    // Constructor
  }
     //setters
  public void setName(String name) {
    this.name = name;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setAge(int age) {
    this.age = age;
  }
    //getters
  public String getName() {
    return name;
  }

  public String getType() {
    return type;
  }

  public int getAge() {
    return age;
  }

  public boolean isHungry() {
    return hungry;
  }
    public static void main(String[] args) {
    ZooAnimal animal = new ZooAnimal();
    animal.setName("Rose");
    animal.setType("Aspin");
    animal.setAge(61);

    System.out.println("Animal name: " + animal.getName());
    System.out.println("Animal type: " + animal.getType());
    System.out.println("Animal age: " + animal.getAge());
    
    System.out.println(animal.isHungry() ? "The animal named Rose is hungry" :"The animal named Rose is not hungry");
    }
}