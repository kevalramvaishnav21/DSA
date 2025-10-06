import java.util.Scanner;

public class Line {

    public static void main(String[] args) {
        String menu[] = { "Idli", "Dosa", "Kabuli", "Haka-Noodles", "Chole-Bhature", "Pizza" };

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the item you want to search:");
        String item = sc.next();

        boolean found = false;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(item)) { // ignores case (optional)
                found = true;
                break; // stop loop once found
            }
        }

        if (found) {
            System.out.println(" Your item exists in the menu!");
        } else {
            System.out.println(" Your item is not in the menu.");
        }

        sc.close();
    }
}
