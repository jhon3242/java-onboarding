package onboarding;

import java.util.List;

class Problem1 {
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer;

        try {
            Validator.isValidate(pobi, crong);
            answer =  whoIsWin(pobi, crong);
        } catch (Exception error) {
            answer = -1;
        }

        return answer;
    }

    private static int getMaxNum(List<Integer> page){
        int result = 0;

        result = Util.getMax(result, getDigitSum(page.get(LEFT)) + getDigitSum(page.get(RIGHT)));
        result = Util.getMax(result, getDigitMultiple(page.get(LEFT)) + getDigitMultiple(page.get(RIGHT)));
        return result;
    }

    private static int getDigitSum(Integer num){
        int result = 0;
        int div = 10;

        while (num != 0){
            result += num % div;
            num /= div;
        }
        return result;
    }

    private static int getDigitMultiple(Integer num){
        int result = 1;
        int div = 10;

        while (num != 0){
            result *= num % div;
            num /= div;
        }
        return result;
    }

    private static int whoIsWin(List<Integer> pobi, List<Integer> crong){
        if (getMaxNum(pobi) < getMaxNum(crong)) {
            return 2;
        }
        if (getMaxNum(pobi) > getMaxNum(crong)) {
            return 1;
        }
        if (getMaxNum(pobi) == getMaxNum(crong)) {
            return 0;
        }
        throw new IllegalStateException("Can't find who is win");
    }

    static class Validator {
        protected static void isValidate(List<Integer> pobi, List<Integer> crong){
            isCorrectSize(pobi);
            isCorrectSize(crong);
            isCorrectRange(pobi);
            isCorrectRange(crong);
            isConsecutive(pobi);
            isConsecutive(crong);
            isLeftOdd(pobi);
            isLeftOdd(crong);
            isRightEven(pobi);
            isRightEven(crong);
        }

        private static void isCorrectSize(List<Integer> array){
            if (array.size() != 2) {
                throw new IllegalArgumentException("wrong array size");
            }
        }

        private static void isCorrectRange(List<Integer> array){
            if (array.get(0) <= 1 || array.get(0) >= 399){
                throw new IllegalArgumentException("wrong range");
            }
            if (array.get(1) <= 2 || array.get(1) >= 400){
                throw new IllegalArgumentException("wrong range");
            }
        }

        private static void isConsecutive(List<Integer> array){
            if (array.get(1) - array.get(0) != 1){
                throw new IllegalArgumentException("is not consecutive");
            }
        }

        private static void isLeftOdd(List<Integer> array){
            if (array.get(0) % 2 != 1){
                throw new IllegalArgumentException("left is not odd");
            }
        }

        private static void isRightEven(List<Integer> array){
            if (array.get(1) % 2 != 0){
                throw new IllegalArgumentException("right is not even");
            }
        }
    }
}


