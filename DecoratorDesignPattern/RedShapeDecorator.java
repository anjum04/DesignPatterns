package DecoratorDesignPattern;

public class RedShapeDecorator extends ShapeDecorator{

	public RedShapeDecorator(Shape shapeDecorator) {
		super(shapeDecorator);
		
	}
	 public void draw()
	  {
		  shapeDecorator.draw();
		  setRedBorder(shapeDecorator);
	  }
	 
	 private void setRedBorder(Shape shapeDecorator)
	    {
	      
	        System.out.println("Border Color: Red");
	    }

}
