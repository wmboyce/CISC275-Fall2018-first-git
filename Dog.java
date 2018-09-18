
public class Dog extends Animal implements Comparable<Dog> {
	public Dog(String name, int legs) {
		super(name, legs);
	}

	@Override
	public int compareTo(Dog arg0) {
		return Integer.compare(this.getLegs(), arg0.getLegs());
	}
	
	@Override
	public String toString() {
		return "Dog " + getName() + " with " + getLegs() + " legs";
	}
}
