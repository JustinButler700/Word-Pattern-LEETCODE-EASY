class Solution(object):
    def wordPattern(self, pattern, s):
        mapPattern = {} 
        myWords = s.split(' ')
        if(len(myWords)!=len(pattern)): 
            return False
        #first, we will map each char in the pattern to the word it is associated with
        for i in range(len(pattern)):
            if pattern[i] not in mapPattern.values(): #Each char must be mapped as a unique value, if its already mapped, we ignore it.
                 mapPattern[myWords[i]] = pattern[i]
        #Now that it is mapped, we will verify that it follows the wordPattern.
        for i in range(len(pattern)):
            if not mapPattern.has_key(myWords[i]) or mapPattern[myWords[i]] != pattern[i]:
                return False
        return True
