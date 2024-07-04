/*
Method 1:
*/
class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] answer = new String[score.length];
        int maxScore = -1;

        for (int num : score) {
            maxScore = Math.max(maxScore, num);
        }

        int[] scoreIdx = new int[maxScore + 1];

        Arrays.fill(scoreIdx, -1);

        for (int i = 0; i < score.length; i++) {
            scoreIdx[score[i]] = i;
        }

        String[] medals = {"Gold Medal", "Silver Medal", "Bronze Medal"};

        int index = 0;
        int place = 1;

        for (int i = scoreIdx.length - 1; i >= 0; i--) {
            if (scoreIdx[i] != -1) {
                if (place <= 3) {
                    answer[scoreIdx[i]] = medals[place - 1];
                } else {
                    answer[scoreIdx[i]] = String.valueOf(place);
                }
                place++;
            }  
        }

        return answer;
    }
}


/*
Method 2.0
*/
/*
class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] answer = new String[score.length];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < score.length; i++) {
            map.put(score[i], i);
        }

        Arrays.sort(score);

        int index = 0;

        for (int i = score.length - 1; i >= 0; i--) {
            if (index == 0) {
                answer[map.get(score[i])] = "Gold Medal";
            } else if (index == 1) {
                answer[map.get(score[i])] = "Silver Medal";
            } else if (index == 2) {
                answer[map.get(score[i])] = "Bronze Medal";
            } else {
                answer[map.get(score[i])] = (index + 1) +  "";
            }

            index++;
            
        }

        return answer;
    }
}
*/


/*
Method 2.1
*/
/*
class Solution {
    public String[] findRelativeRanks(int[] score) {
        Map<Integer, Integer> map = new HashMap<>();
        String[] result = new String[score.length];

        int [] sorted = Arrays.copyOf(score, score.length);
        Arrays.sort(sorted);
        int ranking = 1;

        for (int i = score.length - 1; i >= 0; i--) {
            map.put(sorted[i], ranking);
            ranking++;
        }

        for (int i = 0; i < score.length; i++) {
            int rank = map.get(score[i]);
            if (rank == 1) {
                result[i] = "Gold Medal";
            } else if (rank == 2) {
                result[i] = "Silver Medal";
            } else if (rank == 3) {
                result[i] = "Bronze Medal";
            } else {
                result[i] = String.valueOf(rank);
            }
        }
        return result;

    }
}
*/