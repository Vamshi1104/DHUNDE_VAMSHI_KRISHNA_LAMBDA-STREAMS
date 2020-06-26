package epam.task;
import java.util.*;

public class Average {
	double findAverage(List<Integer> li)
	{
		IntSummaryStatistics stats = li.stream()
				.mapToInt(Integer::intValue)
			    .summaryStatistics();
		return stats.getAverage();
	}
}
