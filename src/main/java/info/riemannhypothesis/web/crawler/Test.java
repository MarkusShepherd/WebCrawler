package info.riemannhypothesis.web.crawler;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * @author Markus Schepke
 * @date 4 Dec 2014
 */
public class Test {

    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("http://en.wikipedia.org/").get();
        Elements newsHeadlines = doc.select("#mp-itn b a");
        for (Element element : newsHeadlines) {
            System.out.println(element.toString());
        }
        doc = Jsoup.connect("http://www.schepke.info/").get();
        newsHeadlines = doc.select("a");
        for (Element element : newsHeadlines) {
            System.out.println(element.attr("href"));
        }
    }

}
