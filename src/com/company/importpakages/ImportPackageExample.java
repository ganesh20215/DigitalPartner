package com.company.importpakages;

//import com.company.digital.*;
//import LanguageFundamentals;
import com.company.digital.studysubpackage.SubClassExample;

public class ImportPackageExample {
    public static void main(String[] args) {
        com.company.digital.LanguageFundamentals h = new com.company.digital.LanguageFundamentals();
        com.company.inheritance.LanguageFundamentals h1 = new com.company.inheritance.LanguageFundamentals();
        SubClassExample se = new SubClassExample();
        h.check();

    }
}
