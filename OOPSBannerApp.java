/**
 * OOPSBannerApp UC3 - OOPS Banner Application (Use Case 3)
 * This class improves efficiency by using String.join() instead of the + operator.
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
        // Each line is constructed using String.join(" ", ...) with individual segments
        // Following the 7-line format with 9-character width per letter
        
        System.out.println(String.join(" ", "  *** ", "  *** ", " ***** ", " ***** "));
        System.out.println(String.join(" ", " ** **", "** **", "** **", "** "));
        System.out.println(String.join(" ", " ** **", "** **", "** **", "** "));
        System.out.println(String.join(" ", " ** **", "** **", " ***** ", " ***** "));
        System.out.println(String.join(" ", " ** **", "** **", "** ", "     **"));
        System.out.println(String.join(" ", " ** **", "** **", "** ", "     **"));
        System.out.println(String.join(" ", "  *** ", "  *** ", "** ", " ***** "));
    }
}
