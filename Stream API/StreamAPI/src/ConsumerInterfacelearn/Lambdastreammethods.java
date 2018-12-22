package ConsumerInterfacelearn;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Lambdastreammethods {
	public static void main(String args[]) {
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		
		Stream<Integer> s = values.stream();
		

		///Stream<Integer> s1 = s.map(i -> i*2);

		
		//Integer result = (Integer) s1.reduce(0,(c,e) -> c+e);//initial value and binary operator object
	
	
		
		Integer result1 = values.stream().map(i -> i*2).reduce(0, (c,e) -> c+e);
		System.err.println(result1);
		
		
		Integer result2 = values.stream().map(i -> i*2).reduce(0, Integer::sum);
		System.err.println(result1);
		
		
		Predicate<Integer> p = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				
				return t%2==0;
			}
			
		};
		
		System.out.println(values.stream().filter(p).reduce(0,(c,e) -> c+e));
		
		
		
		System.out.println(values.stream().filter(i -> i%2 == 0).map(i -> i*2).reduce(0,(a,c) -> a+c));
		
		Optional<Integer> res =  values.stream().filter(i -> i%2 == 0).findFirst(); // will return an optional value.
		
		Integer res1 = values.stream().filter(i -> i%2 == 0).findFirst().orElse(3);
		
		System.out.println(res1); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
