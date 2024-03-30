import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Привет! Введи любое предложение и я узнаю самое длинное слово.");
        String text = in.nextLine();
        String word[] = text.split(" ");
        int largestStringI = word[0].length();
        String largestString = word[0];

        for(int i = 1; i < word.length; i++)
        {
            if(word[i].length() > largestStringI)
            {
                largestString = word[i];
            }

        }
        System.out.println("Самое длинное слово - " +" " + largestString);
    }
}