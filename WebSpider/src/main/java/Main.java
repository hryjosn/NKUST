import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        try {
            Document innerDoc = Jsoup.connect("https://www.ptt.cc/bbs/Kaohsiung/index.html").get();
            Elements links = innerDoc.select("div.r-ent>div.title>a[href]");
            for (Element link : links) {
                System.out.println("links:"+link.attr("href"));
                System.out.println("title:"+link.text());
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
