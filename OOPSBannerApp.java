public class OOPSBannerApp {

    // Part 2 — Inner Static Class to encapsulate character data
    static class CharacterPatternMap {
        private Character character;
        private String[] pattern;

        // Constructor to initialize state
        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getters to access private fields (Encapsulation)
        public Character getCharacter() { return character; }
        public String[] getPattern() { return pattern; }
    }

    // Part 3 — Utility Static Methods
    public static CharacterPatternMap[] createCharacterPatternMaps() {
        return new CharacterPatternMap[] {
            new CharacterPatternMap('O', new String[]{"  *** ", " ** ** ", " ** ** ", " ** ** ", " ** ** ", " ** ** ", "  *** "}),
            new CharacterPatternMap('P', new String[]{" ***** ", " ** ** ", " ***** ", " ** ", " ** ", " ** ", " ** "}),
            new CharacterPatternMap('S', new String[]{" ***** ", " ** ", "  *** ", "    ** ", "    ** ", " ** ** ", " ***** "})
        };
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) return map.getPattern();
        }
        return new String[] {"         ", "         ", "         ", "         ", "         ", "         ", "         "};
    }

    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();
            for (char ch : message.toCharArray()) {
                line.append(getCharacterPattern(ch, charMaps)[i]).append(" ");
            }
            System.out.println(line.toString());
        }
    }

    // Part 4 — Main Method
    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        printMessage("OOPS", charMaps);
    }
}