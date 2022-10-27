import java.util.List;
import java.util.stream.Stream;

public class ejemplo1 {
	public static void main(String[] args) {
		 // do something here...
		
		List<Integer> numbers = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);

		Long count = numbers.stream().filter(num -> num>10).count();
		
		System.out.println(count);
	}
}
