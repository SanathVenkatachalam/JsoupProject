import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;


public class App {
    public static void main(String[] args) throws IOException {
        // Connect to the website and fetch the HTML document
        Document doc = Jsoup.connect("https://www.trustpilot.com/review/jbl.com").get();
        
        // Print the title of the page
        System.out.println("Page Title: " + doc.title());
        
        // Try to extract the reviews (assuming they are in div elements with a specific class)
        // You will need to inspect the HTML and find the right CSS selector

        String [] keywords = {""}
        

    }
}



