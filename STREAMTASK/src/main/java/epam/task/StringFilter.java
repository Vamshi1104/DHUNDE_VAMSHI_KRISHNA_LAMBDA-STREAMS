package epam.task;
import java.util.*;
import java.util.stream.*;
public class StringFilter {
	List<String> sFilter(List<String> str)
	{
		return 
		str.stream().filter(a->a.length()==3 &&  a.charAt(0)=='a')
		.collect(Collectors.toList());
	}
}
