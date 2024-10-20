public class dsaprob1 {
    public static void main(String[] args) {
        String[] arr = { "add", "boook", "break" };
        int ans[] = adjacent(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

    }

    public static int[] adjacent(String[] arr) {
        int res[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            String word = arr[i].toLowerCase();
            int[] frq = new int[26];
            int a = 0;
            for (int j = 0; j < word.length(); j++) {
                frq[word.charAt(j) - 97]++;

            }
            for (int k = 0; k < 26; k++) {
                if (frq[k] > 1)
                    a += frq[k] / 2;
            }
            res[i] = a;
        }
        return res;
    }
}