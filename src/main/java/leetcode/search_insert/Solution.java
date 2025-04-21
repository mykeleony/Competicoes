package leetcode.search_insert;

// Resolução do problema: https://leetcode.com/problems/search-insert-position
public class Solution {
    public static void main(String[] args) {
        System.out.println("Target 2 in [1,3]: " + searchInsert(new int[]{1, 3}, 0));
    }

    public static int searchInsert(int[] nums, int target) {
        int esquerda = 0;
        int direita = nums.length - 1;

        while (esquerda <= direita) {
            int meio = (esquerda + direita) / 2;

            if (nums[meio] == target) {
                return meio;
            } else if (nums[meio] < target) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }

        return esquerda;
    }
}
