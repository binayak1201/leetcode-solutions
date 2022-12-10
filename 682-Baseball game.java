class Solution {
    public int calPoints(String[] ops) {
        if (ops == null || ops.length == 0) {
            return 0;
        }
        int[] val = new int[ops.length];
        int res = 0;
        int index = -1;
        for (int i = 0; i < ops.length; i++) {
            switch (ops[i]) {
                case "+":
                    res += (val[index] + val[index - 1]);
                    val[index + 1] = val[index] + val[index - 1];
                    index++;
                    break;
                case "D":
                    res += 2 * val[index];
                    index++;
                    val[index] = 2 * val[index - 1];
                    break;
                case "C":
                    res -= val[index];
                    index--;
                    break;
                default:
                    res += Integer.valueOf(ops[i]);
                    index++;
                    val[index] = Integer.valueOf(ops[i]);
            }
        }
        return res;
    }
}
