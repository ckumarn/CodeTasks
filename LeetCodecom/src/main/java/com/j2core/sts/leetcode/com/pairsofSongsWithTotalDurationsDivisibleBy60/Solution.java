package com.j2core.sts.leetcode.com.pairsofSongsWithTotalDurationsDivisibleBy60;

public class Solution {


    public int numPairsDivisibleBy60(int[] time) {

        int[] count = new int[60];
        int result = 0;

        for(int i = 0; i < time.length; i++) {

            result += count[(60 - (time[i]%60))%60];

            count[time[i]%60]++;
        }
        return result;
    }
}
