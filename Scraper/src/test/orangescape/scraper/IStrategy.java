package test.orangescape.scraper;

import java.util.List;

public interface IStrategy {
	
	
	public void startscrape(String url, List<String> xpath, boolean pagination, String queryString, int startRange, int stopRange);

}
