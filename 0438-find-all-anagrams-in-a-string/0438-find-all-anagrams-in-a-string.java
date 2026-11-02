class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length()){
            return result;
        }
        HashMap<Character,Integer> mapS = new HashMap<>();
        HashMap<Character,Integer> mapP = new HashMap<>();

        for(int i = 0; i<p.length();i++){
            char ch  = p.charAt(i);
            mapP.put(ch, mapP.getOrDefault(ch, 0) + 1);
        }

        int k  = p.length();

        for(int i = 0;i<k;i++){
            char ch  = s.charAt(i);
            mapS.put(ch, mapS.getOrDefault(ch, 0) + 1);

        }

        if (mapP.equals(mapS)) {
            result.add(0);
        }

        for(int i = k ; i<s.length();i++){
            char outgoing = s.charAt(i - k);

            mapS.put(outgoing, mapS.get(outgoing) - 1);
            if (mapS.get(outgoing) == 0) {
                mapS.remove(outgoing);
            }

            char incoming = s.charAt(i);

            mapS.put(incoming, mapS.getOrDefault(incoming, 0) + 1);

            if (mapP.equals(mapS)) {
                result.add(i - k + 1);
            }
        
        }
        return result;


    }
}