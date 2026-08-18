# buy-stock-2

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-18T17:00:58.625Z  

```java
class Solution {
    public int maxProfit(int[] prices) {
        
        int min=prices[0];
        int profit =0;
        
        for(int i=0;i<prices.length;i++){
            min=Math.min(prices[i],min);
            
            profit=Math.max(profit,prices[i]-min);
        }
        
        return profit;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/buy-stock-2/1)