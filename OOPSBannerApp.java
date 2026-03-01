public class OOPSBannerApp {

    // Step 1: The Inner Static Class to encapsulate data
    static class CharacterPatternMap {
        private Character character;
        private String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public Character getCharacter() { return character; }
        public String[] getPattern() { return pattern; }
    }

    // Step 2: Utility method to initialize the maps
    public static CharacterPatternMap[] createCharacterPatternMaps() {
        return new CharacterPatternMap[] {
            new CharacterPatternMap('O', new String[]{"  *** ", " ** ** ", " ** ** ", " ** ** ", " ** ** ", " ** ** ", "  *** "}),
            new CharacterPatternMap('P', new String[]{" ***** ", " ** ** ", " ***** ", " ** ", " ** ", " ** ", " ** "}),
            new CharacterPatternMap('S', new String[]{" ***** ", " ** ", "  *** ", "    ** ", "    ** ", " ** ** ", " ***** "})
        };
    }

    // Step 3: Method to render the message using the maps
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder(); // For efficient concatenation
            for (char ch : message.toCharArray()) {
                for (CharacterPatternMap map : charMaps) {
                    if (map.getCharacter() == ch) {
                        line.append(map.getPattern()[i]).append(" ");
                    }
                }
            }
            System.out.println(line.toString());
        }
    }

    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        printMessage("OOPS", charMaps);
    }
}