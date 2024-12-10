import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        // Connect to the website and fetch the HTML document
        Document doc = Jsoup.connect("https://www.jbl.com/bluetooth-speakers/CLIP-5.html?cgid=bluetooth-speakers").get();
        
        // Print the title of the page
        System.out.println("Page Title: " + doc.title());
        
        // Try to extract the reviews (assuming they are in div elements with a specific class)
        // You will need to inspect the HTML and find the right CSS selector
        Elements reviewElements = doc.select(".bv-rnr__sc-16dr7i1-14 fKdXxQ");  // Update this selector based on actual site structure

        // Check if reviews exist and print them
        if (!reviewElements.isEmpty()) {
            for (Element review : reviewElements) {
                System.out.println("Review: " + review.text());
            }
        } else {
            System.out.println("No reviews found or the structure may be dynamic.");
            System.out.println(doc);
        }
    }
}



