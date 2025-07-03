package lib;

public class PasswordValidatorTest{

    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        String pw = "123";
        PasswordStrength result1 = PasswordValidator.validate(pw);
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1: "+pw+" :Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 :"+pw+":FAILED: Expected INVALID but got " + result1);
        }

        // --- เขียน Test Case อื่นๆ ต่อ ---
         // Test Case 2: รหัสผ่านทั้งหมดเป็นตัวพิมพ์เล็กควรจะ WEAK
         pw="abcdefghijklmnop";
        PasswordStrength result2 = PasswordValidator.validate(pw);
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 :"+pw+":Passed:your password is too WEAK.");
        } else {
            System.out.println("Test Case 2 :"+pw+":FAILED: Expected WEAK but got " + result2);
        }

         // Test Case 3: รหัสผ่านที่มีความปลอดภัยระดับปานกลางควรจะ MEDIUM
         pw="Abc180449";
        PasswordStrength result3 = PasswordValidator.validate(pw);
        if (result3 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 3 :"+pw+": Passed:your password is MEDIUM.");
        } else {
            System.out.println("Test Case 3 :"+pw+":FAILED: Expected MEDIUM but got " + result3);
        }
         // Test Case 4: รหัสผ่านที่มีตัวอักษรทั้งพิมพ์ใหญ่และเล็ก ตัวอักขระพิเศษ ตัวอักษร ความยาว 8 ตัวอักษร  STRONG
         pw="PArinda2549";
        PasswordStrength result4 = PasswordValidator.validate(pw);
        if (result4 == PasswordStrength.STRONG) {
            System.out.println("Test Case 4 :"+pw+":Passed:your password is too STRONG.");
        } else {
            System.out.println("Test Case 4 :"+pw+":FAILED: Expected STRONG but got " + result4);
        }

        System.out.println("--------------------------------");
    }
}
