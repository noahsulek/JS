
public abstract class Person implements Comparable <Person>
{
    private String name;
    
    public Person()
    {
        name = "No name yet";
        
    }
    
    public Person(String initialName)
    {
        setName(initialName);
    }
    
    public void setName(String newName)
    {
        name = newName;
    }
    
    public String getName( )
    {
        return name;
    }
   
    public abstract void writeOutput( );
 
    public boolean hasSameName(Person otherPerson)
    {
        return this.name.equalsIgnoreCase(otherPerson.name);
    }
    
    public int compareTo(Person p){
        
        return name.compareTo(p.name);
    }
   
    public String toString() {
        return "Name: " + name;
    }
    
    
}