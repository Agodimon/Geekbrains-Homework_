package com.company.lesson5;



public class Main {
    public static void main(String[] args) {
        Staffs[] staffs = getStaff();
        selectEmployeesUpTo40(staffs);

    }

    private static void selectEmployeesUpTo40(Staffs[] staffs) {
        for (Staffs value : staffs) {
            if (value.getAge() > 40) {
                value.getInfo();
            }
        }
    }

    private static Staffs[] getStaff() {
        Staffs[] staffs =new Staffs[5];
        staffs[0]=new Staffs("Jobs P.K.","engineer","Jobs@mail.ru","89825486232",20);
        staffs[1]=new Staffs("Volkov P.F.","engineer","Volkov@mail.ru","89822562323",50);
        staffs[2]=new Staffs("Popov A.A.","Developer","Popov@mail.ru","89227772524",35);
        staffs[3]=new Staffs("Romanov S.G.","Manager","Romanov@mail.ru","89025448254",75);
        staffs[4]=new Staffs("Tyson M.","Planner","Tyson@mail.ru","89126582341",85);
        return staffs;
    }

}