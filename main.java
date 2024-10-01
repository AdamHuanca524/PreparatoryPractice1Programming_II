public class main {
    public static void main(String[] args) {

        //Clothe Class

        Clothe shirt = new Clothe("T-shirt", "Casual Wear", 101, "Blue", "M");
        Clothe jeans = new Clothe("Jeans", "Denim", 102, "Black", "L");
        Clothe jacket = new Clothe("Jacket", "Outerwear", 103, "Green", "XL");
        Clothe dress = new Clothe("Dress", "Evening Wear", 104, "Red", "S");
        Clothe hoodie = new Clothe("Hoodie", "Sportswear", 105, "Gray", "L");
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("                                   Products: Clothes");
        System.out.println(shirt.getName());
        System.out.println(jeans.getName());
        System.out.println(jacket.getName());
        System.out.println(dress.getName());
        System.out.println(hoodie.getName());

        Food bread = new Food("Whole Wheat Bread", "Bakery", 201, "2024-10-16");
        Food milk = new Food("Organic Milk", "Dairy", 202, "2024-10-15");
        Food cheese = new Food("Cheddar Cheese", "Dairy", 203, "2024-10-20");
        Food apples = new Food("Red Apples", "Fruit", 204, "2024-10-05");
        Food yogurt = new Food("Greek Yogurt", "Dairy", 205, "2024-10-25");

        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("                                   Products: Foods");
        System.out.print(bread.getName() + ": "); bread.alert();
        System.out.print(milk.getName() + ": "); milk.alert();
        System.out.print(cheese.getName() + ": "); cheese.alert();
        System.out.print(apples.getName() + ": "); apples.alert();
        System.out.print(yogurt.getName() + ": "); yogurt.alert();

        Electronic laptop = new Electronic("Laptop", "Computers", 101, "Dell");
        Electronic smartphone = new Electronic("Smartphone", "Mobile Devices", 102, "Apple");
        Electronic television = new Electronic("Television", "Home Appliances", 103, "Samsung");
        Electronic smartWatch = new Electronic("Smart Watch", "Wearables", 104, "Fitbit");
        Electronic camera = new Electronic("Digital Camera", "Cameras", 105, "Canon");

        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("                                   Products: Electronics");
        System.out.println(laptop.getName());
        System.out.println(smartphone.getName());
        System.out.println(television.getName());
        System.out.println(smartWatch.getName());
        System.out.println(camera.getName());

        Atm employee1 = new Atm("John Doe", "12345678", 2550.00f, "Day");
        Atm employee2 = new Atm("Jane Smith", "87654321", 2700.50f, "Night");
        Atm employee3 = new Atm("Alice Johnson", "11223344", 2800.75f, "Evening");
        Atm employee4 = new Atm("Bob Brown", "44332211", 2600.90f, "Day");
        Atm employee5 = new Atm("Emily Davis", "99887766", 2500.25f, "Night");

        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("                                   Employee: ATM");
        System.out.println(employee1.getName() + ": " + employee1.getEmployeeCode()); employee1.pay();
        System.out.println(employee2.getName() + ": " + employee2.getEmployeeCode()); employee2.pay();
        System.out.println(employee3.getName() + ": " + employee3.getEmployeeCode()); employee3.pay();
        System.out.println(employee4.getName() + ": " + employee4.getEmployeeCode()); employee4.pay();
        System.out.println(employee5.getName() + ": " + employee5.getEmployeeCode()); employee5.pay();

        Sheller sheller1 = new Sheller("Michael Scott", "11223355", 2650.00f, "Day", 500);
        Sheller sheller2 = new Sheller("Pam Beesly", "33445566", 2700.50f, "Night", 450);
        Sheller sheller3 = new Sheller("Jim Halpert", "55667788", 2800.75f, "Evening", 550);
        Sheller sheller4 = new Sheller("Dwight Schrute", "77889900", 2600.90f, "Day", 600);
        Sheller sheller5 = new Sheller("Stanley Hudson", "99887766", 2550.25f, "Night", 475);

        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("                                   Employee: Sheller");
        System.out.println(sheller1.getName() + ": " + sheller1.getEmployeeCode() + ", Goal: " + sheller1.getShellGoal()); sheller1.pay();
        System.out.println(sheller2.getName() + ": " + sheller2.getEmployeeCode() + ", Goal: " + sheller2.getShellGoal()); sheller2.pay();
        System.out.println(sheller3.getName() + ": " + sheller3.getEmployeeCode() + ", Goal: " + sheller3.getShellGoal()); sheller3.pay();
        System.out.println(sheller4.getName() + ": " + sheller4.getEmployeeCode() + ", Goal: " + sheller4.getShellGoal()); sheller4.pay();
        System.out.println(sheller5.getName() + ": " + sheller5.getEmployeeCode() + ", Goal: " + sheller5.getShellGoal()); sheller5.pay();

        Manager manager1 = new Manager("Laura Stevens", "11220033", 4500.00f, "Downtown Branch");
        Manager manager2 = new Manager("Mark Johnson", "33445566", 4700.50f, "Uptown Branch");
        Manager manager3 = new Manager("Sara Phillips", "55667788", 5000.75f, "Eastside Branch");
        Manager manager4 = new Manager("Paul Brown", "77889900", 4800.90f, "Westside Branch");
        Manager manager5 = new Manager("Anna Taylor", "99887766", 4600.25f, "Central Branch");

        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("                                   Employee: Manager");
        System.out.println(manager1.getName() + ": " + manager1.getEmployeeCode() + ", Branch: " + manager1.getAssignedBranch()); manager1.pay();
        System.out.println(manager2.getName() + ": " + manager2.getEmployeeCode() + ", Branch: " + manager2.getAssignedBranch()); manager2.pay();
        System.out.println(manager3.getName() + ": " + manager3.getEmployeeCode() + ", Branch: " + manager3.getAssignedBranch()); manager3.pay();
        System.out.println(manager4.getName() + ": " + manager4.getEmployeeCode() + ", Branch: " + manager4.getAssignedBranch()); manager4.pay();
        System.out.println(manager5.getName() + ": " + manager5.getEmployeeCode() + ", Branch: " + manager5.getAssignedBranch()); manager5.pay();

        CasualClient client1 = new CasualClient("Alice Morgan", 12345678, 987654321, "2024-08-01");
        CasualClient client2 = new CasualClient("Bob Williams", 23456789, 876543210, "2024-07-15");
        CasualClient client3 = new CasualClient("Catherine Wilson", 34567890, 765432109, "2024-06-20");
        CasualClient client4 = new CasualClient("David Brown", 45678901, 654321098, "2024-09-05");
        CasualClient client5 = new CasualClient("Emma Taylor", 56789012, 543210987, "2024-05-30");

        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("                                 Client: Casual Client");
        System.out.println(client1.getName() + ": " + client1.getCI() + ", Last Purchase: " + client1.getLastPurchase());
        System.out.println(client2.getName() + ": " + client2.getCI() + ", Last Purchase: " + client2.getLastPurchase());
        System.out.println(client3.getName() + ": " + client3.getCI() + ", Last Purchase: " + client3.getLastPurchase());
        System.out.println(client4.getName() + ": " + client4.getCI() + ", Last Purchase: " + client4.getLastPurchase());
        System.out.println(client5.getName() + ": " + client5.getCI() + ", Last Purchase: " + client5.getLastPurchase());

        Partner partner1 = new Partner("John Doe", 12345678, 987654321, "P123", 1500.75f, "2023-03-14");
        Partner partner2 = new Partner("Jane Smith", 23456789, 876543210, "P124", 1200.50f, "2023-07-28");
        Partner partner3 = new Partner("Michael Johnson", 34567890, 765432109, "P125", 1800.25f, "2023-12-05");
        Partner partner4 = new Partner("Emily Davis", 45678901, 654321098, "P126", 1600.90f, "2023-09-11");
        Partner partner5 = new Partner("Daniel Williams", 56789012, 543210987, "P127", 1700.40f, "2023-01-22");

        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("                                 Client: Partner");
        System.out.println(partner1.getName() + ": " + partner1.getID()); partner1.bono();
        System.out.println(partner2.getName() + ": " + partner2.getID()); partner2.bono();
        System.out.println(partner3.getName() + ": " + partner3.getID()); partner3.bono();
        System.out.println(partner4.getName() + ": " + partner4.getID()); partner4.bono();
        System.out.println(partner5.getName() + ": " + partner5.getID()); partner5.bono();

    }

}
