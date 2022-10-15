package application;

public class Z {

	public static void main(String[] args) {

		String fullStr = "JAVA,PHP,WORDPRESS,MYSQL,DATABASE";
		String[] arrSplit = fullStr.split(",");
		for (int i = 0; i < arrSplit.length; i++) {
			System.out.println(arrSplit[i]);
		}
		
	}

}
