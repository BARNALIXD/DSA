public String twoStrings(String s1, String s2) {
    Set<Character> s1Set = new Hashset<>();
    Set<Character> s2Set = new Hashset<>();

    //creating the set of string1
    for(char c : s1.toChararray()){
     s1Set.add(c);
    }

for(char c : s2.toChararray()){
     s1Set.add(c);
    }

    //store the set intersection in set1
    s1Set.retainAll(s2Set);

    if(!s1Set.isEmpty())
    return "YES";

    return "NO";

}