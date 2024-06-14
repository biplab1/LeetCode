

# Method 1:
'''
    Your task is to return the index of the pattern
    present in the given string.
    
    Function Arguments: s (given text), p(given pattern)
    Return Type: Integer.
    
'''
def strstr(s,p):
    #code here
    lp = len(p)
    for i in range(len(s) - lp + 1):
        if s[i:i+lp] == p:
            return i
    return -1
        



#{ 
#  Driver Code Starts
#Contributed by : Nagendra Jha

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

if __name__ == '__main__':
    t=int(input())
    for cases in range(t):
        s,p =input().strip().split()
        print(strstr(s,p))


# } Driver Code Ends

# Method 2:
# '''
#     Your task is to return the index of the pattern
#     present in the given string.
    
#     Function Arguments: s (given text), p(given pattern)
#     Return Type: Integer.
    
# '''
# def strstr(s,p):
#     #code here
    
#     for i in range(len(s) - len(p) + 1):
#         if s[i:i+len(p)] == p:
#             return i
#     return -1
        



# #{ 
# #  Driver Code Starts
# #Contributed by : Nagendra Jha

# import atexit
# import io
# import sys

# _INPUT_LINES = sys.stdin.read().splitlines()
# input = iter(_INPUT_LINES).__next__
# _OUTPUT_BUFFER = io.StringIO()
# sys.stdout = _OUTPUT_BUFFER

# @atexit.register

# def write():
#     sys.__stdout__.write(_OUTPUT_BUFFER.getvalue())

# if __name__ == '__main__':
#     t=int(input())
#     for cases in range(t):
#         s,p =input().strip().split()
#         print(strstr(s,p))


# # } Driver Code Ends

# Method 3:
# '''
#     Your task is to return the index of the pattern
#     present in the given string.
    
#     Function Arguments: s (given text), p(given pattern)
#     Return Type: Integer.
    
# '''
# def strstr(s,p):
#     #code here
#     lenp = len(p)
#     a= 0
#     for i in range(len(s) - lenp + 1):
#         if s[i:i+lenp] == p:
#             return i
#     return -1
        



# #{ 
# #  Driver Code Starts
# #Contributed by : Nagendra Jha

# import atexit
# import io
# import sys

# _INPUT_LINES = sys.stdin.read().splitlines()
# input = iter(_INPUT_LINES).__next__
# _OUTPUT_BUFFER = io.StringIO()
# sys.stdout = _OUTPUT_BUFFER

# @atexit.register

# def write():
#     sys.__stdout__.write(_OUTPUT_BUFFER.getvalue())

# if __name__ == '__main__':
#     t=int(input())
#     for cases in range(t):
#         s,p =input().strip().split()
#         print(strstr(s,p))


# # } Driver Code Ends


# Method 4:
# '''
#     Your task is to return the index of the pattern
#     present in the given string.
    
#     Function Arguments: s (given text), p(given pattern)
#     Return Type: Integer.
    
# '''
# def strstr(s,p):
#     #code here
#     lenp = len(p)
#     a= 0
#     for i in range(len(s) - lenp + 1):
#         if s[i:i+lenp] == p:
#             return i
#         else:
#             a+=1
#     if a == len(s)-len(p)+1:
#         return -1
        



# #{ 
# #  Driver Code Starts
# #Contributed by : Nagendra Jha

# import atexit
# import io
# import sys

# _INPUT_LINES = sys.stdin.read().splitlines()
# input = iter(_INPUT_LINES).__next__
# _OUTPUT_BUFFER = io.StringIO()
# sys.stdout = _OUTPUT_BUFFER

# @atexit.register

# def write():
#     sys.__stdout__.write(_OUTPUT_BUFFER.getvalue())

# if __name__ == '__main__':
#     t=int(input())
#     for cases in range(t):
#         s,p =input().strip().split()
#         print(strstr(s,p))


# # } Driver Code Ends