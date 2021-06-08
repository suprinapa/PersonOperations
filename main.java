import java.util.ArrayList;

public class main {
    public static void main(String args[]) {

        Courses myCourse1 = new Courses();
        myCourse1.Course_id = 1;
        myCourse1.Course_name = "Java";

        Courses myCourse2 = new Courses();
        myCourse2.Course_id = 2;
        myCourse2.Course_name = "PHP";

        Vehicle vehicle1 = new Vehicle();
        vehicle1.VehicleId = 1;
        vehicle1.VehicleName = "Bike";

        Vehicle vehicle2 = new Vehicle();
        vehicle2.VehicleId = 2;
        vehicle2.VehicleName = "Car";


        Personoperations myPerson = new Personoperations();
        Person p = new Person();
        p.PersonId = 1;
        p.FirstName = "Suprina";
        p.LastName = "Paudel";
        p.YearOfBirth = 1998;
        p.Country = "Nepal";
        p.Gender = "Female";
        p.PersonCourses.add(myCourse1);
        p.PersonCourses.add(myCourse2);
        p.PersonVehicles.add(vehicle1);
        p.PersonVehicles.add(vehicle2);

        Person n = new Person();
        n.PersonId = 1;
        n.FirstName = "Narayan";
        n.LastName = "Paudel";
        n.YearOfBirth = 1998;
        n.Country = "Nepal";
        n.Gender = "Female";


        myPerson.AddPerson(p);
        myPerson.AddPerson(n);
        myPerson.PrintItems();

        Person found = myPerson.FindPerson("Suprina22");
        if (found != null){
            System.out.println(found.FirstName);
          }








    }
}
