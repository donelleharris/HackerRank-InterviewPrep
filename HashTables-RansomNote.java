// Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        Map<String, Integer> magHash = new HashMap<String, Integer>();
        Map<String, Integer> noteHash = new HashMap<String, Integer>();
        
        for(int i = 0; i < magazine.length; i++){
            if(magHash.containsKey(magazine[i])){
                magHash.put(magazine[i], magHash.get(magazine[i]) + 1);
            } else {
                magHash.put(magazine[i], 1);
            }
        }
        for(int i = 0; i < note.length; i++){
            if(noteHash.containsKey(note[i])){
                noteHash.put(note[i], noteHash.get(note[i]) + 1);
            } else {
                noteHash.put(note[i], 1);
            }
        }
        
        for(String word : noteHash.keySet()){
            if(!magHash.containsKey(word)){
                System.out.println("No");
                return;
            }
            
            if(magHash.get(word) < noteHash.get(word)){
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
        return;
    }