package core.less6;
// патерн Фасад
public class Enginee implements Header, Body, Footer{

	private final Header header;
	
	private final Body body;
	
	private final Footer footer;

	public Enginee(Header header, Body body, Footer footer) {
		this.header = header;
		this.body = body;
		this.footer = footer;
	}
	
	public void printPage(){
		printHeader();
		printBody();
		printFooter();
	}

	public void printHeader() {
		if (header!=null)              // перевірка
		header.printHeader();
	}

	public void printBody() {
		if (body!=null)
		body.printBody();
	}

	public void printFooter() {
		if (footer!=null)
		footer.printFooter();
	}
	
	
}
