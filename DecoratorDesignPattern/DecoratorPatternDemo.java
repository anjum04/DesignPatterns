package DecoratorDesignPattern;

public class DecoratorPatternDemo {

	public static void main(String[] args) {
		
		Shape circle = new Circle();
		System.out.println("Circle with normal border");
		circle.draw();
		 
		Shape redShapeCircle = new RedShapeDecorator(new Circle());
		System.out.println("Circle with red Colour border");
		redShapeCircle.draw();
		  
		 Shape  rectangle = new Rectangle();
		 System.out.println("Rectangle with normal border");
		 rectangle.draw();
		 
		 Shape redShapeRectangle = new RedShapeDecorator(new Rectangle());
		 System.out.println("Rectangle with red Colour border");
		 redShapeRectangle.draw();

	}

}
