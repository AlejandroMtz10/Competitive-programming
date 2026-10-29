import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MegaInversions_ 3248 {
    // Fenwick Tree (Binary Indexed Tree) for efficient O(log N) frequency queries
    static class FenwickTree {
        int[] tree;
        int size;

        FenwickTree(int n) {
            this.size = n;
            this.tree = new int[n + 1]; // 1-based indexing for BIT operations
        }

        // Add delta to elements at and above index i
        void update(int i, int delta) {
            while (i <= size) {
                tree[i] += delta;
                i += i & (-i); // Isolates the lowest set bit
            }
        }

        // Get prefix sum from index 1 to i
        int query(int i) {
            int sum = 0;
            while (i > 0) {
                sum += tree[i];
                i -= i & (-i); // Clears the lowest set bit
            }
            return sum;
        }
    }

    public static void main(String[] args) throws IOException {
        // Fast I/O: BufferedReader + StringTokenizer prevents TLE with N = 10^5
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        if (line == null) return;
        
        int n = Integer.parseInt(line.trim());
        int[] data = new int[n];
        
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            data[i] = Integer.parseInt(tokenizer.nextToken());
        }

        // Maintain frequency trees for elements to the left and right of the pivot
        FenwickTree leftTree = new FenwickTree(n);
        FenwickTree rightTree = new FenwickTree(n);

        // Populate the right tree with all elements initially
        for (int i = 0; i < n; i++) {
            rightTree.update(data[i], 1);
        }

        // Use long to prevent integer overflow; max triples can reach ~O(N^3) combinations
        long totalTriples = 0;

        // Process each element as the potential middle element (j) of the triple
        for (int j = 0; j < n; j++) {
            int pivotValue = data[j];

            // Exclude current element from the right side before counting
            rightTree.update(pivotValue, -1);

            // Elements to the left that are strictly greater than pivotValue
            long greaterLeft = j - leftTree.query(pivotValue);

            // Elements to the right that are strictly smaller than pivotValue
            long smallerRight = rightTree.query(pivotValue - 1);

            // Combinations = (Valid Left Choices) * (Valid Right Choices)
            totalTriples += greaterLeft * smallerRight;

            // Include current element to the left side for subsequent iterations
            leftTree.update(pivotValue, 1);
        }

        System.out.println(totalTriples);
    }
}
