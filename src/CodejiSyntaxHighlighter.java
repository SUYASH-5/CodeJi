package src;

import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.model.StyleSpans;
import org.fxmisc.richtext.model.StyleSpansBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Collections;
import java.util.Collection;

public class CodejiSyntaxHighlighter {

        // Added new keywords like AGAR, NAHI_AGAR, NAHI_TO, KHATM etc.
        private static final String[] KEYWORDS = {
                        "pataHai", "rakhDo", "bolna", "thikHai", "sahiMe", "kuchNahi", "padhle",
                        "agar", "nahi_agar", "nahi_to", "khatm", "likhna", "jabtak"
        };

        // Added new comparators / operators: bada, chhota, barabar, bada_ya_barabar,
        // chhota_ya_barabar, nahi_barabar
        private static final String[] OPERATORS = {
                        "jodwa", "ghatawa", "gunak", "bataak", "remainderwa", "powerwa",
                        "bada", "chhota", "barabar", "bada_ya_barabar", "chhota_ya_barabar", "nahi_barabar"
        };

        private static final Pattern KEYWORD_PATTERN = Pattern.compile("\\b(" + String.join("|", KEYWORDS) + ")\\b");
        private static final Pattern OPERATOR_PATTERN = Pattern.compile("\\b(" + String.join("|", OPERATORS) + ")\\b");
        private static final Pattern STRING_PATTERN = Pattern.compile("\"([^\"\\\\]|\\\\.)*\"");
        private static final Pattern NUMBER_PATTERN = Pattern.compile("\\b\\d+(\\.\\d+)?\\b");
        private static final Pattern COMMENT_PATTERN = Pattern.compile("//[^\n]*|/\\*(.|\\R)*?\\*/");

        private static final Pattern PATTERN = Pattern.compile(
                        "(?<KEYWORD>" + KEYWORD_PATTERN.pattern() + ")"
                                        + "|(?<OPERATOR>" + OPERATOR_PATTERN.pattern() + ")"
                                        + "|(?<STRING>" + STRING_PATTERN.pattern() + ")"
                                        + "|(?<NUMBER>" + NUMBER_PATTERN.pattern() + ")"
                                        + "|(?<ID>\\b[a-zA-Z_][a-zA-Z0-9_]*\\b)"
                                        + "|(?<COMMENT>" + COMMENT_PATTERN.pattern() + ")");

        public static void applyHighlighting(CodeArea codeArea) {
                codeArea.textProperty().addListener((obs, oldText, newText) -> {
                        codeArea.setStyleSpans(0, computeHighlighting(newText));
                });
        }

        private static StyleSpans<Collection<String>> computeHighlighting(String text) {
                Matcher matcher = PATTERN.matcher(text);
                int lastEnd = 0;
                StyleSpansBuilder<Collection<String>> spansBuilder = new StyleSpansBuilder<>();

                while (matcher.find()) {
                        String styleClass = matcher.group("KEYWORD") != null ? "keyword"
                                        : matcher.group("OPERATOR") != null ? "operator"
                                                        : matcher.group("STRING") != null ? "string"
                                                                        : matcher.group("NUMBER") != null ? "number"
                                                                                        : matcher.group("ID") != null
                                                                                                        ? "id"
                                                                                                        : matcher.group("COMMENT") != null
                                                                                                                        ? "comment"
                                                                                                                        : null;
                        assert styleClass != null;
                        spansBuilder.add(Collections.emptyList(), matcher.start() - lastEnd);
                        spansBuilder.add(Collections.singleton(styleClass), matcher.end() - matcher.start());
                        lastEnd = matcher.end();
                }
                spansBuilder.add(Collections.emptyList(), text.length() - lastEnd);
                return spansBuilder.create();
        }
}
