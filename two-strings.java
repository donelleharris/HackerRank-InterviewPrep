// Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        Set<Character> s1Set = new HashSet<>();
        Set<Character> s2Set = new HashSet<>();
        
        for(char c : s1.toCharArray()){
            s1Set.add(c);
        }
        for(char c : s2.toCharArray()){
            s2Set.add(c);
        }
        s1Set.retainAll(s2Set);
        
        if(!s1Set.isEmpty())
            return "YES";
        
        return "NO";
    }