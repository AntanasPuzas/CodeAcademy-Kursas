package ScuffedValidator;

import com.company.PVMValidator;

public class PVMValidatorEdited extends PVMValidator {
    public static boolean validatePVM(int[] digits) {
        int C9 = calculateC9(digits);
        if (digits[7] == 1) {
            return false;
        } else if (C9 != digits[8]) {
            return false;
        }
        return true;
    }
}
