package com.tanver.Competitive.leetcode.problems;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P648_ReplaceWords {

    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String> set = new HashSet<>(dictionary);
        StringBuilder newSentence = new StringBuilder();
        StringBuilder word = new StringBuilder();
        boolean isContainsDictionary = false;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                if (!isContainsDictionary)
                    newSentence.append(word).append(' ');
                word.setLength(0);
                isContainsDictionary = false;
            } else {
                if (isContainsDictionary)
                    continue;
                word.append(sentence.charAt(i));
                if (set.contains(word.toString())) {
                    newSentence.append(word).append(' ');
                    isContainsDictionary = true;
                }
            }
        }
        if (!isContainsDictionary)
            newSentence.append(word).append(' ');
        return newSentence.substring(0, newSentence.length() - 1);
    }

    public String replaceWords2(List<String> dictionary, String sentence) {
        if (dictionary == null || dictionary.size() == 0)
            return sentence;
        Set<String> set = new HashSet<>(dictionary);

        StringBuilder newSentence = new StringBuilder();
        String[] words = sentence.split("\\s+");

        for (String word : words) {
            String prefix = "";
            for (int i = 1; i <= word.length(); i++) {
                prefix = word.substring(0, i);
                if (set.contains(prefix)) break;
            }
            newSentence.append(" ").append(prefix);
        }
        return newSentence.deleteCharAt(0).toString();
    }

    public static void main(String[] args) {
        List<String> dictionary = List.of("cat", "bat", "rat");
        System.out.println(new P648_ReplaceWords().replaceWords(dictionary, "the cattle was rattled by the baattery"));
//                "ikkbp miszkays wqjferqoxjwvbieyk gvcfldkiavww vhokchxz dvypwyb bxahfzcfanteibiltins +" +
//                        "ueebf lqhflvwxksi dco kddxmckhvqifbuzkhstp wc ytzzlm gximjuhzfdjuamhsu gdkbmhpnvy ifvifheoxqlbosfww " +
//                        "mengfdydekwttkhbzenk wjhmmyltmeufqvcpcxg hthcuovils ldipovluo aiprogn nusquzpmnogtjkklfhta klxvvlvyh " +
//                        "nxzgnrveghc mpppfhzjkbucv cqcft uwmahhqradjtf iaaasabqqzmbcig zcpvpyypsmodtoiif qjuiqtfhzcpnmtk" +
//                        " yzfragcextvx ivnvgkaqs iplazv jurtsyh gzixfeugj rnukjgtjpim hscyhgoru aledyrmzwhsz xbahcwfwm hzd " +
//                        "ygelddphxnbh rvjxtlqfnlmwdoezh zawfkko iwhkcddxgpqtdrjrcv bbfj mhs nenrqfkbf spfpazr wrkjiwyf cw dtd " +
//                        "cqibzmuuhukwylrnld dtaxhddidfwqs bgnnoxgyynol hg dijhrrpnwjlju muzzrrsypzgwvblf zbugltrnyzbg hktdviastoireyiqf" +
//                        " qvufxgcixvhrjqtna ipfzhuvgo daee r nlipyfszvxlwqw yoq dewpgtcrzausqwhh qzsaobsghgm ichlpsjlsrwzhbyfhm ksenb" +
//                        " bqprarpgnyemzwifqzz oai pnqottd nygesjtlpala qmxixtooxtbrzyorn gyvukjpc s mxhlkdaycskj uvwmerplaibeknltuvd ocnn" +
//                " frotscysdyclrc ckcttaceuuxzcghw pxbd oklwhcppuziixpvihihp"));
    }

}
