package DecoratorDesignPattern;

public abstract class ShapeDecorator implements Shape{
	
	  Shape shapeDecorator;
	  
	  public ShapeDecorator(Shape shapeDecorator)
	  {
		  this.shapeDecorator=shapeDecorator;    //Circle
	  }
	  
	  public void draw() { 
		  shapeDecorator.draw(); 
		}

}
