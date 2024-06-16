#User function Template for python3

def getMinMax( a, n):
    
        maxa = a[0]
        mina = a[0]
        for i in range(1, n):
            if a[i] > maxa:
                maxa = a[i]
            if a[i] < mina:
                mina = a[i]
        return mina, maxa
    
    

