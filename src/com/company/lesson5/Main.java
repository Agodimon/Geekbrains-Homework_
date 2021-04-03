package com.company.lesson5;



public class Main {
    public static void main(String[] args) {
        Staff[] staff = getStaff();
        selectEmployeesUpTo40(staff);
    }

    private static void selectEmployeesUpTo40(Staff[] staff) {
        for (int i = 0; i < staff.length; i++) {
          if(staff[i].getAge()>40){
             staff[i].getInfo();
            }
        }
    }

    private static Staff[] getStaff() {
        Staff[] staff=new Staff[5];
        staff[0]=new Staff("Jobs P.K.","engineer","Jobs@mail.ru","89825486232",20);
        staff[1]=new Staff("Volkov P.F.","engineer","Volkov@mail.ru","89822562323",50);
        staff[2]=new Staff("Popov A.A.","Developer","Popov@mail.ru","89227772524",35);
        staff[3]=new Staff("Romanov S.G.","Manager","Romanov@mail.ru","89025448254",75);
        staff[4]=new Staff("Tyson M.","Planner","Tyson@mail.ru","89126582341",85);
        return staff;
    }

}