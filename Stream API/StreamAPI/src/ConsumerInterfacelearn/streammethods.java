package ConsumerInterfacelearn;


import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class streammethods {
	public static void main(String args[]) {
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		
		Stream s = values.stream();
		
		Function<Integer, Integer> f = new Function<Integer, Integer>() {
			
			@Override
			public Integer apply(Integer t) {
				
				return t*2;
			}
		};
		Stream s1 = s.map(f);
		
		System.out.println(s1);
		
		BinaryOperator<Integer> b = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer arg0, Integer arg1) {
				return arg0+arg1;
			}
		};
		
		Integer result = (Integer) s1.reduce(0,b);//initial value and binary operator object
	
		System.out.println(result);
		
		
		
	}
}
