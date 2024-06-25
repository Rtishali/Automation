package practice;

public class Sample {
	static int i=10;
	int j=20;
public static void main(String[] args) {
	//print static memebers
	System.out.println(i);
	//print NSM
	Sample s=new Sample();
	System.out.println(s.j);
}
}
