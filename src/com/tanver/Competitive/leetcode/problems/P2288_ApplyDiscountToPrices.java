package com.tanver.Competitive.leetcode.problems;

public class P2288_ApplyDiscountToPrices {

    public String discountPrices1(String sentence, int discount) {
        StringBuilder sb = new StringBuilder();
        String tempPrice = "";
        boolean isDollar = false;
        sb.append(sentence.charAt(0));
        if (sentence.charAt(0) == '$')
            isDollar = true;
        for (int i = 1; i < sentence.length(); i++) {
            if (sentence.charAt(i - 1) == ' ' && sentence.charAt(i) == '$') {
                isDollar = true;
                sb.append('$');
            } else if (isDollar) {
                if (sentence.charAt(i) == ' ') {
                    if (!tempPrice.equals("")) {
                        String result = getDiscountedPrice(Long.parseLong(tempPrice), discount);
                        sb.append(result);
                    }
                    sb.append(' ');
                    isDollar = false;
                    tempPrice = "";
                } else if (!Character.isDigit(sentence.charAt(i))) {
                    sb.append(tempPrice).append(sentence.charAt(i));
                    tempPrice = "";
                    isDollar = false;
                } else
                    tempPrice += sentence.charAt(i);
            } else {
                sb.append(sentence.charAt(i));
            }
        }
        if (tempPrice.length() > 0)
            sb.append(getDiscountedPrice(Long.parseLong(tempPrice), discount));
        return sb.toString();
    }

    public String discountPrices2(String sentence, int discount) {
        String x[] = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : x) {
            if (isPrice(s))
                sb.append('$').append(getDiscountedPrice((long) Double.parseDouble(s.substring(1)),
                        discount)).append(" ");
            else sb.append(s).append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    boolean isPrice(String s) {
        return s.startsWith("$") && s.substring(1).matches("\\d+");
    }

    private String getDiscountedPrice(long price, int discount) {
        double ans = price - ((double) price * discount / 100.00);
        return String.format("%.2f", ans);
    }

    public static void main(String[] args) {

    }

}
