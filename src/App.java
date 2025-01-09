import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileReader;
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

        String [] keywordsDog = {"puppy" , "stray", "little", "doggie","pup","chewed","spot"};
        //FileWriter dogWriter = new FileWriter("DogFood.txt");
        File file = new File("C:\\Users\\5\\Documents\\Github\\JsoupProject\\src\\DogFood.txt");
        FileWriter dog = new FileWriter(file);
        File fileReview = new File("C:\\Users\\5\\Documents\\Github\\JsoupProject\\src\\socialMediaPosts.txt");
        Scanner reviews = new Scanner(fileReview);
        reviews.useLocale(Locale.US);
        //String review = reviews.nextLine();
        //System.out.println(reviewOne);
        //dog.write("Hello");





        while(reviews.hasNextLine()){
            String reviewToCheck = reviews.nextLine();
            for (String keyword : keywordsDog) {
                if (reviewToCheck.contains(keyword)) {
                    System.out.println(reviewToCheck+ " This review has dogs");
                    break;
                }
            }
    

        }

        

        

    }
}



