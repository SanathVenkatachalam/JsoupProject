import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;



public class App {
    public static void main(String[] args) throws IOException {
        // Connect to the website and fetch the HTML document
        Document doc = Jsoup.connect("https://www.amazon.com/JBL-Eco-Bluetooth-Built-Waterproof/dp/B0BT38PTX7/ref=hw_24_h_dagw_e?pf_rd_p=26290ea5-cfa9-4140-b8b4-0bfbf3e2e7c7&pf_rd_r=9EEE8A59NP8KSTC2W8BV&sr=1-4-89556722-658b-43d0-b531-2e77ecd07bb2&th=1").get();
        // Print the title of the page
        System.out.println("Page Title: " + doc.title());
       
    }
}


