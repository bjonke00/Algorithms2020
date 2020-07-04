package com.algorithmpractice.leetcode;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
//Every email consists of a local name and a domain name, separated by the @ sign.
//        For example, in alice@leetcode.com, alice is the local name, and leetcode.com is the domain name.
//        Besides lowercase letters, these emails may contain '.'s or '+'s.
//        If you add periods ('.') between some characters in the local name part of an email address, mail sent there will be forwarded to the same address without dots in the local name.  For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.  (Note that this rule does not apply for domain names.)
//        If you add a plus ('+') in the local name, everything after the first plus sign will be ignored. This allows certain emails to be filtered, for example m.y+name@email.com will be forwarded to my@email.com.  (Again, this rule does not apply for domain names.)
//It is possible to use both of these rules at the same time.
//        Given a list of emails, we send one email to each address in the list.  How many different addresses actually receive mails?
public class UniqueEmailAddresses {
    static public int numUniqueEmails(String[] emails) {
        //create a set of unique emails
        Set<String> uniqueEmails = new HashSet();

        //loop through the emails and add to set
        for(String s : emails){
            StringBuilder sb = new StringBuilder(s);
            String user = null;
            if(s.contains("+")){
                user = sb.substring(0, sb.indexOf("+"));
            }else{
                user = sb.substring(0, sb.indexOf("@"));
            }
            user = user.replaceAll("\\.","");
            String domain = sb.substring(sb.indexOf("@"),s.length());
            uniqueEmails.add(user+domain);
        }

        //return the amount of unique emails
        return uniqueEmails.size();
    }

    @Test
    public void test() {
        int output = numUniqueEmails(new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"});
        assertEquals(2,output);
    }

    @Test
    public void test1() {
        int output = numUniqueEmails(new String[]{"test.email+alex@leetcode.com", "test.email@leetcode.com"});
        assertEquals(1,output);
    }

}
