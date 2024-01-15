public class TextCleaning {
    public static void main(String[] args) {
        String originalText = "Roses are red. Violets are blue, Sugar is sweet... And so are you.";
        System.out.println("Original: " + originalText);

        String cleanedText = cleanText(originalText);
        System.out.println("Cleaned: " + cleanedText);
    }

    public static String cleanText(String content) {
        StringBuilder cleanedContent = new StringBuilder();

        for (char ch : content.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch) || Character.isDigit(ch) || ch == ' ') {
                cleanedContent.append(ch);
            }
        }

        return cleanedContent.toString();
    }
}
