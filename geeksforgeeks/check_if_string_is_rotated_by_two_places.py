#User function Template for python3

'''
    Your task is to check if the given string can be obtained
    by rotating other string 'p' by two places.

    Function Arguments: s (given string), p(string to be rotated)
    Return Type: boolean

'''
def isRotated(s,p):
    #code here
    x = p[2:] + p[:2]
    y = p[len(p)-2:]+p[:len(p)-2]
    
    if s == x or s == y:
        return 1
    return 0
    


#{ 
#  Driver Code Starts
#Initial Template for Python 3

import atexit
import io
import sys

_INPUT_LINES = sys.stdin.read().splitlines()
input = iter(_INPUT_LINES).__next__
_OUTPUT_BUFFER = io.StringIO()
sys.stdout = _OUTPUT_BUFFER

@atexit.register

def write():
    sys.__stdout__.write(_OUTPUT_BUFFER.getvalue())

if __name__=='__main__':
    t = int(input())
    for i in range(t):
        s=str(input())
        p=str(input())
        if(isRotated(s,p)):
            print(1)
        else:
            print(0)
# } Driver Code Ends