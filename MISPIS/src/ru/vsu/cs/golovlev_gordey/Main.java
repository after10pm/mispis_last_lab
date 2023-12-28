package ru.vsu.cs.golovlev_gordey;

public class Main {
    public static void main(String[] args) {
        Faculty fkn = new Faculty("FKN");
        Institute toizi = new Institute("ISIT", "297");
        Institute is = new Institute("VVIP", "387");
        Institute itu = new Institute("MKN", "312п");
        Institute piit = new Institute("PIIT", "380");
        fkn.setInstitutes(new Institute[]{toizi, is, itu, piit});
        ResearchAssociate first_employee = new ResearchAssociate(521, "Golovlev Gordey Igorevich",
                "machine_learning");
        ResearchAssociate second_employee = new ResearchAssociate(321, "Denis Ryindin Dmitrievich",
                "architecture_of_data_bases");
        ResearchAssociate third_employee = new ResearchAssociate(645, "Ivanov Ivan Ivanovich",
                "\n" +
                        "algorithms_and_data_structures");
        Institute[] fkn_institutes = fkn.getInstitutes();
        System.out.println("\n" +
                "Departments " + fkn.getName() + ":");
        for (Institute fknInstitute : fkn_institutes) {
            System.out.println(fknInstitute.getName());
        }
        System.out.println("\n");
    }
}
