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
        String [] keywordCat = {"kitten"};
        //FileWriter dogWriter = new FileWriter("DogFood.txt");
        String dogFood = "src/DogFood.txt";
        String review = "src/socialMediaPosts.txt";
        String catFood = "src/CatFood.txt";
        File file = new File(dogFood);
        FileWriter dog = new FileWriter(file,true);
        File fileReview = new File(review);
        Scanner reviews = new Scanner(fileReview);
        reviews.useLocale(Locale.US);
        





        while(reviews.hasNextLine()){
            String reviewToCheck = reviews.nextLine();
            for (String keyword : keywordsDog) {
                if (reviewToCheck.contains(keyword)) {
                    dog.write(reviewToCheck + "\n");
                    System.out.println("Writing review: " + reviewToCheck);
                    
                    break;
                }
            }
            
    

        }
        dog.close();

        

        

    }
}



