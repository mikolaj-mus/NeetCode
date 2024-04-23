class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] newArr = new int[nums.length * 2];

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = nums[i % nums.length];
        }

        return newArr;
    }
}