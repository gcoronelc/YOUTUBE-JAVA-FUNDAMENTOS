package pe.egcc.pjvideo07;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Demo03 {

	public static void main(String[] args) {

		char a = '6';
		int n = Character.getNumericValue(a);
		System.out.println("a = " + a);
		
		int m = Integer.parseInt(String.valueOf(a));
		System.out.println("a = " + a);
		
		int p = a;
		System.out.println("p = " + p);
		
	}

}
