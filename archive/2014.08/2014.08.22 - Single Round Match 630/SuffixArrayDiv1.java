package net.egork;

import net.egork.misc.ArrayUtils;

public class SuffixArrayDiv1 {
    public int minimalCharacters(int[] SA) {
		int count = SA.length;
		int answer = 1;
		int[] at = ArrayUtils.reversePermutation(SA);
		for (int i = 1; i < count; i++) {
			if (SA[i] == count - 1 || SA[i - 1] != count - 1 && at[SA[i - 1] + 1] > at[SA[i] + 1]) {
				answer++;
			}
		}
		return answer;
    }
}
