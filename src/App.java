import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class App {
    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("https://google.com").get();
            System.out.println(doc.title());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
