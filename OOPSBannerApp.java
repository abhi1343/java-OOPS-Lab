public class OOPSBannerApp {
    public static void main(String[] args) {
        // 1. Inline Initialization: Declare and populate the array in one step
        String[] lines = {
            String.join("", "  *** ", "  *** ", " ***** ", " ***** "),
            String.join("", " ** ** ", " ** ** ", " ** ** ", " ** "),
            String.join("", " ** ** ", " ** ** ", " ***** ", "  *** "),
            String.join("", " ** ** ", " ** ** ", " ** ", "    ** "),
            String.join("", " ** ** ", " ** ** ", " ** ", "    ** "),
            String.join("", " ** ** ", " ** ** ", " ** ", " ** ** "),
            String.join("", "  *** ", "  *** ", " ** ", " ***** ")
        };

        // 2. Use an enhanced for-loop to print the results (same as UC4)
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
