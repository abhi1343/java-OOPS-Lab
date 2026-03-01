public class OOPSBannerApp {

    public static void main(String[] args) {
        // Step 2: Call helper methods to get character patterns
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Step 3: Loop to assemble and print each line
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(oPattern[i] + " " + oPattern[i] + " " + pPattern[i] + " " + sPattern[i]);
        }
    }

    // Step 1: Define Static Helper Methods for each character
    public static String[] getOPattern() {
        return new String[] {
            "  *** ", " ** ** ", " ** ** ", " ** ** ", " ** ** ", " ** ** ", "  *** "
        };
    }

    public static String[] getPPattern() {
        return new String[] {
            " ***** ", " ** **", " ***** ", " ** ", " ** ", " ** ", " ** "
        };
    }

    public static String[] getSPattern() {
        return new String[] {
            " ***** ", " ** ", "  *** ", "    ** ", "    ** ", " ** **", " ***** "
        };
    }
}