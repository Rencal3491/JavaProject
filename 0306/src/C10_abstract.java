/*
 * Usage Modifier - abstract
 * -abstract 제한자는 아직 구현되지 않았다는 것을 의미함
 * -abstract 제한자는 클래스,메소드에 사용. 변수에는 x
 * 
 * 클래스에 사용하는 경우
 * - 객체를 생성할 수 없음
 * - 다형성을 통해서 추상클래스의 자료형으로 가지는 객체를 생성할 수 있음
 * - 추상 클래스가 됨
 * - 반드시 상속받아서 사용
 * 
 * 메소드에 사용하는 경우
 * - 추상메소드가 됨
 * - 메소드의 구현부분이 없음
 *
 *추상 메소드를 하나라도 포함하는 클래스는 추상 클래스가 되어야 함
 *그러나, 추상 클래스가 꼭 추상 메소드를 가져야 할 필요는 없다
 * 
 */ //도형
 abstract class Shape {
	 private int x;
	 private int y;
	 
	 public Shape() {
		 
	 }
	 public Shape(int x, int y) {
		 this.x = x;
		 this.y = y;	 
	 }
	 public abstract double getArea();
	 
	 public String position() {
		 return "[x" + x+ " , y=" +y+"]";
	 }
 }
 	 class Circle extends Shape {
 		private int radius;
 		public Circle(int r) {
 			this(0,0,r);
 		}
 		public Circle (int x, int y, int r) {
 	 		super(x,y);
 	 		this.radius = r;
 	 	}
 		 public double getArea() {
 			 return (Math.PI*radius*radius);
 		 }
 }
// shape를 부모로 하는 사각형, 삼각형 클래스를 만드시오
 	 class Rectangle extends Shape {
 		 int width;
 		 int height;
 		 public Rectangle (int width, int height) {
 			 this.height =height;
 			 this.width = height;
 	 }

 		 public Rectangle (int x, int y,int width, int height) {
 			 super(x,y);
 			 this.height =height;
 			 this.width = height;
 	 }
		@Override
		public double getArea() {
			// TODO Auto-generated method stub
			return width*height;
		} 
 	 }
	 class Triangle extends Shape {
 		 
			 int width;
			 int height;

	 		public Triangle(int width, int height) {
	 			this(0,0,width,height);
	 		}
	 		public Triangle (int x, int y, int width, int height) {
	 	 		super(x,y);
	 	 		this.width = width;
	 	 		this.height = height;
	 	 	}
	 		 public double getArea() {
	 			 return (width*height/2);
	 	 }
	 }
 	 
public class C10_abstract {

	public static void main(String[] args) {
		Shape Circle = new Circle(10);
		Shape Rectangle = new Rectangle(10, 5);
		Shape Triangle = new Triangle(20, 5);
		System.out.println("원의 넓이는 :" + Circle.getArea());
		System.out.println("도형 넓이는 :" + Circle.position());
		System.out.println("사각형의 넓이는 :" + Rectangle.getArea());
		System.out.println("삼각형의 넓이는 :" + Triangle.getArea());
	}

}
