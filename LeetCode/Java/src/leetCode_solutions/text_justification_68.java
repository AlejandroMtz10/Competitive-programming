/*
 *      Problem: Text jutification.
 *      No: 68.
 *      Difficult: Hard.
 *      Topics: Array, string & simulation.
 *      Company: Airbnb. 
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int n = words.length;
        int i = 0; // Current word index

        while (i < n) {
            List<String> currentLine = new ArrayList<>();
            int currentLineLength = 0;
            int j = i;

            // Greedily pack words into the current line
            while (j < n && currentLineLength + words[j].length() + currentLine.size() <= maxWidth) {
                currentLine.add(words[j]);
                currentLineLength += words[j].length();
                j++;
            }

            // Calculate remaining spaces
            int totalWordsInLine = currentLine.size();
            int extraSpaces = maxWidth - currentLineLength;

            // Handle the last line or a line with a single word (left-justified)
            if (j == n || totalWordsInLine == 1) {
                String line = String.join(" ", currentLine);
                result.add(rightPad(line, maxWidth));
            } else {
                // Fully justify the line
                int gaps = totalWordsInLine - 1;
                int spacesPerGap = extraSpaces / gaps;
                int extraSpacesLeft = extraSpaces % gaps;
                StringBuilder justifiedLine = new StringBuilder();

                for (int k = 0; k < totalWordsInLine; k++) {
                    justifiedLine.append(currentLine.get(k));
                    if (k < totalWordsInLine - 1) {
                        // Add base spaces
                        for (int l = 0; l < spacesPerGap; l++) {
                            justifiedLine.append(" ");
                        }
                        // Add extra space to leftmost gaps if needed
                        if (extraSpacesLeft > 0) {
                            justifiedLine.append(" ");
                            extraSpacesLeft--;
                        }
                    }
                }
                result.add(justifiedLine.toString());
            }

            i = j; // Move to the next line's starting word
        }

        return result;
    }

    // Helper function to right-pad a string with spaces to a specific width.
    private String rightPad(String s, int width) {
        StringBuilder sb = new StringBuilder(s);
        while (sb.length() < width) {
            sb.append(" ");
        }
        return sb.toString();
    }
}