import java.util.ArrayList;


public class Personoperations {
    private ArrayList<Person> PersonList = new ArrayList<Person>();
   private ArrayList<Courses> PersonCourses = new ArrayList<Courses>();
    private ArrayList<Vehicle> PersonVehicle = new ArrayList<Vehicle>();


    public void AddPerson(Person _person)
    {
        PersonList.add(_person);
    }

    public Person FindPerson(String name)
    { Person Found = null;
        for (int i = 0; i < PersonList.size(); i++)

        { Person CurrentPerson = PersonList.get(i);

            if (CurrentPerson.FirstName== name)
            {
                Found = CurrentPerson;
                break;
            }

        }
        return Found;
    }

    public void EditPerson(int Person_id){

    }



         public void PrintItems()
        {
            for (Person myPerson:PersonList) {
            System.out.println(myPerson.FirstName);
            System.out.println(myPerson.LastName);
            System.out.println(myPerson.YearOfBirth);
            System.out.println(myPerson.Country);
            System.out.println(myPerson.Gender);


        }



            }

        }











