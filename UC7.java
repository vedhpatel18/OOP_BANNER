public class UC7 {
    static class CharacterPatternMap {
        char character;
        String[] pattern;

        CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
    }
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        return new CharacterPatternMap[]{

            new CharacterPatternMap('O', new String[]{
                    "   ***   ",
                    " **   ** ",
                    "**     **",
                    "**     **",
                    "**     **",
                    " **   ** ",
                    "   ***   "
            }),
            new CharacterPatternMap('P', new String[]{
                    " ****** ",
                    " **   **",
                    " **   **",
                    " ****** ",
                    " **     ",
                    " **     ",
                    " **     "
            }),
            new CharacterPatternMap('S', new String[]{
                    "   *****   ",
                    "  **       ",
                    "  ***      ",
                    "    *****  ",
                    "        ** ",
                    "  **    ** ",
                    "    *****  "
            })
        };
    }
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {

        for (CharacterPatternMap map : charMaps) {
            if (map.character == ch) {
                return map.pattern;
            }
        }

        return null;
    }
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        message = message.toUpperCase();

        int height = 7;  

        for (int row = 0; row < height; row++) {

            for (int i = 0; i < message.length(); i++) {

                String[] pattern = getCharacterPattern(message.charAt(i), charMaps);

                if (pattern != null) {
                    System.out.print(pattern[row] + "  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, charMaps);
    }
}