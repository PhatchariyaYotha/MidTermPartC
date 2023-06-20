/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author phatchariyaaa
 */
import java.util.Scanner;

public class TestUserProfile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Choose your favorite genre: ");
        System.out.println("1. Action");
        System.out.println("2. Adventure");
        System.out.println("3. Comedy");
        System.out.println("4. Drama");

        int genrechoice = input.nextInt();
        String genre;

        switch (genrechoice) {
            case 1:
                genre = "Action";
                break;
            case 2:
                genre = "Adventure";
                break;
            case 3:
                genre = "Comedy";
                break;
            case 4:
                genre = "Drama";
                break;
            default:
                genre = "Unknown";
                break;
        }

        System.out.println("User profile created!");
        System.out.println("Name: " + name);
        System.out.println("Favorite Genre: " + genre);

    }

}
