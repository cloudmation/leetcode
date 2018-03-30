package main;

public class RomainToInt {

        public int romanToInt(String s) {
            int pre = toInt(s.charAt(0));
            int total = pre;
            for(int i = 1; i< s.length();i++){
                int cur = toInt(s.charAt(i));
                total += (cur > pre) ? (cur - 2 * pre) : cur;
                pre = cur;
            }
            return total;
        }

        private int toInt(char c) {
            switch (c)
            {
                case 'I':
                    return 1;
                case 'V':
                    return 5;
                case 'X':
                    return 10;
                case 'L':
                    return 50;
                case 'C':
                    return 100;
                case 'D':
                    return 500;
                case 'M':
                    return 1000;
                default:
                    return 0;

            }
        }
}
