package test.orangescape.scraper;

import java.util.Arrays;

public class TestClient {
	
	public static void main(String[] args) {
		Context context = new Context(new YellowPagesITStrategy());
		String[] xpaths ={"//div[@class='item clearfix']/div/div/div/h2/a/text()","//div[@class='item clearfix']/div/div[@class='address']/span[@class='street-address']/text()","//div[@class='item clearfix']/div/div[@class='address']/span[@class='locality']/text()","//div[@class='item clearfix']/div/div[@class='address']/div/div[@class='tel']/span[@class='value']/text()"};
		context.scrapeSite("http://www.paginegialle.it/pgol/4-farmacia/", Arrays.asList(xpaths),true,"p-",1,5);
	}

}
