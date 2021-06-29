class Result {

    public static String gridSearch(List<String> G, List<String> P) {
        
    String StringReturn = null;
    
  List<Integer> ListIndex = new ArrayList<>();
  
for (int i = 0; i < P.size(); i++) {
    int finalI = i;
    if(!(G.stream().anyMatch(x -> x.contains(P.get(finalI)))))
    {
     StringReturn = "NO";
     break;
}
   if(G.stream().anyMatch(x -> x.contains(P.get(finalI))))
   {
       StringReturn = "YES";
   }
   if (G.stream().anyMatch(x -> x.contains(P.get(finalI)+1)))
   {
      StringReturn = "NO";
      
   }
}



  return StringReturn;

    }

}