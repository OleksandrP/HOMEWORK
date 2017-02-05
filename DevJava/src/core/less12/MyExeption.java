package core.less12;

public class MyExeption extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6829556878480381442L;

	@Override
	public void printStackTrace() {  // Не робити такого!!!
	
		System.err.println("Caм шукай де і чого помилка");
	}

}
