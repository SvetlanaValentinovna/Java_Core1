package ru.geekbrains.core1;

public class Main {
    public static void main(String[] args) {
        Member member1 = new Member("Slava", 300);
        Member member2 = new Member("Dima", 400);
        Member member3 = new Member("Bill", 150);
        Member member4 = new Member("Alex", 50);
        Team team = new Team("За Свету", member1, member2, member3, member4);
        Course course = new Course(150, 200, 300);

        team.showInfoAboutAllMembers();
        System.out.println();
        course.doIt(team);
        team.showInfoAboutWinners();
    }
}
