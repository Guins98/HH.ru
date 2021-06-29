class Result {
    
    private static ArrayList<Integer> rankList = new ArrayList<>();

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        
       ranked = ranked.stream().distinct().collect(Collectors.toList());
       int rankMin = ranked.stream().min(Integer::compare).get();
       int rankMax = ranked.stream().max(Integer::compare).get();
            for (Integer integer : player) {
  
            for (int j = 0; j < ranked.size(); j++) {

                if (rankMax < integer){
                rankList.add(ranked.indexOf(ranked.get(j)) + 1);
                break;}
                else if ( rankMin > integer){
                    rankList.add(ranked.size() + 1);
                    break;}

                 else if (integer.equals(ranked.get(j))) {
                    rankList.add(ranked.indexOf(ranked.get(j)) + 1);
                    break;
                    
                } else if (integer > ranked.get(j) & ranked.indexOf(ranked.get(j)) != 0) {
                    rankList.add(ranked.indexOf(ranked.get(j)) + 1);
                    break;
                }

            }
        }
        return rankList;
    }

}