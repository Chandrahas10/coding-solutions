# Activity Selection

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two arrays **start[]** and  **finish[]**, where start[i] and finish[i] represent the start time and finish time of the i-th activity, find the maximum number of activities that a single person can perform.

A person can perform only one activity at a time, and no two selected activities can overlap. If an activity finishes at time x, the next selected activity must start at a time greater than x.

 **Examples:** 

```
Input: start[] = [1, 3, 0, 5, 8, 5], finish[] = [2, 4, 6, 7, 9, 9]
Output: 4
Explanation: One possible selection is activities {0, 1, 3, 4} with time intervals (1, 2), (3, 4), (5, 7), and (8, 9). Each activity starts after the previous one finishes, so a total of 4 activities can be performed.
```

```
Input: start[] = [10, 12, 20], finish[] = [20, 25, 30]
Output: 1
Explanation: Activity 0 finishes at time 20, and activity 2 also starts at time 20. Since the next activity must start after the previous one finishes, they cannot both be selected. Hence, only one activity can be performed.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-12T11:15:26.383Z  

```java
import java.util.Arrays;

class Solution {
    public int activitySelection(int[] start, int[] finish) {

        int n = start.length;

        if (n == 0)
            return 0;

        int[][] activities = new int[n][2];

        for (int i = 0; i < n; i++) {
            activities[i][0] = start[i];
            activities[i][1] = finish[i];
        }

        // Sort by finish time ASCENDING
        Arrays.sort(activities, (a, b) -> Integer.compare(a[1], b[1]));

        int cnt = 1;
        int lastFinish = activities[0][1];

        for (int i = 1; i < n; i++) {

            if (activities[i][0] > lastFinish) {
                cnt++;
                lastFinish = activities[i][1];
            }
        }

        return cnt;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/activity-selection-1587115620/1)