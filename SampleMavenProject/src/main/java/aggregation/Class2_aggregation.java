package aggregation;

public class Class2_aggregation {
 int c,d; //instance variable
 Class1_aggregation s; //aggregation reference
 
 /*s is a reference variable of type Class1_aggregation.
This means Class2 HAS a Class1 object → this is aggregation.*/
 	
 public void sum(int c, int d, Class1_aggregation s ) {
	 this.c=c;
	 this.d=d;
	 this.s=s;
 }
 
 public void display() {
	 System.out.println("c= "+c);
	 System.out.println("d= "+d);
	 System.out.println("a= "+s.a);// printing class1's variable a and b through reference s
	 System.out.println("b= "+s.b);
 }
 
	public static void main(String[] args) {
		Class1_aggregation m =new Class1_aggregation(); //Create an object m of Class1_aggregation.
		m.setdata(6, 6); // passing values for variable a and b in class1
		Class2_aggregation n =new Class2_aggregation(); //Create an object n of Class2_aggregation.
		n.sum(19, 11, m); //n.c=19  n.d=11  n.s=m
		n.display();

	}

}
