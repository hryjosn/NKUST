import org.jsoup.Jsoup;
import org.json.*;

import java.util.Iterator;

/**
 * https://medium.com/%E5%BD%BC%E5%BE%97%E6%BD%98%E7%9A%84-swift-ios-app-%E9%96%8B%E7%99%BC%E5%95%8F%E9%A1%8C%E8%A7%A3%E7%AD%94%E9%9B%86/%E7%AC%AC%E4%B8%89%E6%96%B9-api-%E6%95%B4%E7%90%86-115868a56959
 * https://apilist.fun/
 * https://any-api.com/
 * https://rapidapi.com/hub
 * https://blog.jiatool.com/posts/dcard_api_v2/
 * https://www.postman.com/explore
 */

public class APICrawler {
    public static void main(String[] args) {
        try {
            String json = Jsoup.connect("https://dcard.tw/_api/posts").ignoreContentType(true).execute().body();
            //format json by https://jsoneditoronline.org/
            System.out.println(json);

            JSONArray resArray = new JSONArray(json);
            for (int i = 0; i < resArray.length(); i++)
            {
                String title = resArray.getJSONObject(i).getString("title");
                System.out.println(title);

            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
