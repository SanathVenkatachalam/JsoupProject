import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;



public class App {
    public static void main(String[] args) throws IOException{
        // Connect to the website and fetch the HTML document
        //Document doc = Jsoup.connect("https://www.trustpilot.com/review/jbl.com").get();
        
        // Print the title of the page
        //System.out.println("Page Title: " + doc.title());
        
        // Try to extract the reviews (assuming they are in div elements with a specific class)
        // You will need to inspect the HTML and find the right CSS selector


        //we used canned data.
        String [] keywordsDog = {"puppy" , "stray", "little", "doggie","pup","chewed","spot","Dogs","fur","wolf","treats"};
        String [] keywordCat = {"kitten","kitty","cat"};
        String dogFood = "src/DogFood.txt";
        String review = "src/socialMediaPosts.txt";
        String catFood = "src/CatFood.txt";
        File file = new File(dogFood);
        FileWriter dog = new FileWriter(file,true);
        File fileTwo = new File(catFood);
        FileWriter cat = new FileWriter(fileTwo);
        File fileReview = new File(review);
        Scanner reviews = new Scanner(fileReview);
        reviews.useLocale(Locale.US);
        ArrayList<String> dogUsernames = new ArrayList<>();
        ArrayList<String> catUsernames = new ArrayList<>();
        while(reviews.hasNextLine()){
            String reviewToCheck = reviews.nextLine();
            for (String keyword : keywordsDog) {
                if (reviewToCheck.contains(keyword)) {
                    String[] splitedReview = reviewToCheck.split(" ");
                    dogUsernames.add(splitedReview[0]);
                    dog.write(reviewToCheck + "\n");
                    
                    break;
                }
            }
            for (String keyword : keywordCat) {
                if (reviewToCheck.contains(keyword)) {
                    String[] splitedReview = reviewToCheck.split(" ");
                    catUsernames.add(splitedReview[0]);
                    cat.write(reviewToCheck + "\n");
                    break;
                }
            }
        }
        dog.close();
        cat.close();
        System.out.println(dogUsernames);
        System.out.println(catUsernames);


        

        

        


        

        

    }
}



