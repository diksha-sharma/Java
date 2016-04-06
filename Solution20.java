/**
 * Created by dxs13 on 3/19/2016.
 */
/*
A palindrome is a string that reads the same from left to right as it does from right to left.

Given a string, SS, of NN lowercase English letters, we define a kk-length rotation as cutting the first kk characters from the beginning of SS and appending them to the end of SS. For each SS, there are NN possible kk-length rotations (where 0≤k<N0≤k<N). See the Explanation section for examples.

Given NN and SS, find all NN kk-length rotations of SS; for each rotated string, SkSk, print the maximum possible length of any palindromic substring of SkSk on a new line.

Input Format

The first line contains an integer, NN (the length of SS).
The second line contains a single string, SS.

Constraints

1≤N≤5×1051≤N≤5×105
0≤k<N0≤k<N
S is comprised of lowercase English letters.S is comprised of lowercase English letters.
Output Format

There should be NN lines of output, where each line kk contains an integer denoting the maximum length of any palindromic substring of rotation SkSk.
Sample Input 0

13
aaaaabbbbaaaa
Sample Output 0

12
12
10
8
8
9
11
13
11
9
8
8
10
Sample Input 1

7
cacbbba
Sample Output 1

3
3
3
3
3
3
3
Sample Input 2

12
eededdeedede
Sample Output 2

5
7
7
7
7
9
9
9
9
7
5
4
Explanation

Consider Sample Case 1, where S="cacbbba"S="cacbbba".

The possible rotations, SkSk, for string SS are:
S0="cacbbba"S0="cacbbba".
S1="acbbbac"S1="acbbbac"
S2="cbbbaca"S2="cbbbaca"
S3="bbbacac"S3="bbbacac"
S4="bbacacb"S4="bbacacb"
S5="bacacbb"S5="bacacbb"
S6="acacbbb"S6="acacbbb"

The longest palindromic substrings for each SkSk are:
S0: "cac"S0: "cac" and "bbb""bbb", so we print their length (33) on a new line.
S1: "bbb"S1: "bbb", so we print its length (33) on a new line.
S2: "bbb"S2: "bbb" and "aca""aca", so we print their length (33) on a new line.
S3: "bbb", "aca",S3: "bbb", "aca", and "cac""cac", so we print their length (33) on a new line.
S4: "aca"S4: "aca" and "cac""cac", so we print their length (33) on a new line.
S5: "aca"S5: "aca" and "cac""cac", so we print their length (33) on a new line.
S6: "aca", "cac",S6: "aca", "cac", and "bbb""bbb", so we print their length (33) on a new line.
 */
public class Solution20 {
}
