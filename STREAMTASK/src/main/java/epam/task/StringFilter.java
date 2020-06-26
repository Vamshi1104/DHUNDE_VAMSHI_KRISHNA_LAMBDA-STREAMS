package epam.task;
import java.util.*;
import java.util.stream.*;
public class StringFilter {
	List<String> sFilter(List<String> str)
	{
		return 
		str.stream().filter(a->a.charAt(0)=='a' && a.length()==3)
		.collect(Collectors.toList());
	}
}
