package ConsumerInterfacelearn;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class foreachimple {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		
		values.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
				
			}
			
		});
		
		values.forEach(i -> {System.out.println(i);}); // by lambda
		
		values.forEach(System.out::println); // by passing method reference.
		
		values.forEach(i -> doubleit(i));
		
		values.forEach(foreachimple :: doubleit);
		
	}
	public static void doubleit(Integer i ) {
		System.out.println(i*2);
	}

}
