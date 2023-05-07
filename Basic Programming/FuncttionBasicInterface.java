
    

import java.util.function.*;



public class FuncttionBasicInterface 
{

	static void modifyValue(int v, Function<Integer, Integer> function){
		int result = function.apply(v);
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		int n = 5;
	    modifyValue(n, val-> val * 25);
	    modifyValue(n, val-> val + 800);
	}
	
}

    

