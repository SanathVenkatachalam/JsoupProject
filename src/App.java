import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;


public class App {
    public static void main(String[] args) throws IOException {
        // Connect to the website and fetch the HTML document
        Document doc = Jsoup.connect("https://www.trustpilot.com/review/jbl.com").get();
        
        // Print the title of the page
        //System.out.println("Page Title: " + doc.title());
        
        // Try to extract the reviews (assuming they are in div elements with a specific class)
        // You will need to inspect the HTML and find the right CSS selector

        String [] keywordsDog = {"puppy" , "barking", "stray", "cute", "little", "doggie","pup","chewed","spot"};
        FileWriter dogWriter = new FileWriter("DogFood.txt");
        File file = new File("C:\\Users\\5\\Documents\\Github\\JsoupProject\\src\\socialMediaPosts.txt");
        Scanner reviews = new Scanner(file);
        reviews.useLocale(Locale.US);
        //String review = reviews.nextLine();
        //System.out.println(reviewOne);




        while(reviews.hasNextLine()){
            
            System.out.println(reviews.nextLine());
        }

        

        

    }
}



