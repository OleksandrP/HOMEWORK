package homework2;

public class Main {

	public static void main(String[] args) {
		
				int new1 =0;
				int new2=1;
				System.out.println(new1);
				System.out.println(new2);
				for(int i=3;i<=10;i++){
						for(int j=1; j<=1; j++) {
				int rez=new1+new2;
					System.out.println(rez);
					new1 =new2;
					new2 = rez;
				}

			}

	}
	}
