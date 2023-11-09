package AbstractFactoryDesignPattern;

public class Application {
	public static void main(String[] args)
	{
		GUIFactory factory;
		// Create a Windows GUI factory
        factory = new WinFactory();

        Button windowsButton = factory.createButton();
        windowsButton.render(); // Output: Rendering a Windows button

        Checkbox windowsCheckbox = factory.createCheckbox();
        windowsCheckbox.render(); // Output: Rendering a Windows checkbox

        // Create a Mac GUI factory
        factory = new MacFactory();

        Button macButton = factory.createButton();
        macButton.render(); // Output: Rendering a Mac button

        Checkbox macCheckbox = factory.createCheckbox();
        macCheckbox.render(); // Output: Rendering a Mac checkbox
	}

}
