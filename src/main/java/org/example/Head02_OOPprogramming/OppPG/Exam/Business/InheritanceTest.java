package org.example.Head02_OOPprogramming.OppPG.Exam.Business;


    public class InheritanceTest {
        public static void main(String[] args) {
            User u = new PersonalUser("U001", "Alice", "alice@example.com");
            u.printUserInfo();

            User b = new BusinessUser("U002", "Big show", "bigshow@gamil.com", "WWE");
            b.printUserInfo();
        }
    }

