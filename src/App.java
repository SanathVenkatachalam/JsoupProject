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
        //Document doc = Jsoup.connect("https://www.trustpilot.com/review/jbl.com").get();
        


        //we used canned data.(SocialMediaPosts.txt)

        //assign keywords to each category of pet ( for this we are using dogs and cats)
        String [] keywordsDog = {"puppy" , "stray", "little", "doggie","pup","chewed","spot","Dogs","fur","wolf","treats"};
        String [] keywordCat = {"kitten","kitty","cat"};
        //initialize the file names
        String dogFood = "src/DogFood.txt";
        String review = "src/socialMediaPosts.txt";
        String catFood = "src/CatFood.txt";
        //create files and writers for that file(this is for the adding process)
        File file = new File(dogFood);
        FileWriter dog = new FileWriter(file,true);
        File fileTwo = new File(catFood);
        FileWriter cat = new FileWriter(fileTwo);
        File fileReview = new File(review);
        Scanner reviews = new Scanner(fileReview);
        reviews.useLocale(Locale.US);
        //initialize the username lists for advertisements
        ArrayList<String> dogUsernames = new ArrayList<>();
        ArrayList<String> catUsernames = new ArrayList<>();
        //loop through the data and see if the reviews have the keywords in them.
        while(reviews.hasNextLine()){
            String reviewToCheck = reviews.nextLine();
            for (String keyword : keywordsDog) {
                if (reviewToCheck.contains(keyword)) {
                    String[] splitedReview = reviewToCheck.split(" ");
                    //single out the username and grab it.
                    dogUsernames.add(splitedReview[0]);
                    dog.write(reviewToCheck + "\n");
                    break;
                }
            }
            for (String keyword : keywordCat) {
                if (reviewToCheck.contains(keyword)) {
                    String[] splitedReview = reviewToCheck.split(" ");
                    //single out the username and grab it.
                    catUsernames.add(splitedReview[0]);
                    cat.write(reviewToCheck + "\n");
                    break;
                }
            }
        }
        dog.close();
        cat.close();
        //Display the advertisements
        //Dog owner ads.
        System.out.println("Dog Owners");
        System.out.println();
        for(String username : dogUsernames){
            //advertisement will appeal to EACH individual username on the review.
            System.out.println( username + "Buy out premuim canned dog food now. Taste that will attract a house full of them. So healthy that they will grow as big as a wolf. Comes with a raffle to win a free doggie hotel!");
            System.out.println();
        }
        //Cat owner ads.
        System.out.println();
        System.out.println("Cat Owners");
        System.out.println();


        for(String username : catUsernames){
            //advertisement will appeal to EACH individual username on the review.
            System.out.println( username + "Buy our rich and premium at food today! This food is so tastey that your little kitten friends will stop tearing up your shoes!");
            System.out.println();
        }




        

        

        


        

        

    }
}



