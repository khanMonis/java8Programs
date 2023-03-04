package MethodsAndConstructor;

class Sample{
	
	public Sample(String s) {
		System.out.println("Sample Class Constructor execution With Argument:"+s);
	}
	
	/*
	 * public Sample() {
	 * 
	 * System.out.println("Sample Class Constructor execution"); }
	 */
}
interface Interf{
	//public Sample get();
	public Sample get(String s);
}
public class Constructor {
public static void main(String[] args) {
	Interf i=Sample::new;
	//Sample s1=i.get();
	Sample s2=i.get("Monis");
	Sample s3=i.get("Sinom");
}
	
}
