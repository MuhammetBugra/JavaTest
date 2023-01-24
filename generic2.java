package helloworld;

public class generic2<T,U> {
	T obj1;
	U obj2;
	generic2(T obj1,U obj2) {
		this.obj1=obj1;
		this.obj2=obj2; }
	public void print() {
		System.out.println(obj1+"--"+obj2); }
}
