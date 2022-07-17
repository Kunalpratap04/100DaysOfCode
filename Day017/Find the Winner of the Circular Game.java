class Solution {
    public int helper(List<Integer> players, int k, int index){
        int size = players.size();
        if(size == 1) 
        {
            return players.get(0);
        }
        int newIndex = (index + k) % size - 1;
        
        if(newIndex == -1) 
        {
            newIndex = size - 1;
        }
        players.remove(newIndex);
        if(newIndex == players.size())
        {
            newIndex = 0; 
        }
        return helper(players, k, newIndex);
    }
    
    public int findTheWinner(int n, int k) {
        List<Integer> players = new ArrayList<>();
        for(int i = 1; i <= n; i++) 
        {
            players.add(i);
        }
        return helper(players, k, 0);
    }
}
