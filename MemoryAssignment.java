
public class MemoryAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double mb = 2024*2024;
		Runtime r = Runtime.getRuntime();
		System.out.println("  Max Memory "+ r.maxMemory()/mb + " MB"); //This is max heap size
		System.out.println("  Total Memory "+ r.totalMemory()/mb + " MB");//This is minimum heap size or intial memory
		System.out.println("  Free Memory "+ r.freeMemory()/mb + " MB");
		System.out.println("  Consumed Memory "+ (r.totalMemory()-r.freeMemory())/mb + " MB");
	}

}
