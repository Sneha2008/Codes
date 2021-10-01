package com.HCL;

 class Const {
	 int id;
	 String name;
	 Const(){
		 System.out.println("Deafault Constructor");
		 
	 }
	 Const(int i,String n){
		 id=i;
		 name=n;
		 
	 }
	 void display() {
		 System.out.println(id+" "+name);
	 }
public static void main(String[] args) {
	Const c=new Const();
	Const c1=new Const(1,"Sneha");
	Const c2=new Const(2,"Anurag");
	c1.display();
	c2.display();
}
}
