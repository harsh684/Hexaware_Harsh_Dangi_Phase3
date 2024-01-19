package com.demo.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		
		Stream<Integer> stream = Stream.of(44,66,22,11,99);
		
		//long count = stream.count();
		//System.out.println(count);
		
		Comparator<Integer> comparator = (i1, i2)->{return i1.toString().compareTo(i2.toString());};
		
		Optional<Integer> optional = stream.max(comparator);
		
		if(optional.isPresent()) {
			System.out.println(optional.get());
		}else {
			System.out.println(optional.orElse(0));
		}
		
		String name[] = {"satish","ravim","ford","adam"};
		
		Stream<String> stream2 = Arrays.stream(name);
		
		//.map takes function lambda function and foreach takes consumer function
		stream2.map((str)->{System.out.print(str); return str.length();}).forEach((len)->{System.out.println(len);});
	
		List<String> list = Arrays.asList(name);
	
		Stream<String> stream3 = list.stream();
		
		//.filter takes predicate function
		stream2.map((str)->{return str.length();})
		.filter((len)->{return len>7;});
		
		
	}

}
