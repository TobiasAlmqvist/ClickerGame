import java.util.Scanner;

public class Click {

    public static double MouseClick(double tokens) {
        Scanner Input = new Scanner(System.in);
        String text = Input.nextLine();
        text = text.toLowerCase();
        if (text.equals("click")) {
            tokens++;
        }
        System.out.println("You have "+tokens+" amount of tokens");
        return tokens;
    }
}
