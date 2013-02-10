package test.orangescape.scraper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class YellowPagesITStrategy implements IStrategy {
	private final WebClient webClient = new WebClient();
	private HtmlPage page;

	@Override
	public void startscrape(String url, List<String> xpaths,
			boolean pagination, String queryString, int startRange,
			int stopRange) {
		// check for pagination
		if (pagination) {
			for (int i = startRange; i <= stopRange; i++) {
				getScrapedData(url + queryString + i, xpaths);
			}
		} else {
			getScrapedData(url, xpaths);
		}
	}

	// helper methods
	private void getScrapedData(String url, List<String> xpaths) {
		for (String xpath : xpaths) {
			// System.out.println(basepath+xpath);
			try {
				page = webClient.getPage(url);
			} catch (FailingHttpStatusCodeException e) {
				e.printStackTrace();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(page.getByXPath(xpath));
			// writeDataToFile();
		}
	}

	private void writeDataToFile() {

	}

}
