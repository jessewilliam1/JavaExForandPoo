package multpoo;
import java.util.Scanner;

import mult.multNum;
public class multpoo {

	public static void main(String[] args) {
		 	int valor;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Digite o valor da tabuada:");
	        valor=sc.nextInt();
	        multNum novomultNum=new multNum();
	        novomultNum.mult(valor);
	        sc.close();  
	}

}
