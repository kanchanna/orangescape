package test.orangescape.scraper;

import java.util.List;

public class Context {
	
	private IStrategy strategy;
	
	public Context(IStrategy strategy){
		this.strategy = strategy;
	}
	
	
	public void scrapeSite(String url, List<String> xpath, boolean pagination, String queryString, int startRange, int stopRange){
		strategy.startscrape(url, xpath, pagination, queryString, startRange, stopRange);
	}

}
