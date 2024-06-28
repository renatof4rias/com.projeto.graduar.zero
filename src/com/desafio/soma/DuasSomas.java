package com.desafio.soma;

import java.util.HashMap;
import java.util.Map;

public class DuasSomas {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        System.out.println("Encontrando dois números no array que somam " + target + ":");
        int[] indices = duasSomas(nums, target);

        if (indices[0] != -1 && indices[1] != -1) {
            System.out.println("Índices encontrados: " + indices[0] + " e " + indices[1]);
            System.out.println("Valores correspondentes: " + nums[indices[0]] + " e " + nums[indices[1]]);
        } else {
            System.out.println("Não foi possível encontrar dois números no array que somam " + target);
        }
    }
    public static int[] duasSomas(int[] nums, int target) {
        int n = nums.length;
        int[] indices = new int[2];

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                    return indices;
                }
            }
        }

        return null;
    }
}
