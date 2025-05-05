class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>(52);

        for (int i = 0; i < s.length(); ++i) {
            frequencyMap.merge(s.charAt(i), 1, Integer::sum);
        }

        List<Character> characters = new ArrayList<>(frequencyMap.keySet());
      
        characters.sort((a, b) -> frequencyMap.get(b) - frequencyMap.get(a));
      
        StringBuilder sortedString = new StringBuilder();
      
        for (char c : characters) {
            for (int frequency = frequencyMap.get(c); frequency > 0; --frequency) {
                sortedString.append(c);
            }
        }
      
        return sortedString.toString();

    }
}