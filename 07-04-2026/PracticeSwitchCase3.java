import java.lang.*;
import java.util.*;


class PracticeSwitchCase3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your website URL:");
        String url = scanner.nextLine();
        String domain = url.substring(url.lastIndexOf(".") + 1);
        switch (domain) {
            case "com":
                System.out.println("Commercial website");
                break;
            case "org":
                System.out.println("Organization website");
                break;
            case "net":
                System.out.println("Network website");
                break;
            case "edu":
                System.out.println("Educational website");
                break;
            case "gov":
                System.out.println("Government website");
                break;
            case "in":
                System.out.println("Indian website");
                break;
            default:
                System.out.println("Unknown domain");
                break;
        }   
        scanner.close();
    }
}