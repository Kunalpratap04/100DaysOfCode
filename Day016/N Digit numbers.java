class Solution{
    static void problem(String string, ArrayList<Integer> list, int current, int N) {
        if (string.length() == N) {
            list.add(Integer.parseInt(string));
            return;
        }
        for (int i = (current + 1); i <= 57; i++) {
            problem((string + (char) i), list, i, N);
        }
    }

    static ArrayList<Integer> increasingNumbers(int N) {
        ArrayList<Integer> list = new ArrayList<>();
        String string = new String();
        if (N == 1) list.add(0);
        problem(string, list, 48, N);
        return list;
    }
        
    
}
