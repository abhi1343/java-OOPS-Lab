public class OOPSBannerApp {

    // Inner Class remains to hold the data
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

    public static void main(String[] args) {
        // Initialize the renderer data
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        
        // The core UC8 task: Rendering the banner
        renderBanner("OOPS", charMaps);
    }

    // UC8 logic: Building the full display line by line
    public static void renderBanner(String message, CharacterPatternMap[] charMaps) {
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder(); 
            for (char ch : message.toCharArray()) {
                line.append(findPattern(ch, charMaps)[i]).append(" ");
            }
            System.out.println(line.toString());
        }
    }

    // Helper to find the correct map for each character
    private static String[] findPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) return map.getPattern();
        }
        // Return blank spaces if character not found
        return new String[] {"      ", "      ", "      ", "      ", "      ", "      ", "      "};
    }

    public static CharacterPatternMap[] createCharacterPatternMaps() {
        return new CharacterPatternMap[] {
            new CharacterPatternMap('O', new String[]{"  *** ", " ** ** ", " ** ** ", " ** ** ", " ** ** ", " ** ** ", "  *** "}),
            new CharacterPatternMap('P', new String[]{" ***** ", " ** ** ", " ***** ", " ** ", " ** ", " ** ", " ** "}),
            new CharacterPatternMap('S', new String[]{" ***** ", " ** ", "  *** ", "    ** ", "    ** ", " ** ** ", " ***** "})
        };
    }
}