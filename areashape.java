public class areashape {
	static double pi=3.14;
	static double area;
	
public static void main(String[] args ) {
	
	areashape ar1=new areashape();
	ar1.circle_area();
	ar1.cylinder_area();
	
	
}
void circle_area(){
	double r=4;
	area=pi*r*r;
	System.out.println("area of circle is "+area);
	
}

void cylinder_area(){
	double r=5;
	double h=10;
	area=pi*r*r*h;
	System.out.println("area of cylinder is "+area);
}


}
