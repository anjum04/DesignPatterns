package AbstractFactoryDesignPattern;

public class MacFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return (Button) new MacButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new MacCheckbox();
	}

}
