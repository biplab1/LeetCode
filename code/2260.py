class Solution:
    def minimumCardPickup(self, cards: List[int]) -> int:
        d = {}
        minim = 1e8
        for i in range(len(cards)):
            if cards[i] in d:
                minim = min(minim, i - d[cards[i]] + 1)
            d[cards[i]] = i
            
        if minim == 1e8:
            return -1
        else:
            return minim