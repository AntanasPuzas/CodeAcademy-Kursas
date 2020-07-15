package com.company;

public class PVMValidator {
    static boolean validatePVM(int[] digits) {
        int C9 = calculateC9(digits);
        if (digits[7] != 1) {
            return false;
        } else if (C9 != digits[8]) {
            return false;
        }
        return true;
    }

    protected static int calculateC9(int[] digits) {
        int A1 = digits[0] + 2 * digits[1] + 3 * digits[2] + 4 * digits[3] + 5 * digits[4] +
                6 * digits[5] + 7 * digits[6] + 8 * digits[7];
        int R1 = A1 % 11;
        if (R1 != 10)
        {
            return R1;
        } else {
            int A2 = 3 * digits[0] + 4 * digits[1] + 5 * digits[2] + 6 * digits[3] + 7 * digits[4] +
                    8 * digits[5] + 9 * digits[6] + digits[7];
            int R2 = A2 % 11;
            if (R2 == 10) {
                return 0;
            } else {
                return R2;
            }
        }
    }
}
