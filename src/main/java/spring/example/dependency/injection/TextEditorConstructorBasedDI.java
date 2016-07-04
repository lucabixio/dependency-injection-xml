package spring.example.dependency.injection;

public class TextEditorConstructorBasedDI {

	private SpellChecker spellChecker;

	public TextEditorConstructorBasedDI(SpellChecker spellChecker) {
		super();
		this.spellChecker = spellChecker;
	}
	
	public void spellCheck() {
		System.out.println("Inside TextEditorConstructorBasedDI.spellCheck()." );
		spellChecker.checkSpelling();
	}
	
}
