public class OOPSBannerApp {
    public static void main(String[] args) {
        // 1. Define a String array with size 7 (for the 7 lines of the banner)
        String[] lines = new String[7];

        // 2. Populate each index of the array using String.join()
        lines[0] = String.join("", "  *** ", "  *** ", " ***** ", " ***** ");
        lines[1] = String.join("", " ** **", " ** **", " ** ** ", " ** ");
        lines[2] = String.join("", " ** **", " ** **", " ***** ", "  *** ");
        lines[3] = String.join("", " ** **", " ** **", " ** ", "    ** ");
        lines[4] = String.join("", " ** **", " ** **", " ** ", "    ** ");
        lines[5] = String.join("", " ** **", " ** **", " ** ", " ** ** ");
        lines[6] = String.join("", "  *** ", "  *** ", " ** ", " ***** ");

        // 3. Use an enhanced for-loop to print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
