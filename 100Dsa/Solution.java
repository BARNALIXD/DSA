public class Solution {
    public int isCircle(String arr[]) {
       int n = arr.length;
       if (n == 0) return 0;
       
       // Arrays for in-degree, out-degree, and adjacency list
       int[] inDegree = new int[26];
       int[] outDegree = new int[26];
       List<List<Integer>> adj = new ArrayList<>();
       
       for (int i = 0; i < 26; i++) adj.add(new ArrayList<>());

       // Build graph based on first and last character of strings
       for (String word : arr) {
           int start = word.charAt(0) - 'a';
           int end = word.charAt(word.length() - 1) - 'a';
           outDegree[start]++;
           inDegree[end]++;
           adj.get(start).add(end);
       }

       for (int i = 0; i < 26; i++) {
           if (inDegree[i] != outDegree[i]) return 0;
       }

       // Perform DFS to check strong connectivity
       boolean[] visited = new boolean[26];
       int start = arr[0].charAt(0) - 'a';
       dfs(start, adj, visited);
       
       for (int i = 0; i < 26; i++) {
           if (outDegree[i] > 0 && !visited[i]) return 0;
       }

       return 1;
   }

   private void dfs(int node, List<List<Integer>> adj, boolean[] visited) {
       visited[node] = true;
       for (int neighbor : adj.get(node)) {
           if (!visited[neighbor]) dfs(neighbor, adj, visited);
       }
   }
} circleofstrings {
    
}
