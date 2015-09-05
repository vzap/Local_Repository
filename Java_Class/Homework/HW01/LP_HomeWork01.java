/**	Author:	Vincent Paz
*	Class:	Programming Fund
*	Date:	08/26/2015
*	HomeWork01
*/

import static java.lang.System.out;
import java.util.ArrayList;

public class HomeWork01 {

	public static void main(String[] arg){
		initals();
		loops();
		ArrayList<Integer> intArray = new ArrayList<Integer>();
		intArray.add(1);
		intArray.add(2);
		intArray.add(3);
		recursFunct(intArray);
	}
	public static void initals(){
		out.println("VVVVV     VVVVV     AAAAAAA        PPPPPPPPPP");
		out.println(" VVVVV   VVVVV     AAAA AAAA       PPPP   PPPP");
		out.println("  VVVVV VVVVV     AAAA   AAAA      PPPP   PPPP");
		out.println("   VVVVVVVVV     AAAA     AAAA     pppppppppp");
		out.println("    VVVVVVV     AAAAAAAAAAAAAAA    PPPP");
		out.println("     VVVVV     AAAA         AAAA   PPPP");
		out.println("      VVV     AAAA           AAAA  PPPP");
		out.println("       V     AAAA             AAAA PPPP");
	}
	public static void loops(){
		for (int i = 0; i < 3; i += 1) {
			out.println(i);
		}
		out.println("");
	}
	public static void recursFunct( ArrayList<Integer> nArray){
		if (nArray.isEmpty()){ return; }
		else {
			Integer numb = nArray.get(nArray.size() - 1);
			nArray.remove(nArray.size() - 1);
			recursFunct(nArray);
			out.println(numb);
		}
	}
}
